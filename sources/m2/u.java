package m2;
public final class u {
    public final int f15819a;
    public final String f15820b;
    public final String f15821c;

    public u(int i10, String str, String str2) {
        this.f15819a = i10;
        this.f15820b = str;
        this.f15821c = str2;
    }

    public String toString() {
        switch (this.f15819a) {
            case 0:
                return this.f15820b + ", " + this.f15821c;
            default:
                return super.toString();
        }
    }

    public u(String str, String str2) {
        this.f15819a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15820b = str;
        this.f15821c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
