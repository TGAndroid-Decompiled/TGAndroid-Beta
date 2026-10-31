package b2;
public final class w1 {
    public static final w1 f2380b;
    public static final String f2381c;
    public final e9.n0 f2382a;

    static {
        e9.l0 l0Var = e9.n0.f6390b;
        f2380b = new w1(e9.x1.e);
        String str = e2.l0.f6165a;
        f2381c = Integer.toString(0, 36);
    }

    public w1(e9.x1 x1Var) {
        this.f2382a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.f2382a;
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
                    if (v1Var.f2354b.f2189c == i10) {
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
            return this.f2382a.equals(((w1) obj).f2382a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2382a.hashCode();
    }
}
