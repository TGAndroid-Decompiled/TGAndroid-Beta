package n3;
public abstract class a {
    public final int f15194a;
    public int f15195b;

    public static String c(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int f(int i10) {
        return (i10 >> 24) & 255;
    }

    public static void h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public void a(int i10) {
        this.f15195b = i10 | this.f15195b;
    }

    public abstract void b();

    public boolean e(int i10) {
        if ((this.f15195b & i10) == i10) {
            return true;
        }
        return false;
    }

    public abstract a g();

    public String toString() {
        switch (this.f15194a) {
            case 2:
                return c(this.f15195b);
            default:
                return super.toString();
        }
    }

    public a(int i10, int i11) {
        this.f15194a = i11;
        this.f15195b = i10;
    }
}
