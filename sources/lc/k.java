package lc;
public abstract class k {
    public final int f16817a;
    public final int f16818b;

    public k(int i9, int i10) {
        this.f16817a = i10;
        this.f16818b = i9;
    }

    public static String a(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int b(int i9) {
        return (i9 >> 24) & 255;
    }

    public static void d(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k c();

    public String toString() {
        switch (this.f16817a) {
            case 1:
                return a(this.f16818b);
            default:
                return super.toString();
        }
    }
}
