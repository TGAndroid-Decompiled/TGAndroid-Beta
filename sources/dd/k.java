package dd;
public abstract class k {
    public final int f8649a;
    public final int f8650b;

    public k(int i7, int i10) {
        this.f8649a = i10;
        this.f8650b = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k b();

    public String toString() {
        switch (this.f8649a) {
            case 1:
                return a(this.f8650b);
            default:
                return super.toString();
        }
    }
}
