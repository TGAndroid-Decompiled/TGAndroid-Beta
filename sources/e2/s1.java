package e2;
public final class s1 {
    public static final s1 f10550b;
    public static final String f10551c;
    public final h9.i0 f10552a;

    static {
        h9.g0 g0Var = h9.i0.f14331b;
        f10550b = new s1(h9.t1.f14399e);
        String str = h2.m0.f14114a;
        f10551c = Integer.toString(0, 36);
    }

    public s1(h9.t1 t1Var) {
        this.f10552a = h9.i0.q(t1Var);
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            h9.i0 i0Var = this.f10552a;
            if (i10 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i10);
            boolean[] zArr = r1Var.f10546e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (zArr[i11]) {
                    if (r1Var.f10544b.f10380c == i7) {
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
        if (obj != null && s1.class == obj.getClass()) {
            return this.f10552a.equals(((s1) obj).f10552a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10552a.hashCode();
    }
}
