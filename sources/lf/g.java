package lf;
public final class g {
    public final int f14245a;
    public final String f14246b;
    public final String f14247c;

    public g(int i10, String str, String str2) {
        this.f14245a = i10;
        this.f14246b = str;
        this.f14247c = str2;
    }

    public String toString() {
        switch (this.f14245a) {
            case 1:
                return this.f14246b + ", " + this.f14247c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14245a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14246b = str;
        this.f14247c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
