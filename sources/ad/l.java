package ad;
public abstract class l {
    public final int f364a;
    public final int f365b;

    public l(int i3, int i10) {
        this.f364a = i10;
        this.f365b = i3;
    }

    public static String a(int i3) {
        return "" + ((char) ((i3 >> 24) & 255)) + ((char) ((i3 >> 16) & 255)) + ((char) ((i3 >> 8) & 255)) + ((char) (i3 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract l b();

    public String toString() {
        switch (this.f364a) {
            case 1:
                return a(this.f365b);
            default:
                return super.toString();
        }
    }
}
