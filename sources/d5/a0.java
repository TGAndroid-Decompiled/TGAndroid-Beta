package d5;

public final class a0 {

    public static final a0 f4772c = new a0(-1, -1);

    public final int f4773a;

    public final int f4774b;

    static {
        new a0(0, 0);
    }

    public a0(int i10, int i11) {
        a.f((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f4773a = i10;
        this.f4774b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f4773a == a0Var.f4773a && this.f4774b == a0Var.f4774b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4773a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f4774b;
    }

    public final String toString() {
        return this.f4773a + "x" + this.f4774b;
    }
}
