package d5;

public class p {

    public int f4821a;

    public int f4822b;

    public p(int i10, int i11) {
        this.f4821a = i10;
        this.f4822b = i11;
    }

    public int a() {
        int i10 = this.f4822b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
