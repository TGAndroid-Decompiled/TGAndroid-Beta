package b2;
public final class w1 {
    public static final w1 f3543b;
    public static final String f3544c;
    public final f9.i0 f3545a;

    static {
        f9.g0 g0Var = f9.i0.f10287b;
        f3543b = new w1(f9.s1.e);
        String str = e2.n0.f9692a;
        f3544c = Integer.toString(0, 36);
    }

    public w1(f9.s1 s1Var) {
        this.f3545a = f9.i0.u(s1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            f9.i0 i0Var = this.f3545a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            v1 v1Var = (v1) i0Var.get(i11);
            boolean[] zArr = v1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (v1Var.f3517b.f3360c == i10) {
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
            return this.f3545a.equals(((w1) obj).f3545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3545a.hashCode();
    }
}
