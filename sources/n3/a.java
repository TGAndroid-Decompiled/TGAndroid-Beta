package n3;
public abstract class a {
    public final int f14206a;
    public int f14207b;

    public static String c(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int f(int i10) {
        return (i10 >> 24) & 255;
    }

    public static void i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public void a(int i10) {
        this.f14207b = i10 | this.f14207b;
    }

    public abstract void b();

    public boolean d(int i10) {
        if ((this.f14207b & i10) == i10) {
            return true;
        }
        return false;
    }

    public abstract a g();

    public String toString() {
        switch (this.f14206a) {
            case 2:
                return c(this.f14207b);
            default:
                return super.toString();
        }
    }

    public a(int i10, int i11) {
        this.f14206a = i11;
        this.f14207b = i10;
    }
}
