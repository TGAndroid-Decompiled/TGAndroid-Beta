package b2;
public final class v1 {
    public static final v1 f4088b;
    public static final String f4089c;
    public final e9.n0 f4090a;

    static {
        e9.l0 l0Var = e9.n0.f8476b;
        f4088b = new v1(e9.x1.e);
        String str = e2.m0.f8254a;
        f4089c = Integer.toString(0, 36);
    }

    public v1(e9.x1 x1Var) {
        this.f4090a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.f4090a;
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
                    if (u1Var.f4062b.f3905c == i10) {
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
            return this.f4090a.equals(((v1) obj).f4090a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4090a.hashCode();
    }
}
