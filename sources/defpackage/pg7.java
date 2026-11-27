package defpackage;
public enum pg7 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int[] a;
    public final byte b;

    pg7(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public final int a(xdc xdcVar) {
        char c;
        byte b = xdcVar.a;
        if (b <= 9) {
            c = 0;
        } else if (b <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.a[c];
    }
}
