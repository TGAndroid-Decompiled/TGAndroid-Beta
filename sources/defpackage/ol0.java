package defpackage;
public final class ol0 implements ml0 {
    public final byte a;
    public final wjb b;

    public ol0(wjb wjbVar, byte b) {
        this.a = b;
        this.b = wjbVar;
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        byte b = this.a;
        wjb wjbVar2 = this.b;
        switch (b) {
            case 0:
                if (!nod.d(y6c.t0, wjbVar2)) {
                    return bm2.o(bkb.v0(bkb.Ie, wjbVar), 255);
                }
                if (e66.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                return bkb.p1(f, bkb.v0(bkb.Ie, wjbVar));
            case 1:
                if (!nod.d(y6c.t0, wjbVar2)) {
                    if (z) {
                        i = bkb.r8;
                    } else {
                        i = bkb.Se;
                    }
                    return bm2.o(bkb.v0(i, wjbVar), 255);
                }
                if (e66.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return bkb.p1(f2, bkb.v0(bkb.Se, wjbVar));
            default:
                if (!nod.d(y6c.t0, wjbVar2)) {
                    if (z) {
                        i2 = bkb.r8;
                    } else {
                        i2 = bkb.Se;
                    }
                    return bm2.o(bkb.v0(i2, wjbVar), 255);
                }
                if (e66.e(262144)) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.76f;
                }
                return bkb.p1(f3, bkb.v0(bkb.Se, wjbVar));
        }
    }
}
