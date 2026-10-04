package lf;
public final class g {
    public final int f15485a;
    public final String f15486b;
    public final String f15487c;

    public g(int i10, String str, String str2) {
        this.f15485a = i10;
        this.f15486b = str;
        this.f15487c = str2;
    }

    public String toString() {
        switch (this.f15485a) {
            case 1:
                return this.f15486b + ", " + this.f15487c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f15485a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15486b = str;
        this.f15487c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
