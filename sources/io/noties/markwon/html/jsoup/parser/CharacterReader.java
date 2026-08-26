package io.noties.markwon.html.jsoup.parser;

import androidx.car.app.HostException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public final class CharacterReader {
    public int bufLength;
    public int bufMark;
    public int bufPos;
    public int bufSplitPoint;
    public final char[] charBuf;
    public final StringReader reader;
    public int readerPos;
    public final String[] stringCache;

    public CharacterReader(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.stringCache = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.reader = stringReader;
        this.charBuf = new char[4096];
        bufferUp();
    }

    public static String cacheString(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            i6 = (i6 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int length = i6 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    public final void advance() {
        this.bufPos++;
    }

    public final void bufferUp() {
        StringReader stringReader = this.reader;
        int i = this.bufPos;
        if (i < this.bufSplitPoint) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read(this.charBuf);
            stringReader.reset();
            if (i2 != -1) {
                this.bufLength = i2;
                this.readerPos += this.bufPos;
                this.bufPos = 0;
                this.bufMark = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.bufSplitPoint = i2;
            }
        } catch (IOException e) {
            throw new HostException(e);
        }
    }

    public final char consume() {
        bufferUp();
        int i = this.bufPos;
        char c = i >= this.bufLength ? (char) 65535 : this.charBuf[i];
        this.bufPos = i + 1;
        return c;
    }

    public final String consumeLetterSequence() {
        char[] cArr;
        char c;
        bufferUp();
        int i = this.bufPos;
        while (true) {
            int i2 = this.bufPos;
            int i3 = this.bufLength;
            cArr = this.charBuf;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.bufPos++;
        }
        return cacheString(cArr, this.stringCache, i, this.bufPos - i);
    }

    public final String consumeTo(char c) {
        char[] cArr;
        int i;
        bufferUp();
        int i2 = this.bufPos;
        while (true) {
            int i3 = this.bufLength;
            cArr = this.charBuf;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.bufPos;
                break;
            }
            i2++;
        }
        String[] strArr = this.stringCache;
        if (i != -1) {
            String strCacheString = cacheString(cArr, strArr, this.bufPos, i);
            this.bufPos += i;
            return strCacheString;
        }
        bufferUp();
        int i4 = this.bufPos;
        String strCacheString2 = cacheString(cArr, strArr, i4, this.bufLength - i4);
        this.bufPos = this.bufLength;
        return strCacheString2;
    }

    public final String consumeToAny(char... cArr) {
        char[] cArr2;
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        loop0: while (true) {
            int i3 = this.bufPos;
            cArr2 = this.charBuf;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.bufPos] == c) {
                    break loop0;
                }
            }
            this.bufPos++;
        }
        int i4 = this.bufPos;
        return i4 > i ? cacheString(cArr2, this.stringCache, i, i4 - i) : "";
    }

    public final String consumeToAnySorted(char... cArr) {
        char[] cArr2;
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        while (true) {
            int i3 = this.bufPos;
            cArr2 = this.charBuf;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.bufPos++;
        }
        int i4 = this.bufPos;
        return i4 > i ? cacheString(cArr2, this.stringCache, i, i4 - i) : "";
    }

    public final char current() {
        bufferUp();
        int i = this.bufPos;
        if (i >= this.bufLength) {
            return (char) 65535;
        }
        return this.charBuf[i];
    }

    public final boolean isEmpty() {
        bufferUp();
        return this.bufPos >= this.bufLength;
    }

    public final boolean matchConsume(String str) {
        bufferUp();
        bufferUp();
        int length = str.length();
        if (length <= this.bufLength - this.bufPos) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.charBuf[this.bufPos + i]) {
                }
            }
            this.bufPos = str.length() + this.bufPos;
            return true;
        }
        return false;
    }

    public final boolean matchConsumeIgnoreCase(String str) {
        bufferUp();
        int length = str.length();
        if (length <= this.bufLength - this.bufPos) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.charBuf[this.bufPos + i])) {
                }
            }
            this.bufPos = str.length() + this.bufPos;
            return true;
        }
        return false;
    }

    public final boolean matches(char c) {
        return !isEmpty() && this.charBuf[this.bufPos] == c;
    }

    public final boolean matchesAny(char... cArr) {
        if (!isEmpty()) {
            bufferUp();
            char c = this.charBuf[this.bufPos];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c = this.charBuf[this.bufPos];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    public final int nextIndexOf(String str) {
        bufferUp();
        char cCharAt = str.charAt(0);
        int i = this.bufPos;
        while (i < this.bufLength) {
            char[] cArr = this.charBuf;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.bufLength) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.bufLength;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.bufPos;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final String toString() {
        int i = this.bufPos;
        return new String(this.charBuf, i, this.bufLength - i);
    }

    public final void unconsume() {
        this.bufPos--;
    }
}
