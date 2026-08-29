package j3;
public final class t2 implements g {
    public static final t2 f10810b;
    public final q8.z f10811a;

    static {
        q8.x xVar = q8.z.f46511b;
        f10810b = new t2(q8.l0.f46462e);
        int i10 = f5.d0.f6579a;
        Integer.toString(0, 36);
    }

    public t2(q8.z zVar) {
        this.f10811a = q8.z.u(zVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            q8.z zVar = this.f10811a;
            if (i11 >= zVar.size()) {
                return false;
            }
            s2 s2Var = (s2) zVar.get(i11);
            boolean[] zArr = s2Var.f10769e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (zArr[i12]) {
                    if (s2Var.f10767b.f14349c == i10) {
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
        if (obj != null && t2.class == obj.getClass()) {
            return this.f10811a.equals(((t2) obj).f10811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10811a.hashCode();
    }
}
