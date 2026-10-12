package b2;
public final class w1 {
    public static final w1 f2476b;
    public static final String f2477c;
    public final e9.n0 f2478a;

    static {
        e9.l0 l0Var = e9.n0.f8592b;
        f2476b = new w1(e9.x1.e);
        String str = e2.m0.f8372a;
        f2477c = Integer.toString(0, 36);
    }

    public w1(e9.x1 x1Var) {
        this.f2478a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.f2478a;
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
                    if (v1Var.f2450b.f2293c == i10) {
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
            return this.f2478a.equals(((w1) obj).f2478a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2478a.hashCode();
    }
}
