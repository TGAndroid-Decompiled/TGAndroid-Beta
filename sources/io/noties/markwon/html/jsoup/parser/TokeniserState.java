package io.noties.markwon.html.jsoup.parser;

enum TokeniserState {
    Data {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                tokeniser.emit(characterReader.consume());
            } else {
                if (cCurrent == '&') {
                    tokeniser.advanceTransition(TokeniserState.CharacterReferenceInData);
                    return;
                }
                if (cCurrent == '<') {
                    tokeniser.advanceTransition(TokeniserState.TagOpen);
                } else if (cCurrent == 65535) {
                    tokeniser.emit(new Token.EOF());
                } else {
                    tokeniser.emit(characterReader.consumeData());
                }
            }
        }
    },
    CharacterReferenceInData {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Data);
        }
    },
    Rcdata {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else {
                if (cCurrent == '&') {
                    tokeniser.advanceTransition(TokeniserState.CharacterReferenceInRcdata);
                    return;
                }
                if (cCurrent == '<') {
                    tokeniser.advanceTransition(TokeniserState.RcdataLessthanSign);
                } else if (cCurrent == 65535) {
                    tokeniser.emit(new Token.EOF());
                } else {
                    tokeniser.emit(characterReader.consumeToAny('&', '<', 0));
                }
            }
        }
    },
    CharacterReferenceInRcdata {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Rcdata);
        }
    },
    Rawtext {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readData(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readData(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent == 65535) {
                tokeniser.emit(new Token.EOF());
            } else {
                tokeniser.emit(characterReader.consumeTo((char) 0));
            }
        }
    },
    TagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == '!') {
                tokeniser.advanceTransition(TokeniserState.MarkupDeclarationOpen);
                return;
            }
            if (cCurrent == '/') {
                tokeniser.advanceTransition(TokeniserState.EndTagOpen);
                return;
            }
            if (cCurrent == '?') {
                tokeniser.advanceTransition(TokeniserState.BogusComment);
                return;
            }
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(true);
                tokeniser.transition(TokeniserState.TagName);
            } else {
                tokeniser.error(this);
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    EndTagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.Data);
            } else if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.transition(TokeniserState.TagName);
            } else if (characterReader.matches('>')) {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.Data);
            } else {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    TagName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.tagPending.appendTagName(characterReader.consumeTagName());
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == '/') {
                    tokeniser.transition(TokeniserState.SelfClosingStartTag);
                    return;
                }
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                } else if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.transition(TokeniserState.Data);
                    return;
                } else if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                    tokeniser.tagPending.appendTagName(cConsume);
                    return;
                }
            }
            tokeniser.transition(TokeniserState.BeforeAttributeName);
        }
    },
    RcdataLessthanSign {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (characterReader.matchesLetter() && tokeniser.appropriateEndTagName() != null) {
                if (!characterReader.containsIgnoreCase("</" + tokeniser.appropriateEndTagName())) {
                    tokeniser.tagPending = tokeniser.createTagPending(false).name(tokeniser.appropriateEndTagName());
                    tokeniser.emitTagPending();
                    characterReader.unconsume();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
            }
            tokeniser.emit("<");
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                String strConsumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(strConsumeLetterSequence);
                tokeniser.dataBuffer.append(strConsumeLetterSequence);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.transition(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            if (cConsume == '/') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.transition(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            if (cConsume == '>') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.emitTagPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            anythingElse(tokeniser, characterReader);
        }

        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            characterReader.unconsume();
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RawtextLessthanSign {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '!') {
                tokeniser.emit("<!");
                tokeniser.transition(TokeniserState.ScriptDataEscapeStart);
            } else if (cConsume == '/') {
                tokeniser.createTempBuffer();
                tokeniser.transition(TokeniserState.ScriptDataEndTagOpen);
            } else {
                tokeniser.emit("<");
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEndTagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
            } else {
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscapeStartDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
            } else {
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscaped {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent == '-') {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDash);
            } else if (cCurrent == '<') {
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
            }
        }
    },
    ScriptDataEscapedDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else if (cConsume == '-') {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataEscapedDashDash);
            } else if (cConsume == '<') {
                tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    return;
                }
                if (cConsume == '<') {
                    tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
                } else if (cConsume == '>') {
                    tokeniser.emit(cConsume);
                    tokeniser.transition(TokeniserState.ScriptData);
                } else {
                    tokeniser.emit(cConsume);
                    tokeniser.transition(TokeniserState.ScriptDataEscaped);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTempBuffer();
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.emit("<" + characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeStart);
                return;
            }
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent == '-') {
                tokeniser.emit(cCurrent);
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (cCurrent == '<') {
                tokeniser.emit(cCurrent);
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cCurrent == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            } else if (cConsume == '-') {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (cConsume == '<') {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            if (cConsume == '-') {
                tokeniser.emit(cConsume);
                return;
            }
            if (cConsume == '<') {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cConsume == '>') {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptData);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.emit(cConsume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.emit('/');
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.AttributeName);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume == '/') {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                        return;
                    }
                    switch (cConsume) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            tokeniser.emitTagPending();
                            tokeniser.transition(TokeniserState.Data);
                            break;
                        default:
                            tokeniser.tagPending.newAttribute();
                            characterReader.unconsume();
                            tokeniser.transition(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(cConsume);
                tokeniser.transition(TokeniserState.AttributeName);
            }
        }
    },
    AttributeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.tagPending.appendAttributeName(characterReader.consumeToAnySorted(TokeniserState.attributeNameCharsSorted));
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != ' ') {
                    if (cConsume != '\"' && cConsume != '\'') {
                        if (cConsume == '/') {
                            tokeniser.transition(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                        if (cConsume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                        if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                            switch (cConsume) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniser.transition(TokeniserState.BeforeAttributeValue);
                                    break;
                                case '>':
                                    tokeniser.emitTagPending();
                                    tokeniser.transition(TokeniserState.Data);
                                    break;
                                default:
                                    tokeniser.tagPending.appendAttributeName(cConsume);
                                    break;
                            }
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.appendAttributeName(cConsume);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterAttributeName);
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeName((char) 65533);
        }
    },
    AfterAttributeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeName((char) 65533);
                tokeniser.transition(TokeniserState.AttributeName);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume == '/') {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                        return;
                    }
                    switch (cConsume) {
                        case '<':
                            break;
                        case '=':
                            tokeniser.transition(TokeniserState.BeforeAttributeValue);
                            break;
                        case '>':
                            tokeniser.emitTagPending();
                            tokeniser.transition(TokeniserState.Data);
                            break;
                        default:
                            tokeniser.tagPending.newAttribute();
                            characterReader.unconsume();
                            tokeniser.transition(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(cConsume);
                tokeniser.transition(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == '\"') {
                    tokeniser.transition(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                if (cConsume != '`') {
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.emitTagPending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                        return;
                    }
                    if (cConsume == '&') {
                        characterReader.unconsume();
                        tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    if (cConsume == '\'') {
                        tokeniser.transition(TokeniserState.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (cConsume) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            tokeniser.error(this);
                            tokeniser.emitTagPending();
                            tokeniser.transition(TokeniserState.Data);
                            break;
                        default:
                            characterReader.unconsume();
                            tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue(cConsume);
                tokeniser.transition(TokeniserState.AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAny = characterReader.consumeToAny(TokeniserState.attributeDoubleValueCharsSorted);
            if (strConsumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAny);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (cConsume != '&') {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.transition(TokeniserState.Data);
                    return;
                } else {
                    tokeniser.tagPending.appendAttributeValue(cConsume);
                    return;
                }
            }
            int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference('\"', true);
            if (iArrConsumeCharacterReference != null) {
                tokeniser.tagPending.appendAttributeValue(iArrConsumeCharacterReference);
            } else {
                tokeniser.tagPending.appendAttributeValue('&');
            }
        }
    },
    AttributeValue_singleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAny = characterReader.consumeToAny(TokeniserState.attributeSingleValueCharsSorted);
            if (strConsumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAny);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume != '&') {
                if (cConsume == '\'') {
                    tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
                    return;
                } else {
                    tokeniser.tagPending.appendAttributeValue(cConsume);
                    return;
                }
            }
            int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference('\'', true);
            if (iArrConsumeCharacterReference != null) {
                tokeniser.tagPending.appendAttributeValue(iArrConsumeCharacterReference);
            } else {
                tokeniser.tagPending.appendAttributeValue('&');
            }
        }
    },
    AttributeValue_unquoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeValueUnquoted);
            if (strConsumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAnySorted);
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != ' ') {
                    if (cConsume != '\"' && cConsume != '`') {
                        if (cConsume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                        if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                            if (cConsume == '&') {
                                int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference('>', true);
                                if (iArrConsumeCharacterReference != null) {
                                    tokeniser.tagPending.appendAttributeValue(iArrConsumeCharacterReference);
                                    return;
                                } else {
                                    tokeniser.tagPending.appendAttributeValue('&');
                                    return;
                                }
                            }
                            if (cConsume != '\'') {
                                switch (cConsume) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        tokeniser.emitTagPending();
                                        tokeniser.transition(TokeniserState.Data);
                                        break;
                                    default:
                                        tokeniser.tagPending.appendAttributeValue(cConsume);
                                        break;
                                }
                            }
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.appendAttributeValue(cConsume);
                    return;
                }
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeValue((char) 65533);
        }
    },
    AfterAttributeValue_quoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cConsume == '/') {
                tokeniser.transition(TokeniserState.SelfClosingStartTag);
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitTagPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.error(this);
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '>') {
                tokeniser.tagPending.selfClosing = true;
                tokeniser.emitTagPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.error(this);
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            }
        }
    },
    BogusComment {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            characterReader.unconsume();
            Token.Comment comment = new Token.Comment();
            comment.bogus = true;
            comment.data.append(characterReader.consumeTo('>'));
            tokeniser.emit(comment);
            tokeniser.advanceTransition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchConsume("--")) {
                tokeniser.createCommentPending();
                tokeniser.transition(TokeniserState.CommentStart);
            } else if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                tokeniser.transition(TokeniserState.Doctype);
            } else if (characterReader.matchConsume("[CDATA[")) {
                tokeniser.createTempBuffer();
                tokeniser.transition(TokeniserState.CdataSection);
            } else {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.commentPending.data.append((char) 65533);
                tokeniser.transition(TokeniserState.Comment);
                return;
            }
            if (cConsume == '-') {
                tokeniser.transition(TokeniserState.CommentStartDash);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.commentPending.data.append(cConsume);
                tokeniser.transition(TokeniserState.Comment);
            }
        }
    },
    CommentStartDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.commentPending.data.append((char) 65533);
                tokeniser.transition(TokeniserState.Comment);
                return;
            }
            if (cConsume == '-') {
                tokeniser.transition(TokeniserState.CommentStartDash);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.commentPending.data.append(cConsume);
                tokeniser.transition(TokeniserState.Comment);
            }
        }
    },
    Comment {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.commentPending.data.append((char) 65533);
            } else if (cCurrent == '-') {
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
            } else {
                if (cCurrent == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.emitCommentPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.commentPending.data.append(characterReader.consumeToAny('-', 0));
            }
        }
    },
    CommentEndDash {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append('-');
                sb.append((char) 65533);
                tokeniser.transition(TokeniserState.Comment);
                return;
            }
            if (cConsume == '-') {
                tokeniser.transition(TokeniserState.CommentEnd);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append('-');
                sb2.append(cConsume);
                tokeniser.transition(TokeniserState.Comment);
            }
        }
    },
    CommentEnd {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--");
                sb.append((char) 65533);
                tokeniser.transition(TokeniserState.Comment);
                return;
            }
            if (cConsume == '!') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.CommentEndBang);
                return;
            }
            if (cConsume == '-') {
                tokeniser.error(this);
                tokeniser.commentPending.data.append('-');
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                tokeniser.error(this);
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--");
                sb2.append(cConsume);
                tokeniser.transition(TokeniserState.Comment);
            }
        }
    },
    CommentEndBang {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--!");
                sb.append((char) 65533);
                tokeniser.transition(TokeniserState.Comment);
                return;
            }
            if (cConsume == '-') {
                tokeniser.commentPending.data.append("--!");
                tokeniser.transition(TokeniserState.CommentEndDash);
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--!");
                sb2.append(cConsume);
                tokeniser.transition(TokeniserState.Comment);
            }
        }
    },
    Doctype {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (cConsume != '>') {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                } else {
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.BeforeDoctypeName);
                    return;
                }
            }
            tokeniser.error(this);
            tokeniser.createDoctypePending();
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.emitDoctypePending();
            tokeniser.transition(TokeniserState.Data);
        }
    },
    BeforeDoctypeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createDoctypePending();
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append((char) 65533);
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                    return;
                }
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append(cConsume);
                tokeniser.transition(TokeniserState.DoctypeName);
            }
        }
    },
    DoctypeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence());
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != ' ') {
                    if (cConsume == '>') {
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                        tokeniser.doctypePending.name.append(cConsume);
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.AfterDoctypeName);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.name.append((char) 65533);
        }
    },
    AfterDoctypeName {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchesAny('\t', '\n', '\r', '\f', ' ')) {
                characterReader.advance();
                return;
            }
            if (characterReader.matches('>')) {
                tokeniser.emitDoctypePending();
                tokeniser.advanceTransition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchConsumeIgnoreCase("PUBLIC")) {
                tokeniser.doctypePending.pubSysKey = "PUBLIC";
                tokeniser.transition(TokeniserState.AfterDoctypePublicKeyword);
            } else if (characterReader.matchConsumeIgnoreCase("SYSTEM")) {
                tokeniser.doctypePending.pubSysKey = "SYSTEM";
                tokeniser.transition(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.advanceTransition(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypePublicIdentifier);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.transition(TokeniserState.BogusDoctype);
        }
    },
    BeforeDoctypePublicIdentifier {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.transition(TokeniserState.BogusDoctype);
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.publicIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.doctypePending.publicIdentifier.append(cConsume);
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.publicIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.doctypePending.publicIdentifier.append(cConsume);
        }
    },
    AfterDoctypePublicIdentifier {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.transition(TokeniserState.BogusDoctype);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.transition(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypeSystemKeyword {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.emitDoctypePending();
        }
    },
    BeforeDoctypeSystemIdentifier {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.transition(TokeniserState.BogusDoctype);
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.systemIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.doctypePending.systemIdentifier.append(cConsume);
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.systemIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.doctypePending.systemIdentifier.append(cConsume);
        }
    },
    AfterDoctypeSystemIdentifier {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.BogusDoctype);
            }
        }
    },
    BogusDoctype {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else {
                if (cConsume != 65535) {
                    return;
                }
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CdataSection {
        @Override
        void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.dataBuffer.append(characterReader.consumeTo("]]>"));
            if (characterReader.matchConsume("]]>") || characterReader.isEmpty()) {
                tokeniser.emit(new Token.CData(tokeniser.dataBuffer.toString()));
                tokeniser.transition(TokeniserState.Data);
            }
        }
    };

    static final char[] attributeSingleValueCharsSorted = {0, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = {0, '\"', '&'};
    static final char[] attributeNameCharsSorted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final String replacementStr = String.valueOf((char) 65533);

    abstract void read(Tokeniser tokeniser, CharacterReader characterReader);

    public static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(strConsumeLetterSequence);
            tokeniser.dataBuffer.append(strConsumeLetterSequence);
            return;
        }
        if (tokeniser.isAppropriateEndTagToken() && !characterReader.isEmpty()) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.transition(BeforeAttributeName);
                return;
            }
            if (cConsume == '/') {
                tokeniser.transition(SelfClosingStartTag);
                return;
            } else {
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                    tokeniser.transition(Data);
                    return;
                }
                tokeniser.dataBuffer.append(cConsume);
            }
        }
        tokeniser.emit("</" + tokeniser.dataBuffer.toString());
        tokeniser.transition(tokeniserState);
    }

    public static void readData(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char cCurrent = characterReader.current();
        if (cCurrent == 0) {
            tokeniser.error(tokeniserState);
            characterReader.advance();
            tokeniser.emit((char) 65533);
        } else if (cCurrent == '<') {
            tokeniser.advanceTransition(tokeniserState2);
        } else if (cCurrent == 65535) {
            tokeniser.emit(new Token.EOF());
        } else {
            tokeniser.emit(characterReader.consumeToAny('<', 0));
        }
    }

    public static void readCharRef(Tokeniser tokeniser, TokeniserState tokeniserState) {
        int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
        if (iArrConsumeCharacterReference == null) {
            tokeniser.emit('&');
        } else {
            tokeniser.emit(iArrConsumeCharacterReference);
        }
        tokeniser.transition(tokeniserState);
    }

    public static void readEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            tokeniser.createTagPending(false);
            tokeniser.transition(tokeniserState);
        } else {
            tokeniser.emit("</");
            tokeniser.transition(tokeniserState2);
        }
    }

    public static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(strConsumeLetterSequence);
            tokeniser.emit(strConsumeLetterSequence);
            return;
        }
        char cConsume = characterReader.consume();
        if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ' || cConsume == '/' || cConsume == '>') {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit(cConsume);
            return;
        }
        characterReader.unconsume();
        tokeniser.transition(tokeniserState2);
    }
}
