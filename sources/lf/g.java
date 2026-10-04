package lf;
public final class g {
    public final int f15486a;
    public final String f15487b;
    public final String f15488c;

    public g(int i10, String str, String str2) {
        this.f15486a = i10;
        this.f15487b = str;
        this.f15488c = str2;
    }

    public String toString() {
        switch (this.f15486a) {
            case 1:
                return this.f15487b + ", " + this.f15488c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f15486a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15487b = str;
        this.f15488c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
