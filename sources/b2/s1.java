package b2;
public final class s1 {
    public static final s1 f3319b;
    public static final String f3320c;
    public final e9.i0 f3321a;

    static {
        e9.g0 g0Var = e9.i0.f8084b;
        f3319b = new s1(e9.a1.e);
        String str = e2.d0.f7888a;
        f3320c = Integer.toString(0, 36);
    }

    public s1(e9.a1 a1Var) {
        this.f3321a = e9.i0.v(a1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.i0 i0Var = this.f3321a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i11);
            boolean[] zArr = r1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (r1Var.f3268b.f3093c == i10) {
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
            return this.f3321a.equals(((s1) obj).f3321a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3321a.hashCode();
    }
}
