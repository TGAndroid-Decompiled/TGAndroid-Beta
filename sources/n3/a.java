package n3;
public abstract class a {
    public final int f14221a;
    public int f14222b;

    public static String d(int i10) {
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
        this.f14222b = i10 | this.f14222b;
    }

    public abstract void c();

    public boolean e(int i10) {
        if ((this.f14222b & i10) == i10) {
            return true;
        }
        return false;
    }

    public abstract a h();

    public String toString() {
        switch (this.f14221a) {
            case 2:
                return d(this.f14222b);
            default:
                return super.toString();
        }
    }

    public a(int i10, int i11) {
        this.f14221a = i11;
        this.f14222b = i10;
    }
}
