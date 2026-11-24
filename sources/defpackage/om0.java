package defpackage;
public final class om0 implements mm0 {
    public final byte a;
    public final ylb b;

    public om0(ylb ylbVar, byte b) {
        this.a = b;
        this.b = ylbVar;
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        byte b = this.a;
        ylb ylbVar2 = this.b;
        switch (b) {
            case 0:
                if (!qqd.d(z8c.t0, ylbVar2)) {
                    return on2.p(cmb.v0(cmb.Ie, ylbVar), 255);
                }
                if (e86.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                return cmb.p1(f, cmb.v0(cmb.Ie, ylbVar));
            case 1:
                if (!qqd.d(z8c.t0, ylbVar2)) {
                    if (z) {
                        i = cmb.r8;
                    } else {
                        i = cmb.Se;
                    }
                    return on2.p(cmb.v0(i, ylbVar), 255);
                }
                if (e86.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return cmb.p1(f2, cmb.v0(cmb.Se, ylbVar));
            default:
                if (!qqd.d(z8c.t0, ylbVar2)) {
                    if (z) {
                        i2 = cmb.r8;
                    } else {
                        i2 = cmb.Se;
                    }
                    return on2.p(cmb.v0(i2, ylbVar), 255);
                }
                if (e86.e(262144)) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.76f;
                }
                return cmb.p1(f3, cmb.v0(cmb.Se, ylbVar));
        }
    }
}
