package lf;
public final class g {
    public final int f14243a;
    public final String f14244b;
    public final String f14245c;

    public g(int i10, String str, String str2) {
        this.f14243a = i10;
        this.f14244b = str;
        this.f14245c = str2;
    }

    public String toString() {
        switch (this.f14243a) {
            case 1:
                return this.f14244b + ", " + this.f14245c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f14243a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14244b = str;
        this.f14245c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
