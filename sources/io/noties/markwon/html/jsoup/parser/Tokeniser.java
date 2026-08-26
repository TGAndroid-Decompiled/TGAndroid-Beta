package io.noties.markwon.html.jsoup.parser;

import com.google.android.gms.internal.clearcut.zzee;
import io.noties.markwon.html.jsoup.nodes.Attributes;
import io.noties.markwon.html.jsoup.nodes.CommonMarkEntities;
import java.util.Arrays;
import java.util.Map;

public final class Tokeniser {
    public static final char[] notCharRefCharsSorted;
    public static final int[] win1252Extensions = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final Token.Character charPending;
    public final int[] codepointHolder;
    public final Token.Comment commentPending;
    public final Token.Doctype doctypePending;
    public Token emitPending;
    public final Token.EndTag endPending;
    public final ParseErrorList errors;
    public String lastStartTag;
    public final int[] multipointHolder;
    public final CharacterReader reader;
    public final Token.StartTag startPending;
    public Token.Tag tagPending;
    public TokeniserState state = TokeniserState.Data;
    public boolean isEmitPending = false;
    public String charsString = null;
    public final StringBuilder charsBuilder = new StringBuilder(1024);
    public final StringBuilder dataBuffer = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        notCharRefCharsSorted = cArr;
        Arrays.sort(cArr);
    }

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList) {
        Token.StartTag startTag = new Token.StartTag(2);
        startTag.attributes = new Attributes();
        this.startPending = startTag;
        this.endPending = new Token.EndTag(3);
        this.charPending = new Token.Character(5, 0);
        this.doctypePending = new Token.Doctype();
        this.commentPending = new Token.Comment();
        this.codepointHolder = new int[1];
        this.multipointHolder = new int[2];
        this.reader = characterReader;
        this.errors = parseErrorList;
    }

    public final void advanceTransition(TokeniserState tokeniserState) {
        this.reader.advance();
        this.state = tokeniserState;
    }

    public final void characterReferenceError(String str) {
        ParseErrorList parseErrorList = this.errors;
        if (parseErrorList.size() < 0) {
            CharacterReader characterReader = this.reader;
            parseErrorList.add(new zzee("Invalid character reference: %s", characterReader.readerPos + characterReader.bufPos, new Object[]{str}));
        }
    }

    public final int[] consumeCharacterReference(Character ch, boolean z) {
        int i;
        int i2;
        char c;
        int length;
        char c2;
        char c3;
        char c4;
        char c5;
        int[] iArr;
        int i3;
        String strCacheString;
        char c6;
        int iIntValue;
        int i4;
        char c7;
        CharacterReader characterReader = this.reader;
        if (!characterReader.isEmpty() && (ch == null || ch.charValue() != characterReader.current())) {
            char[] cArr = notCharRefCharsSorted;
            characterReader.bufferUp();
            boolean zIsEmpty = characterReader.isEmpty();
            char[] cArr2 = characterReader.charBuf;
            if (zIsEmpty || Arrays.binarySearch(cArr, cArr2[characterReader.bufPos]) < 0) {
                characterReader.bufMark = characterReader.bufPos;
                boolean zMatchConsume = characterReader.matchConsume("#");
                String[] strArr = characterReader.stringCache;
                char c8 = 'A';
                int[] iArr2 = this.codepointHolder;
                if (zMatchConsume) {
                    boolean zMatchConsumeIgnoreCase = characterReader.matchConsumeIgnoreCase("X");
                    if (zMatchConsumeIgnoreCase) {
                        characterReader.bufferUp();
                        iArr = null;
                        int i5 = characterReader.bufPos;
                        c5 = 0;
                        while (true) {
                            i4 = characterReader.bufPos;
                            if (i4 >= characterReader.bufLength || (((c7 = cArr2[i4]) < '0' || c7 > '9') && ((c7 < c8 || c7 > 'F') && (c7 < 'a' || c7 > 'f')))) {
                                break;
                            }
                            characterReader.bufPos = i4 + 1;
                            c8 = 'A';
                        }
                        strCacheString = CharacterReader.cacheString(cArr2, strArr, i5, i4 - i5);
                    } else {
                        c5 = 0;
                        iArr = null;
                        characterReader.bufferUp();
                        int i6 = characterReader.bufPos;
                        while (true) {
                            i3 = characterReader.bufPos;
                            if (i3 >= characterReader.bufLength || (c6 = cArr2[i3]) < '0' || c6 > '9') {
                                break;
                            }
                            characterReader.bufPos = i3 + 1;
                        }
                        strCacheString = CharacterReader.cacheString(cArr2, strArr, i6, i3 - i6);
                    }
                    if (strCacheString.length() == 0) {
                        characterReferenceError("numeric reference with no numerals");
                        characterReader.bufPos = characterReader.bufMark;
                        return iArr;
                    }
                    if (!characterReader.matchConsume(";")) {
                        characterReferenceError("missing semicolon");
                    }
                    try {
                        iIntValue = Integer.valueOf(strCacheString, zMatchConsumeIgnoreCase ? 16 : 10).intValue();
                    } catch (NumberFormatException unused) {
                        iIntValue = -1;
                    }
                    if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                        characterReferenceError("character outside of valid range");
                        iArr2[c5] = 65533;
                        return iArr2;
                    }
                    if (iIntValue >= 128 && iIntValue < 160) {
                        characterReferenceError("character is not a valid unicode code point");
                        iIntValue = win1252Extensions[iIntValue - 128];
                    }
                    iArr2[c5] = iIntValue;
                    return iArr2;
                }
                characterReader.bufferUp();
                int i7 = characterReader.bufPos;
                while (true) {
                    int i8 = characterReader.bufPos;
                    if (i8 >= characterReader.bufLength || (((c4 = cArr2[i8]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                        break;
                    }
                    characterReader.bufPos++;
                }
                while (true) {
                    i = characterReader.bufPos;
                    if (i >= characterReader.bufLength || (c3 = cArr2[i]) < '0' || c3 > '9') {
                        break;
                    }
                    characterReader.bufPos = i + 1;
                }
                String strCacheString2 = CharacterReader.cacheString(cArr2, strArr, i7, i - i7);
                boolean zMatches = characterReader.matches(';');
                Map map = CommonMarkEntities.COMMONMARK_NAMED_ENTITIES;
                if (!map.containsKey(strCacheString2) || !zMatches) {
                    characterReader.bufPos = characterReader.bufMark;
                    if (!zMatches) {
                        return null;
                    }
                    characterReferenceError("invalid named referenece '" + strCacheString2 + "'");
                    return null;
                }
                if (z && (characterReader.matchesLetter() || ((!characterReader.isEmpty() && (c2 = cArr2[characterReader.bufPos]) >= '0' && c2 <= '9') || characterReader.matchesAny('=', '-', '_')))) {
                    characterReader.bufPos = characterReader.bufMark;
                    return null;
                }
                if (!characterReader.matchConsume(";")) {
                    characterReferenceError("missing semicolon");
                }
                String str = (String) map.get(strCacheString2);
                int[] iArr3 = this.multipointHolder;
                if (str != null) {
                    length = str.length();
                    i2 = 1;
                    if (length == 1) {
                        c = 0;
                        iArr3[0] = str.charAt(0);
                    } else {
                        c = 0;
                        iArr3[0] = str.charAt(0);
                        iArr3[1] = str.charAt(1);
                    }
                } else {
                    i2 = 1;
                    c = 0;
                    length = 0;
                }
                if (length == i2) {
                    iArr2[c] = iArr3[c];
                    return iArr2;
                }
                if (length == 2) {
                    return iArr3;
                }
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(strCacheString2));
            }
        }
        return null;
    }

    public final Token.Tag createTagPending(boolean z) {
        Token.Tag tag;
        if (z) {
            tag = this.startPending;
            tag.reset();
        } else {
            tag = this.endPending;
            tag.reset();
        }
        this.tagPending = tag;
        return tag;
    }

    public final void createTempBuffer() {
        Token.reset(this.dataBuffer);
    }

    public final void emit(Token token) {
        if (this.isEmitPending) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.emitPending = token;
        this.isEmitPending = true;
        int i = token.type;
        if (i == 2) {
            this.lastStartTag = ((Token.StartTag) token).tagName;
            return;
        }
        if (i != 3 || ((Token.EndTag) token).attributes == null) {
            return;
        }
        ParseErrorList parseErrorList = this.errors;
        if (parseErrorList.size() < 0) {
            CharacterReader characterReader = this.reader;
            int i2 = characterReader.readerPos + characterReader.bufPos;
            zzee zzeeVar = new zzee();
            zzeeVar.position = i2;
            zzeeVar.info = "Attributes incorrectly present on end tag";
            parseErrorList.add(zzeeVar);
        }
    }

    public final void emitCommentPending() {
        emit(this.commentPending);
    }

    public final void emitDoctypePending() {
        emit(this.doctypePending);
    }

    public final void emitTagPending() {
        Token.Tag tag = this.tagPending;
        if (tag.pendingAttributeName != null) {
            tag.newAttribute();
        }
        emit(this.tagPending);
    }

    public final void eofError(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.errors;
        if (parseErrorList.size() < 0) {
            CharacterReader characterReader = this.reader;
            parseErrorList.add(new zzee("Unexpectedly reached end of file (EOF) in input state [%s]", characterReader.readerPos + characterReader.bufPos, new Object[]{tokeniserState}));
        }
    }

    public final void error(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.errors;
        if (parseErrorList.size() < 0) {
            CharacterReader characterReader = this.reader;
            parseErrorList.add(new zzee("Unexpected character '%s' in input state [%s]", characterReader.readerPos + characterReader.bufPos, new Object[]{Character.valueOf(characterReader.current()), tokeniserState}));
        }
    }

    public final boolean isAppropriateEndTagToken() {
        return this.lastStartTag != null && this.tagPending.name().equalsIgnoreCase(this.lastStartTag);
    }

    public final void emit(String str) {
        if (this.charsString == null) {
            this.charsString = str;
            return;
        }
        StringBuilder sb = this.charsBuilder;
        if (sb.length() == 0) {
            sb.append(this.charsString);
        }
        sb.append(str);
    }

    public final void emit(char c) {
        emit(String.valueOf(c));
    }
}
