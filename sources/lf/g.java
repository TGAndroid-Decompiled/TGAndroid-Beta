package lf;
public final class g {
    public final int f14005a;
    public final String f14006b;
    public final String f14007c;

    public g(int i10, String str, String str2) {
        this.f14005a = i10;
        this.f14006b = str;
        this.f14007c = str2;
    }

    public String toString() {
        switch (this.f14005a) {
            case 1:
                return this.f14006b + ", " + this.f14007c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14005a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14006b = str;
        this.f14007c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
