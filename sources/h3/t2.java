package h3;
public final class t2 implements g {
    public static final t2 f9773b;
    public final o8.z f9774a;

    static {
        o8.x xVar = o8.z.f19105b;
        f9773b = new t2(o8.l0.f19056e);
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
    }

    public t2(o8.z zVar) {
        this.f9774a = o8.z.u(zVar);
    }

    public final boolean a(int i9) {
        int i10 = 0;
        while (true) {
            o8.z zVar = this.f9774a;
            if (i10 >= zVar.size()) {
                return false;
            }
            s2 s2Var = (s2) zVar.get(i10);
            boolean[] zArr = s2Var.f9732e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (zArr[i11]) {
                    if (s2Var.f9730b.f13483c == i9) {
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
        if (obj != null && t2.class == obj.getClass()) {
            return this.f9774a.equals(((t2) obj).f9774a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9774a.hashCode();
    }
}
