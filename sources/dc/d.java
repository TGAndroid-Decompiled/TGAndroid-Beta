package dc;
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
    
    public final int[] f8780a;
    public final int f8781b;

    d(int[] iArr, int i3) {
        this.f8780a = iArr;
        this.f8781b = i3;
    }

    public final int a(e eVar) {
        char c2;
        int i3 = eVar.f8784a;
        if (i3 <= 9) {
            c2 = 0;
        } else if (i3 <= 26) {
            c2 = 1;
        } else {
            c2 = 2;
        }
        return this.f8780a[c2];
    }
}
