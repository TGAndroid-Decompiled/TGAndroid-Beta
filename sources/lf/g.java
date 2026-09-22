package lf;
public final class g {
    public final int f14015a;
    public final String f14016b;
    public final String f14017c;

    public g(int i10, String str, String str2) {
        this.f14015a = i10;
        this.f14016b = str;
        this.f14017c = str2;
    }

    public String toString() {
        switch (this.f14015a) {
            case 1:
                return this.f14016b + ", " + this.f14017c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14015a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14016b = str;
        this.f14017c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
