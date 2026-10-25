package jc;
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
    
    public final int[] f15564a;
    public final int f15565b;

    e(int[] iArr, int i10) {
        this.f15564a = iArr;
        this.f15565b = i10;
    }

    public final int a(f fVar) {
        char c10;
        int i10 = fVar.f15567a;
        if (i10 <= 9) {
            c10 = 0;
        } else if (i10 <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f15564a[c10];
    }
}
