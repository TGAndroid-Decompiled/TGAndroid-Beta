package lf;
public final class g {
    public final int f14027a;
    public final String f14028b;
    public final String f14029c;

    public g(int i10, String str, String str2) {
        this.f14027a = i10;
        this.f14028b = str;
        this.f14029c = str2;
    }

    public String toString() {
        switch (this.f14027a) {
            case 1:
                return this.f14028b + ", " + this.f14029c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14027a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14028b = str;
        this.f14029c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
