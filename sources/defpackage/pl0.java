package defpackage;
public final class pl0 implements nl0 {
    public final byte a;
    public final vnb b;

    public pl0(vnb vnbVar, byte b) {
        this.a = b;
        this.b = vnbVar;
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        byte b = this.a;
        vnb vnbVar2 = this.b;
        switch (b) {
            case 0:
                if (!dtd.d(yac.t0, vnbVar2)) {
                    return vm2.o(aob.v0(aob.Je, vnbVar), 255);
                }
                if (i86.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                return aob.p1(f, aob.v0(aob.Je, vnbVar));
            case 1:
                if (!dtd.d(yac.t0, vnbVar2)) {
                    if (z) {
                        i = aob.s8;
                    } else {
                        i = aob.Te;
                    }
                    return vm2.o(aob.v0(i, vnbVar), 255);
                }
                if (i86.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return aob.p1(f2, aob.v0(aob.Te, vnbVar));
            default:
                if (!dtd.d(yac.t0, vnbVar2)) {
                    if (z) {
                        i2 = aob.s8;
                    } else {
                        i2 = aob.Te;
                    }
                    return vm2.o(aob.v0(i2, vnbVar), 255);
                }
                if (i86.e(262144)) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.76f;
                }
                return aob.p1(f3, aob.v0(aob.Te, vnbVar));
        }
    }
}
