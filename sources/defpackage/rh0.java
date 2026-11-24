package defpackage;
public final class rh0 {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public rh0(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(this.c - 1);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i = this.c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c = i - 1;
        char c = this.d;
        if (c < 1792) {
            return e[c];
        }
        return Character.getDirectionality(c);
    }
}
