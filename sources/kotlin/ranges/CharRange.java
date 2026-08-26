package kotlin.ranges;

public final class CharRange extends CharProgression {
    static {
        new CharRange((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        CharRange charRange;
        char c;
        char c2;
        if (!(obj instanceof CharRange)) {
            return false;
        }
        char c3 = this.first;
        char c4 = this.last;
        if (c3 >= c4 && c3 != c4 && (c = (charRange = (CharRange) obj).first) >= (c2 = charRange.last) && c != c2) {
            return true;
        }
        CharRange charRange2 = (CharRange) obj;
        return c3 == charRange2.first && c4 == charRange2.last;
    }

    public final int hashCode() {
        char c = this.first;
        char c2 = this.last;
        if (c >= c2 && c != c2) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.first + ".." + this.last;
    }
}
