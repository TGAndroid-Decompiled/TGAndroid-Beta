package io.noties.markwon.html.jsoup.parser;

import java.util.Locale;

public enum TokeniserState {
    Data {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int i;
            char[] cArr;
            char c;
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                tokeniser.emit(characterReader.consume());
                return;
            }
            if (cCurrent == '&') {
                tokeniser.advanceTransition(TokeniserState.CharacterReferenceInData);
                return;
            }
            if (cCurrent == '<') {
                tokeniser.advanceTransition(TokeniserState.TagOpen);
                return;
            }
            if (cCurrent == 65535) {
                tokeniser.emit(new Token.EOF());
                return;
            }
            characterReader.bufferUp();
            int i2 = characterReader.bufPos;
            int i3 = characterReader.bufLength;
            while (true) {
                i = characterReader.bufPos;
                cArr = characterReader.charBuf;
                if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                    break;
                } else {
                    characterReader.bufPos = i + 1;
                }
            }
            tokeniser.emit(i > i2 ? CharacterReader.cacheString(cArr, characterReader.stringCache, i2, i - i2) : "");
        }
    },
    CharacterReferenceInData {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (iArrConsumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(new String(iArrConsumeCharacterReference, 0, iArrConsumeCharacterReference.length));
            }
            tokeniser.state = anonymousClass1;
        }
    },
    Rcdata {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
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
                } else if (cCurrent != 65535) {
                    tokeniser.emit(characterReader.consumeToAny('&', '<', 0));
                } else {
                    tokeniser.emit(new Token.EOF());
                }
            }
        }
    },
    CharacterReferenceInRcdata {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            AnonymousClass3 anonymousClass3 = TokeniserState.Rcdata;
            int[] iArrConsumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (iArrConsumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(new String(iArrConsumeCharacterReference, 0, iArrConsumeCharacterReference.length));
            }
            tokeniser.state = anonymousClass3;
        }
    },
    Rawtext {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$200(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$200(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    EF6 {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent != 65535) {
                tokeniser.emit(characterReader.consumeTo((char) 0));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    TagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
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
                tokeniser.state = TokeniserState.TagName;
            } else {
                tokeniser.error(this);
                tokeniser.emit('<');
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    EndTagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            boolean zIsEmpty = characterReader.isEmpty();
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (zIsEmpty) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniser.state = anonymousClass1;
            } else if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.state = TokeniserState.TagName;
            } else if (characterReader.matches('>')) {
                tokeniser.error(this);
                tokeniser.advanceTransition(anonymousClass1);
            } else {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    TagName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int i;
            char[] cArr;
            char c;
            characterReader.bufferUp();
            int i2 = characterReader.bufPos;
            int i3 = characterReader.bufLength;
            while (true) {
                i = characterReader.bufPos;
                cArr = characterReader.charBuf;
                if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                    break;
                } else {
                    characterReader.bufPos = i + 1;
                }
            }
            tokeniser.tagPending.appendTagName(i > i2 ? CharacterReader.cacheString(cArr, characterReader.stringCache, i2, i - i2) : "");
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == '/') {
                    tokeniser.state = TokeniserState.SelfClosingStartTag;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                    tokeniser.state = anonymousClass1;
                    return;
                }
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.state = anonymousClass1;
                    return;
                } else if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                    Token.Tag tag = tokeniser.tagPending;
                    tag.getClass();
                    tag.appendTagName(String.valueOf(cConsume));
                    return;
                }
            }
            tokeniser.state = TokeniserState.BeforeAttributeName;
        }
    },
    RcdataLessthanSign {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (characterReader.matchesLetter() && tokeniser.lastStartTag != null) {
                String str = "</" + tokeniser.lastStartTag;
                Locale locale = Locale.ENGLISH;
                String lowerCase = str.toLowerCase(locale);
                String upperCase = str.toUpperCase(locale);
                if (characterReader.nextIndexOf(lowerCase) <= -1 && characterReader.nextIndexOf(upperCase) <= -1) {
                    Token.Tag tagCreateTagPending = tokeniser.createTagPending(false);
                    String str2 = tokeniser.lastStartTag;
                    tagCreateTagPending.tagName = str2;
                    tagCreateTagPending.normalName = str2 != null ? str2.toLowerCase(locale) : "";
                    tokeniser.tagPending = tagCreateTagPending;
                    tokeniser.emitTagPending();
                    characterReader.unconsume();
                    tokeniser.state = TokeniserState.Data;
                    return;
                }
            }
            tokeniser.emit("<");
            tokeniser.state = TokeniserState.Rcdata;
        }
    },
    RCDATAEndTagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.state = TokeniserState.Rcdata;
                return;
            }
            tokeniser.createTagPending(false);
            Token.Tag tag = tokeniser.tagPending;
            char cCurrent = characterReader.current();
            tag.getClass();
            tag.appendTagName(String.valueOf(cCurrent));
            tokeniser.dataBuffer.append(characterReader.current());
            tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
        }
    },
    RCDATAEndTagName {
        public static void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            characterReader.unconsume();
            tokeniser.state = TokeniserState.Rcdata;
        }

        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                String strConsumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(strConsumeLetterSequence);
                tokeniser.dataBuffer.append(strConsumeLetterSequence);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.state = TokeniserState.BeforeAttributeName;
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            if (cConsume == '/') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.state = TokeniserState.SelfClosingStartTag;
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            if (cConsume != '>') {
                anythingElse(tokeniser, characterReader);
            } else if (!tokeniser.isAppropriateEndTagToken()) {
                anythingElse(tokeniser, characterReader);
            } else {
                tokeniser.emitTagPending();
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    RawtextLessthanSign {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.state = TokeniserState.Rawtext;
            }
        }
    },
    RawtextEndTagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            AnonymousClass16 anonymousClass16 = TokeniserState.RawtextEndTagName;
            AnonymousClass5 anonymousClass5 = TokeniserState.Rawtext;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.state = anonymousClass16;
            } else {
                tokeniser.emit("</");
                tokeniser.state = anonymousClass5;
            }
        }
    },
    RawtextEndTagName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$500(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '!') {
                tokeniser.emit("<!");
                tokeniser.state = TokeniserState.ScriptDataEscapeStart;
            } else if (cConsume == '/') {
                tokeniser.createTempBuffer();
                tokeniser.state = TokeniserState.ScriptDataEndTagOpen;
            } else {
                tokeniser.emit("<");
                characterReader.unconsume();
                tokeniser.state = TokeniserState.ScriptData;
            }
        }
    },
    ScriptDataEndTagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            AnonymousClass19 anonymousClass19 = TokeniserState.ScriptDataEndTagName;
            AnonymousClass6 anonymousClass6 = TokeniserState.ScriptData;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.state = anonymousClass19;
            } else {
                tokeniser.emit("</");
                tokeniser.state = anonymousClass6;
            }
        }
    },
    ScriptDataEndTagName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$500(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.state = TokeniserState.ScriptData;
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.state = TokeniserState.ScriptData;
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
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
            } else if (cCurrent != '<') {
                tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
            } else {
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
                return;
            }
            char cConsume = characterReader.consume();
            AnonymousClass22 anonymousClass22 = TokeniserState.ScriptDataEscaped;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.state = anonymousClass22;
            } else if (cConsume == '-') {
                tokeniser.emit(cConsume);
                tokeniser.state = TokeniserState.ScriptDataEscapedDashDash;
            } else if (cConsume == '<') {
                tokeniser.state = TokeniserState.ScriptDataEscapedLessthanSign;
            } else {
                tokeniser.emit(cConsume);
                tokeniser.state = anonymousClass22;
            }
        }
    },
    ScriptDataEscapedDashDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
                return;
            }
            char cConsume = characterReader.consume();
            AnonymousClass22 anonymousClass22 = TokeniserState.ScriptDataEscaped;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.state = anonymousClass22;
            } else {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    return;
                }
                if (cConsume == '<') {
                    tokeniser.state = TokeniserState.ScriptDataEscapedLessthanSign;
                } else if (cConsume != '>') {
                    tokeniser.emit(cConsume);
                    tokeniser.state = anonymousClass22;
                } else {
                    tokeniser.emit(cConsume);
                    tokeniser.state = TokeniserState.ScriptData;
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
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
                tokeniser.state = TokeniserState.ScriptDataEscaped;
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.state = TokeniserState.ScriptDataEscaped;
                return;
            }
            tokeniser.createTagPending(false);
            Token.Tag tag = tokeniser.tagPending;
            char cCurrent = characterReader.current();
            tag.getClass();
            tag.appendTagName(String.valueOf(cCurrent));
            tokeniser.dataBuffer.append(characterReader.current());
            tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
        }
    },
    ScriptDataEscapedEndTagName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$500(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$600(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
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
            } else if (cCurrent != 65535) {
                tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
            } else {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass29 anonymousClass29 = TokeniserState.ScriptDataDoubleEscaped;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.state = anonymousClass29;
            } else if (cConsume == '-') {
                tokeniser.emit(cConsume);
                tokeniser.state = TokeniserState.ScriptDataDoubleEscapedDashDash;
            } else if (cConsume == '<') {
                tokeniser.emit(cConsume);
                tokeniser.state = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
            } else if (cConsume != 65535) {
                tokeniser.emit(cConsume);
                tokeniser.state = anonymousClass29;
            } else {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass29 anonymousClass29 = TokeniserState.ScriptDataDoubleEscaped;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.emit((char) 65533);
                tokeniser.state = anonymousClass29;
                return;
            }
            if (cConsume == '-') {
                tokeniser.emit(cConsume);
                return;
            }
            if (cConsume == '<') {
                tokeniser.emit(cConsume);
                tokeniser.state = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
            } else if (cConsume == '>') {
                tokeniser.emit(cConsume);
                tokeniser.state = TokeniserState.ScriptData;
            } else if (cConsume != 65535) {
                tokeniser.emit(cConsume);
                tokeniser.state = anonymousClass29;
            } else {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('/')) {
                tokeniser.state = TokeniserState.ScriptDataDoubleEscaped;
                return;
            }
            tokeniser.emit('/');
            tokeniser.createTempBuffer();
            tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.access$600(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass35 anonymousClass35 = TokeniserState.AttributeName;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                characterReader.unconsume();
                tokeniser.state = anonymousClass35;
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume == '/') {
                        tokeniser.state = TokeniserState.SelfClosingStartTag;
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.state = anonymousClass1;
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
                            tokeniser.state = anonymousClass1;
                            break;
                        default:
                            tokeniser.tagPending.newAttribute();
                            characterReader.unconsume();
                            tokeniser.state = anonymousClass35;
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(cConsume);
                tokeniser.state = anonymousClass35;
            }
        }
    },
    AttributeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeNameCharsSorted);
            Token.Tag tag = tokeniser.tagPending;
            String str = tag.pendingAttributeName;
            if (str != null) {
                strConsumeToAnySorted = str.concat(strConsumeToAnySorted);
            }
            tag.pendingAttributeName = strConsumeToAnySorted;
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeName((char) 65533);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume == '/') {
                        tokeniser.state = TokeniserState.SelfClosingStartTag;
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.state = anonymousClass1;
                        return;
                    }
                    if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                        switch (cConsume) {
                            case '<':
                                break;
                            case '=':
                                tokeniser.state = TokeniserState.BeforeAttributeValue;
                                break;
                            case '>':
                                tokeniser.emitTagPending();
                                tokeniser.state = anonymousClass1;
                                break;
                            default:
                                tokeniser.tagPending.appendAttributeName(cConsume);
                                break;
                        }
                        return;
                    }
                }
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeName(cConsume);
                return;
            }
            tokeniser.state = TokeniserState.AfterAttributeName;
        }
    },
    AfterAttributeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass35 anonymousClass35 = TokeniserState.AttributeName;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeName((char) 65533);
                tokeniser.state = anonymousClass35;
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume == '/') {
                        tokeniser.state = TokeniserState.SelfClosingStartTag;
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.state = anonymousClass1;
                        return;
                    }
                    if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                        return;
                    }
                    switch (cConsume) {
                        case '<':
                            break;
                        case '=':
                            tokeniser.state = TokeniserState.BeforeAttributeValue;
                            break;
                        case '>':
                            tokeniser.emitTagPending();
                            tokeniser.state = anonymousClass1;
                            break;
                        default:
                            tokeniser.tagPending.newAttribute();
                            characterReader.unconsume();
                            tokeniser.state = anonymousClass35;
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(cConsume);
                tokeniser.state = anonymousClass35;
            }
        }
    },
    BeforeAttributeValue {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass40 anonymousClass40 = TokeniserState.AttributeValue_unquoted;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                tokeniser.state = anonymousClass40;
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == '\"') {
                    tokeniser.state = TokeniserState.AttributeValue_doubleQuoted;
                    return;
                }
                if (cConsume != '`') {
                    AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.emitTagPending();
                        tokeniser.state = anonymousClass1;
                        return;
                    }
                    if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                        return;
                    }
                    if (cConsume == '&') {
                        characterReader.unconsume();
                        tokeniser.state = anonymousClass40;
                        return;
                    }
                    if (cConsume == '\'') {
                        tokeniser.state = TokeniserState.AttributeValue_singleQuoted;
                        return;
                    }
                    switch (cConsume) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            tokeniser.error(this);
                            tokeniser.emitTagPending();
                            tokeniser.state = anonymousClass1;
                            break;
                        default:
                            characterReader.unconsume();
                            tokeniser.state = anonymousClass40;
                            break;
                    }
                    return;
                }
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue(cConsume);
                tokeniser.state = anonymousClass40;
            }
        }
    },
    AttributeValue_doubleQuoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAny = characterReader.consumeToAny(TokeniserState.attributeDoubleValueCharsSorted);
            if (strConsumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAny);
            } else {
                tokeniser.tagPending.hasEmptyAttributeValue = true;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.state = TokeniserState.AfterAttributeValue_quoted;
                return;
            }
            if (cConsume != '&') {
                if (cConsume != 65535) {
                    tokeniser.tagPending.appendAttributeValue(cConsume);
                    return;
                } else {
                    tokeniser.eofError(this);
                    tokeniser.state = TokeniserState.Data;
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
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAny = characterReader.consumeToAny(TokeniserState.attributeSingleValueCharsSorted);
            if (strConsumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAny);
            } else {
                tokeniser.tagPending.hasEmptyAttributeValue = true;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.state = TokeniserState.Data;
                return;
            }
            if (cConsume != '&') {
                if (cConsume != '\'') {
                    tokeniser.tagPending.appendAttributeValue(cConsume);
                    return;
                } else {
                    tokeniser.state = TokeniserState.AfterAttributeValue_quoted;
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
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strConsumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeValueUnquoted);
            if (strConsumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAnySorted);
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume != ' ') {
                if (cConsume != '\"' && cConsume != '`') {
                    AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                    if (cConsume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.state = anonymousClass1;
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
                                    tokeniser.state = anonymousClass1;
                                    break;
                                default:
                                    tokeniser.tagPending.appendAttributeValue(cConsume);
                                    break;
                            }
                            return;
                        }
                    }
                }
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue(cConsume);
                return;
            }
            tokeniser.state = TokeniserState.BeforeAttributeName;
        }
    },
    AfterAttributeValue_quoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass34 anonymousClass34 = TokeniserState.BeforeAttributeName;
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = anonymousClass34;
                return;
            }
            if (cConsume == '/') {
                tokeniser.state = TokeniserState.SelfClosingStartTag;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitTagPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.state = anonymousClass1;
            } else {
                tokeniser.error(this);
                characterReader.unconsume();
                tokeniser.state = anonymousClass34;
            }
        }
    },
    SelfClosingStartTag {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.tagPending.selfClosing = true;
                tokeniser.emitTagPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.state = anonymousClass1;
            } else {
                tokeniser.error(this);
                characterReader.unconsume();
                tokeniser.state = TokeniserState.BeforeAttributeName;
            }
        }
    },
    BogusComment {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            characterReader.unconsume();
            Token.Comment comment = new Token.Comment();
            comment.data.append(characterReader.consumeTo('>'));
            tokeniser.emit(comment);
            tokeniser.advanceTransition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchConsume("--")) {
                tokeniser.commentPending.reset();
                tokeniser.state = TokeniserState.CommentStart;
            } else if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                tokeniser.state = TokeniserState.Doctype;
            } else if (characterReader.matchConsume("[CDATA[")) {
                tokeniser.createTempBuffer();
                tokeniser.state = TokeniserState.CdataSection;
            } else {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass47 anonymousClass47 = TokeniserState.Comment;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.commentPending.data.append((char) 65533);
                tokeniser.state = anonymousClass47;
                return;
            }
            if (cConsume == '-') {
                tokeniser.state = TokeniserState.CommentStartDash;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume != 65535) {
                tokeniser.commentPending.data.append(cConsume);
                tokeniser.state = anonymousClass47;
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    CommentStartDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass47 anonymousClass47 = TokeniserState.Comment;
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.commentPending.data.append((char) 65533);
                tokeniser.state = anonymousClass47;
                return;
            }
            if (cConsume == '-') {
                tokeniser.state = TokeniserState.CommentStartDash;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume != 65535) {
                tokeniser.commentPending.data.append(cConsume);
                tokeniser.state = anonymousClass47;
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    Comment {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.commentPending.data.append((char) 65533);
            } else if (cCurrent == '-') {
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
            } else {
                if (cCurrent != 65535) {
                    tokeniser.commentPending.data.append(characterReader.consumeToAny('-', 0));
                    return;
                }
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = TokeniserState.Data;
            }
        }
    },
    CommentEndDash {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass47 anonymousClass47 = TokeniserState.Comment;
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append('-');
                sb.append((char) 65533);
                tokeniser.state = anonymousClass47;
                return;
            }
            if (cConsume == '-') {
                tokeniser.state = TokeniserState.CommentEnd;
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = TokeniserState.Data;
            } else {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append('-');
                sb2.append(cConsume);
                tokeniser.state = anonymousClass47;
            }
        }
    },
    CommentEnd {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass47 anonymousClass47 = TokeniserState.Comment;
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--");
                sb.append((char) 65533);
                tokeniser.state = anonymousClass47;
                return;
            }
            if (cConsume == '!') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.CommentEndBang;
                return;
            }
            if (cConsume == '-') {
                tokeniser.error(this);
                tokeniser.commentPending.data.append('-');
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else {
                tokeniser.error(this);
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--");
                sb2.append(cConsume);
                tokeniser.state = anonymousClass47;
            }
        }
    },
    CommentEndBang {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass47 anonymousClass47 = TokeniserState.Comment;
            if (cConsume == 0) {
                tokeniser.error(this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--!");
                sb.append((char) 65533);
                tokeniser.state = anonymousClass47;
                return;
            }
            if (cConsume == '-') {
                tokeniser.commentPending.data.append("--!");
                tokeniser.state = TokeniserState.CommentEndDash;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.state = anonymousClass1;
            } else {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--!");
                sb2.append(cConsume);
                tokeniser.state = anonymousClass47;
            }
        }
    },
    Doctype {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass52 anonymousClass52 = TokeniserState.BeforeDoctypeName;
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = anonymousClass52;
                return;
            }
            if (cConsume != '>') {
                if (cConsume != 65535) {
                    tokeniser.error(this);
                    tokeniser.state = anonymousClass52;
                    return;
                }
                tokeniser.eofError(this);
            }
            tokeniser.error(this);
            tokeniser.doctypePending.reset();
            tokeniser.doctypePending.getClass();
            tokeniser.emitDoctypePending();
            tokeniser.state = TokeniserState.Data;
        }
    },
    BeforeDoctypeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            boolean zMatchesLetter = characterReader.matchesLetter();
            AnonymousClass53 anonymousClass53 = TokeniserState.DoctypeName;
            if (zMatchesLetter) {
                tokeniser.doctypePending.reset();
                tokeniser.state = anonymousClass53;
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.reset();
                tokeniser.doctypePending.name.append((char) 65533);
                tokeniser.state = anonymousClass53;
                return;
            }
            if (cConsume != ' ') {
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.reset();
                    tokeniser.doctypePending.getClass();
                    tokeniser.emitDoctypePending();
                    tokeniser.state = TokeniserState.Data;
                    return;
                }
                if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                    return;
                }
                tokeniser.doctypePending.reset();
                tokeniser.doctypePending.name.append(cConsume);
                tokeniser.state = anonymousClass53;
            }
        }
    },
    DoctypeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence());
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.name.append((char) 65533);
                return;
            }
            if (cConsume != ' ') {
                AnonymousClass1 anonymousClass1 = TokeniserState.Data;
                if (cConsume == '>') {
                    tokeniser.emitDoctypePending();
                    tokeniser.state = anonymousClass1;
                    return;
                }
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.getClass();
                    tokeniser.emitDoctypePending();
                    tokeniser.state = anonymousClass1;
                    return;
                }
                if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                    tokeniser.doctypePending.name.append(cConsume);
                    return;
                }
            }
            tokeniser.state = TokeniserState.AfterDoctypeName;
        }
    },
    AfterDoctypeName {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            boolean zIsEmpty = characterReader.isEmpty();
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (zIsEmpty) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (characterReader.matchesAny('\t', '\n', '\r', '\f', ' ')) {
                characterReader.advance();
                return;
            }
            if (characterReader.matches('>')) {
                tokeniser.emitDoctypePending();
                tokeniser.advanceTransition(anonymousClass1);
                return;
            }
            if (characterReader.matchConsumeIgnoreCase("PUBLIC")) {
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.AfterDoctypePublicKeyword;
            } else if (characterReader.matchConsumeIgnoreCase("SYSTEM")) {
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.AfterDoctypeSystemKeyword;
            } else {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.advanceTransition(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = TokeniserState.BeforeDoctypePublicIdentifier;
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypePublicIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.state = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.state = TokeniserState.DoctypePublicIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.publicIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.state = TokeniserState.AfterDoctypePublicIdentifier;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.doctypePending.publicIdentifier.append(cConsume);
                return;
            }
            tokeniser.eofError(this);
            tokeniser.doctypePending.getClass();
            tokeniser.emitDoctypePending();
            tokeniser.state = anonymousClass1;
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.publicIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.state = TokeniserState.AfterDoctypePublicIdentifier;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.doctypePending.publicIdentifier.append(cConsume);
                return;
            }
            tokeniser.eofError(this);
            tokeniser.doctypePending.getClass();
            tokeniser.emitDoctypePending();
            tokeniser.state = anonymousClass1;
        }
    },
    AfterDoctypePublicIdentifier {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    AfterDoctypeSystemKeyword {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = TokeniserState.BeforeDoctypeSystemIdentifier;
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
                return;
            }
            if (cConsume == '\'') {
                tokeniser.state = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.systemIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniser.state = TokeniserState.AfterDoctypeSystemIdentifier;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.doctypePending.systemIdentifier.append(cConsume);
                return;
            }
            tokeniser.eofError(this);
            tokeniser.doctypePending.getClass();
            tokeniser.emitDoctypePending();
            tokeniser.state = anonymousClass1;
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.doctypePending.systemIdentifier.append((char) 65533);
                return;
            }
            if (cConsume == '\'') {
                tokeniser.state = TokeniserState.AfterDoctypeSystemIdentifier;
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.error(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
                return;
            }
            if (cConsume != 65535) {
                tokeniser.doctypePending.systemIdentifier.append(cConsume);
                return;
            }
            tokeniser.eofError(this);
            tokeniser.doctypePending.getClass();
            tokeniser.emitDoctypePending();
            tokeniser.state = anonymousClass1;
        }
    },
    AfterDoctypeSystemIdentifier {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.state = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.getClass();
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    BogusDoctype {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            AnonymousClass1 anonymousClass1 = TokeniserState.Data;
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            } else {
                if (cConsume != 65535) {
                    return;
                }
                tokeniser.emitDoctypePending();
                tokeniser.state = anonymousClass1;
            }
        }
    },
    CdataSection {
        @Override
        public final void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String strCacheString;
            int iNextIndexOf = characterReader.nextIndexOf("]]>");
            String[] strArr = characterReader.stringCache;
            char[] cArr = characterReader.charBuf;
            if (iNextIndexOf != -1) {
                strCacheString = CharacterReader.cacheString(cArr, strArr, characterReader.bufPos, iNextIndexOf);
                characterReader.bufPos += iNextIndexOf;
            } else {
                characterReader.bufferUp();
                int i = characterReader.bufPos;
                strCacheString = CharacterReader.cacheString(cArr, strArr, i, characterReader.bufLength - i);
                characterReader.bufPos = characterReader.bufLength;
            }
            tokeniser.dataBuffer.append(strCacheString);
            if (characterReader.matchConsume("]]>") || characterReader.isEmpty()) {
                String string = tokeniser.dataBuffer.toString();
                Token.CData cData = new Token.CData(5, 0);
                cData.data = string;
                tokeniser.emit(cData);
                tokeniser.state = TokeniserState.Data;
            }
        }
    };

    public static final char[] attributeSingleValueCharsSorted = {0, '&', '\''};
    public static final char[] attributeDoubleValueCharsSorted = {0, '\"', '&'};
    public static final char[] attributeNameCharsSorted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    public static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    public static final String replacementStr = String.valueOf((char) 65533);

    public static void access$200(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char cCurrent = characterReader.current();
        if (cCurrent == 0) {
            tokeniser.error(tokeniserState);
            characterReader.advance();
            tokeniser.emit((char) 65533);
        } else if (cCurrent == '<') {
            tokeniser.advanceTransition(tokeniserState2);
        } else if (cCurrent != 65535) {
            tokeniser.emit(characterReader.consumeToAny('<', 0));
        } else {
            tokeniser.emit(new Token.EOF());
        }
    }

    public static void access$500(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(strConsumeLetterSequence);
            tokeniser.dataBuffer.append(strConsumeLetterSequence);
            return;
        }
        boolean zIsAppropriateEndTagToken = tokeniser.isAppropriateEndTagToken();
        StringBuilder sb = tokeniser.dataBuffer;
        if (zIsAppropriateEndTagToken && !characterReader.isEmpty()) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniser.state = BeforeAttributeName;
                return;
            }
            if (cConsume == '/') {
                tokeniser.state = SelfClosingStartTag;
                return;
            } else {
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                    tokeniser.state = Data;
                    return;
                }
                sb.append(cConsume);
            }
        }
        tokeniser.emit("</" + sb.toString());
        tokeniser.state = tokeniserState;
    }

    public static void access$600(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(strConsumeLetterSequence);
            tokeniser.emit(strConsumeLetterSequence);
            return;
        }
        char cConsume = characterReader.consume();
        if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r' && cConsume != ' ' && cConsume != '/' && cConsume != '>') {
            characterReader.unconsume();
            tokeniser.state = tokeniserState2;
        } else {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.state = tokeniserState;
            } else {
                tokeniser.state = tokeniserState2;
            }
            tokeniser.emit(cConsume);
        }
    }

    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);
}
