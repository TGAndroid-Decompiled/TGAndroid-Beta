package defpackage;
public final class zv0 implements xr3 {
    public final byte a;
    public final Object b;

    public zv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((on) obj).e();
                return;
            case 1:
                m21 m21Var = (m21) obj;
                if (m21Var.d == ylaVar) {
                    m21Var.d = null;
                    return;
                }
                return;
            case 2:
                z01 z01Var = (z01) obj;
                if (!z) {
                    z01Var.run();
                    return;
                }
                return;
            case 3:
                da1 da1Var = (da1) obj;
                yla ylaVar2 = da1Var.E;
                if (ylaVar2 != null) {
                    ylaVar2.d();
                    da1Var.E = null;
                    return;
                }
                return;
            case 4:
                r32 r32Var = (r32) obj;
                r32Var.m0 = null;
                r32Var.n0 = 1.0f;
                r32Var.m0();
                return;
            case 5:
                qz7 qz7Var = (qz7) obj;
                if (ylaVar == qz7Var.c) {
                    qz7Var.c = null;
                    return;
                }
                return;
            case 6:
                ((d98) obj).E();
                return;
            case 7:
                j4a j4aVar = (j4a) obj;
                j4aVar.q = false;
                j4aVar.dismiss();
                return;
            case 8:
                k4a k4aVar = (k4a) obj;
                k4aVar.s = false;
                k4aVar.r = false;
                if (!z) {
                    ylaVar.d();
                }
                if (ylaVar == k4aVar.f) {
                    k4aVar.f = null;
                    return;
                }
                return;
            case 9:
                taa taaVar = (taa) obj;
                taaVar.z1.setVisibility(8);
                taaVar.u2.setVisibility(8);
                raa raaVar = taaVar.G1;
                raaVar.f = null;
                raaVar.f();
                taaVar.w2 = null;
                taaVar.H2 = false;
                return;
            case 10:
                taa taaVar2 = ((caa) obj).d;
                taaVar2.A1.setVisibility(8);
                taaVar2.B1.setVisibility(8);
                taaVar2.t2.setVisibility(8);
                taaVar2.w2 = null;
                return;
            case 11:
                ((waa) obj).c.setTag(2131296665, null);
                return;
            case 12:
                ((lnc) obj).f(z, f);
                return;
            default:
                qpc qpcVar = (qpc) obj;
                qpcVar.b0 = null;
                qpcVar.c0 = 1.0f;
                qpcVar.F0();
                return;
        }
    }
}
