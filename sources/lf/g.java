package lf;
public final class g {
    public final int f14017a;
    public final String f14018b;
    public final String f14019c;

    public g(int i10, String str, String str2) {
        this.f14017a = i10;
        this.f14018b = str;
        this.f14019c = str2;
    }

    public String toString() {
        switch (this.f14017a) {
            case 1:
                return this.f14018b + ", " + this.f14019c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14017a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14018b = str;
        this.f14019c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
