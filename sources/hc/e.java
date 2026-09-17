package hc;
public enum e {
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
    
    public final int[] f10940a;
    public final int f10941b;

    e(int[] iArr, int i10) {
        this.f10940a = iArr;
        this.f10941b = i10;
    }

    public final int a(f fVar) {
        char c10;
        int i10 = fVar.f10944a;
        if (i10 <= 9) {
            c10 = 0;
        } else if (i10 <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f10940a[c10];
    }
}
