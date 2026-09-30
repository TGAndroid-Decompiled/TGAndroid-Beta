package lf;
public final class g {
    public final int f14259a;
    public final String f14260b;
    public final String f14261c;

    public g(int i10, String str, String str2) {
        this.f14259a = i10;
        this.f14260b = str;
        this.f14261c = str2;
    }

    public String toString() {
        switch (this.f14259a) {
            case 1:
                return this.f14260b + ", " + this.f14261c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14259a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14260b = str;
        this.f14261c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
