package dd;
public abstract class k {
    public final int f6772a;
    public int f6773b;

    public static String b(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void g(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public void a(int i10) {
        this.f6773b = i10 | this.f6773b;
    }

    public boolean c(int i10) {
        if ((this.f6773b & i10) == i10) {
            return true;
        }
        return false;
    }

    public abstract k f();

    public String toString() {
        switch (this.f6772a) {
            case 1:
                return b(this.f6773b);
            default:
                return super.toString();
        }
    }

    public k(int i10, int i11) {
        this.f6772a = i11;
        this.f6773b = i10;
    }
}
