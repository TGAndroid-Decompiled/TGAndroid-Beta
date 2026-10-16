package b2;
public final class w1 {
    public static final w1 f2480b;
    public static final String f2481c;
    public final e9.n0 f2482a;

    static {
        e9.l0 l0Var = e9.n0.f8595b;
        f2480b = new w1(e9.x1.e);
        String str = e2.m0.f8375a;
        f2481c = Integer.toString(0, 36);
    }

    public w1(e9.x1 x1Var) {
        this.f2482a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.f2482a;
            if (i11 >= n0Var.size()) {
                return false;
            }
            v1 v1Var = (v1) n0Var.get(i11);
            boolean[] zArr = v1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (v1Var.f2454b.f2297c == i10) {
                        return true;
                    }
                } else {
                    i12++;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w1.class == obj.getClass()) {
            return this.f2482a.equals(((w1) obj).f2482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2482a.hashCode();
    }
}
