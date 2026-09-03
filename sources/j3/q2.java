package j3;
public final class q2 implements g {
    public static final q2 f8784b;
    public final s8.v f8785a;

    static {
        s8.t tVar = s8.v.f44222b;
        f8784b = new q2(s8.i0.e);
        int i10 = h5.d0.f6924a;
        Integer.toString(0, 36);
    }

    public q2(s8.v vVar) {
        this.f8785a = s8.v.t(vVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            s8.v vVar = this.f8785a;
            if (i11 >= vVar.size()) {
                return false;
            }
            p2 p2Var = (p2) vVar.get(i11);
            boolean[] zArr = p2Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (p2Var.f8772b.f16402c == i10) {
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
            return this.f8785a.equals(((q2) obj).f8785a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8785a.hashCode();
    }
}
