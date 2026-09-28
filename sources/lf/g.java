package lf;
public final class g {
    public final int f14244a;
    public final String f14245b;
    public final String f14246c;

    public g(int i10, String str, String str2) {
        this.f14244a = i10;
        this.f14245b = str;
        this.f14246c = str2;
    }

    public String toString() {
        switch (this.f14244a) {
            case 1:
                return this.f14245b + ", " + this.f14246c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14244a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14245b = str;
        this.f14246c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
