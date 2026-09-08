package m2;
public final class u {
    public final int f15846a;
    public final String f15847b;
    public final String f15848c;

    public u(int i10, String str, String str2) {
        this.f15846a = i10;
        this.f15847b = str;
        this.f15848c = str2;
    }

    public String toString() {
        switch (this.f15846a) {
            case 0:
                return this.f15847b + ", " + this.f15848c;
            default:
                return super.toString();
        }
    }

    public u(String str, String str2) {
        this.f15846a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15847b = str;
        this.f15848c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
