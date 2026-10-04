package lf;
public final class g {
    public final int f15487a;
    public final String f15488b;
    public final String f15489c;

    public g(int i10, String str, String str2) {
        this.f15487a = i10;
        this.f15488b = str;
        this.f15489c = str2;
    }

    public String toString() {
        switch (this.f15487a) {
            case 1:
                return this.f15488b + ", " + this.f15489c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f15487a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15488b = str;
        this.f15489c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
