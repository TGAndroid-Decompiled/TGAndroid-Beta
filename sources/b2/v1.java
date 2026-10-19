package b2;
public final class v1 {
    public static final v1 f4087b;
    public static final String f4088c;
    public final e9.n0 f4089a;

    static {
        e9.l0 l0Var = e9.n0.f8476b;
        f4087b = new v1(e9.x1.e);
        String str = e2.m0.f8254a;
        f4088c = Integer.toString(0, 36);
    }

    public v1(e9.x1 x1Var) {
        this.f4089a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.f4089a;
            if (i11 >= n0Var.size()) {
                return false;
            }
            u1 u1Var = (u1) n0Var.get(i11);
            boolean[] zArr = u1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (u1Var.f4061b.f3904c == i10) {
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
        if (obj != null && v1.class == obj.getClass()) {
            return this.f4089a.equals(((v1) obj).f4089a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4089a.hashCode();
    }
}
