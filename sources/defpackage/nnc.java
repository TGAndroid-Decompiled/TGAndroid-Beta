package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class nnc implements pcc {
    public final byte a;
    public final snc b;
    public final String[] c;

    public nnc(snc sncVar, String[] strArr, byte b) {
        this.a = b;
        this.b = sncVar;
        this.c = strArr;
    }

    @Override
    public final void a(Object obj) {
        co3 co3Var;
        boolean z;
        co3 co3Var2;
        vnc vncVar;
        byte b = this.a;
        boolean z2 = true;
        String[] strArr = this.c;
        snc sncVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                if (num.intValue() == 0) {
                    DictationAsr.c0(true);
                    return;
                }
                String str = strArr[num.intValue() - 1];
                nm3 N = DictationAsr.N(str);
                if (N == null || DictationAsr.z(N)) {
                    z2 = false;
                }
                DictationAsr.b0(str);
                DictationAsr.t(N);
                if (z2 && sncVar.c == 2 && sncVar.Y == null && sncVar.g0 == null) {
                    sncVar.N.clear();
                    sncVar.q();
                }
                String L = bn3.L(str);
                sncVar.n0 = L;
                knc kncVar = sncVar.L;
                if (kncVar != null) {
                    kncVar.setLanguage(L);
                }
                if (sncVar.c == 2 && (co3Var = sncVar.f) != null) {
                    co3Var.j(str);
                }
                sncVar.v();
                return;
            default:
                sncVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.c0(true);
                    return;
                }
                String str2 = strArr[num.intValue() - 1];
                nm3 N2 = DictationAsr.N(str2);
                if (N2 != null && !DictationAsr.z(N2)) {
                    z = true;
                } else {
                    z = false;
                }
                DictationAsr.b0(str2);
                DictationAsr.t(N2);
                if (z && sncVar.c == 2 && (vncVar = sncVar.h) != null) {
                    sncVar.n = "";
                    if (vncVar.Q1) {
                        vncVar.y1 = null;
                    }
                    vncVar.l0 = "";
                    vncVar.z1 = -1;
                    vncVar.m0 = null;
                    vncVar.p0.clear();
                    vncVar.V0 = true;
                    vncVar.E0 = 0.0f;
                    vncVar.D0 = 0.0f;
                    vncVar.F0 = 0.0f;
                    vncVar.G0 = 0.0f;
                    vncVar.I0 = -1.0f;
                    vncVar.H0 = -1.0f;
                    vncVar.K0 = -1.0f;
                    vncVar.M0 = false;
                    vncVar.T0 = 0L;
                    vncVar.U0 = 0.0f;
                    vncVar.B0 = true;
                    vncVar.a1 = true;
                    vncVar.invalidate();
                }
                vnc vncVar2 = sncVar.h;
                if (vncVar2 != null) {
                    vncVar2.setLanguage(bn3.L(str2));
                }
                if (sncVar.c == 2 && (co3Var2 = sncVar.f) != null) {
                    co3Var2.j(str2);
                }
                sncVar.v();
                return;
        }
    }
}
