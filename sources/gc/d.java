package gc;
public enum d {
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
    
    public final int[] f13808a;
    public final int f13809b;

    d(int[] iArr, int i7) {
        this.f13808a = iArr;
        this.f13809b = i7;
    }

    public final int a(e eVar) {
        char c10;
        int i7 = eVar.f13812a;
        if (i7 <= 9) {
            c10 = 0;
        } else if (i7 <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f13808a[c10];
    }
}
