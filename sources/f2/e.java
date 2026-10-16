package f2;
public abstract class e {
    public final int f8843a;
    public final int f8844b;

    public e(int i10, int i11) {
        this.f8843a = i11;
        this.f8844b = i10;
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
        switch (this.f8843a) {
            case 0:
                return a(this.f8844b);
            default:
                return super.toString();
        }
    }
}
