package dd;
public abstract class k {
    public final int f6464a;
    public final int f6465b;

    public k(int i10, int i11) {
        this.f6464a = i11;
        this.f6465b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k b();

    public String toString() {
        switch (this.f6464a) {
            case 1:
                return a(this.f6465b);
            default:
                return super.toString();
        }
    }
}
