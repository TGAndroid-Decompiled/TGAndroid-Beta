package j3;
public final class q2 implements g {
    public static final q2 f9393b;
    public final s8.v f9394a;

    static {
        s8.t tVar = s8.v.f47174b;
        f9393b = new q2(s8.i0.f47139e);
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
    }

    public q2(s8.v vVar) {
        this.f9394a = s8.v.t(vVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            s8.v vVar = this.f9394a;
            if (i11 >= vVar.size()) {
                return false;
            }
            p2 p2Var = (p2) vVar.get(i11);
            boolean[] zArr = p2Var.f9381e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (p2Var.f9379b.f16575c == i10) {
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
        if (obj != null && q2.class == obj.getClass()) {
            return this.f9394a.equals(((q2) obj).f9394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9394a.hashCode();
    }
}
