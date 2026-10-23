package f2;
public abstract class f {
    public final int f10303a;
    public final int f10304b;

    public f(int i10, int i11) {
        this.f10303a = i11;
        this.f10304b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract f b();

    public String toString() {
        switch (this.f10303a) {
            case 0:
                return a(this.f10304b);
            default:
                return super.toString();
        }
    }
}
