package h3;

public final class u2 implements g {

    public static final u2 f8210b;

    public final p8.z f8211a;

    static {
        p8.x xVar = p8.z.f45604b;
        f8210b = new u2(p8.l0.f45555e);
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
    }

    public u2(p8.z zVar) {
        this.f8211a = p8.z.u(zVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            p8.z zVar = this.f8211a;
            if (i11 >= zVar.size()) {
                return false;
            }
            t2 t2Var = (t2) zVar.get(i11);
            for (boolean z10 : t2Var.f8203e) {
                if (z10) {
                    if (t2Var.f8201b.f12585c != i10) {
                        break;
                    }
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u2.class != obj.getClass()) {
            return false;
        }
        return this.f8211a.equals(((u2) obj).f8211a);
    }

    public final int hashCode() {
        return this.f8211a.hashCode();
    }
}
