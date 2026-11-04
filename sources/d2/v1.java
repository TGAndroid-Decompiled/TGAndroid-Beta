package d2;
public final class v1 {
    public static final v1 f8498b;
    public static final String f8499c;
    public final g9.i0 f8500a;

    static {
        g9.g0 g0Var = g9.i0.f12083b;
        f8498b = new v1(g9.s1.f12146e);
        String str = g2.n0.f11873a;
        f8499c = Integer.toString(0, 36);
    }

    public v1(g9.s1 s1Var) {
        this.f8500a = g9.i0.q(s1Var);
    }

    public final boolean a(int i3) {
        int i10 = 0;
        while (true) {
            g9.i0 i0Var = this.f8500a;
            if (i10 >= i0Var.size()) {
                return false;
            }
            u1 u1Var = (u1) i0Var.get(i10);
            boolean[] zArr = u1Var.f8447e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (zArr[i11]) {
                    if (u1Var.f8445b.f8254c == i3) {
                        return true;
                    }
                } else {
                    i11++;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            return this.f8500a.equals(((v1) obj).f8500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8500a.hashCode();
    }
}
