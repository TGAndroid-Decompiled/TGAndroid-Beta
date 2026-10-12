package f2;
public abstract class e {
    public final int f8840a;
    public final int f8841b;

    public e(int i10, int i11) {
        this.f8840a = i11;
        this.f8841b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract e b();

    public String toString() {
        switch (this.f8840a) {
            case 0:
                return a(this.f8841b);
            default:
                return super.toString();
        }
    }
}
