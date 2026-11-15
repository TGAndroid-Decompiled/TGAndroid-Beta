package e2;
public final class s1 {
    public static final s1 f10381b;
    public static final String f10382c;
    public final h9.i0 f10383a;

    static {
        h9.g0 g0Var = h9.i0.f13686b;
        f10381b = new s1(h9.s1.f13749e);
        String str = h2.l0.f13471a;
        f10382c = Integer.toString(0, 36);
    }

    public s1(h9.s1 s1Var) {
        this.f10383a = h9.i0.q(s1Var);
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            h9.i0 i0Var = this.f10383a;
            if (i10 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i10);
            boolean[] zArr = r1Var.f10377e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (zArr[i11]) {
                    if (r1Var.f10375b.f10211c == i7) {
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
            return this.f10383a.equals(((s1) obj).f10383a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10383a.hashCode();
    }
}
