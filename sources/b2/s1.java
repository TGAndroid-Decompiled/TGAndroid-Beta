package b2;
public final class s1 {
    public static final s1 f2407b;
    public static final String f2408c;
    public final e9.i0 f2409a;

    static {
        e9.g0 g0Var = e9.i0.f8985b;
        f2407b = new s1(e9.a1.f8948e);
        String str = e2.d0.f8765a;
        f2408c = Integer.toString(0, 36);
    }

    public s1(e9.a1 a1Var) {
        this.f2409a = e9.i0.v(a1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.i0 i0Var = this.f2409a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i11);
            boolean[] zArr = r1Var.f2356e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (r1Var.f2354b.f2171c == i10) {
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
            return this.f2409a.equals(((s1) obj).f2409a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2409a.hashCode();
    }
}
