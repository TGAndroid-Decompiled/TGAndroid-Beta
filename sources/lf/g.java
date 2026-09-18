package lf;
public final class g {
    public final int f14173a;
    public final String f14174b;
    public final String f14175c;

    public g(int i10, String str, String str2) {
        this.f14173a = i10;
        this.f14174b = str;
        this.f14175c = str2;
    }

    public String toString() {
        switch (this.f14173a) {
            case 1:
                return this.f14174b + ", " + this.f14175c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14173a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14174b = str;
        this.f14175c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
