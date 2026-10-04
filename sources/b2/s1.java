package b2;
public final class s1 {
    public static final s1 f3574b;
    public static final String f3575c;
    public final e9.i0 f3576a;

    static {
        e9.g0 g0Var = e9.i0.f8757b;
        f3574b = new s1(e9.a1.f8720e);
        String str = e2.d0.f8537a;
        f3575c = Integer.toString(0, 36);
    }

    public s1(e9.a1 a1Var) {
        this.f3576a = e9.i0.v(a1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.i0 i0Var = this.f3576a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i11);
            boolean[] zArr = r1Var.f3523e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (r1Var.f3521b.f3338c == i10) {
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
        if (obj != null && s1.class == obj.getClass()) {
            return this.f3576a.equals(((s1) obj).f3576a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3576a.hashCode();
    }
}
