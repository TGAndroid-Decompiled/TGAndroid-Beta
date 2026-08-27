package mc;

public abstract class k {

    public final int f18001a;

    public final int f18002b;

    public k(int i10, int i11) {
        this.f18001a = i11;
        this.f18002b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return (i10 >> 24) & 255;
    }

    public static void d(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k c();

    public String toString() {
        switch (this.f18001a) {
            case 1:
                return a(this.f18002b);
            default:
                return super.toString();
        }
    }
}
