package lf;
public final class g {
    public final int f14228a;
    public final String f14229b;
    public final String f14230c;

    public g(int i10, String str, String str2) {
        this.f14228a = i10;
        this.f14229b = str;
        this.f14230c = str2;
    }

    public String toString() {
        switch (this.f14228a) {
            case 1:
                return this.f14229b + ", " + this.f14230c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14228a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14229b = str;
        this.f14230c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
