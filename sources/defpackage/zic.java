package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class zic implements p8c {
    public final byte a;
    public final gjc b;
    public final String[] c;

    public zic(gjc gjcVar, String[] strArr, byte b) {
        this.a = b;
        this.b = gjcVar;
        this.c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        ln3 ln3Var;
        jjc jjcVar;
        ln3 ln3Var2;
        byte b = this.a;
        boolean z2 = false;
        String[] strArr = this.c;
        gjc gjcVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                gjcVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.a0(true);
                    return;
                }
                String str = strArr[num.intValue() - 1];
                vl3 L = DictationAsr.L(str);
                if (L != null && !DictationAsr.y(L)) {
                    z = true;
                } else {
                    z = false;
                }
                DictationAsr.Z(str);
                DictationAsr.s(L);
                if (z && gjcVar.c == 2 && (jjcVar = gjcVar.h) != null) {
                    gjcVar.n = "";
                    if (jjcVar.P1) {
                        jjcVar.x1 = null;
                    }
                    jjcVar.k0 = "";
                    jjcVar.y1 = -1;
                    jjcVar.l0 = null;
                    jjcVar.o0.clear();
                    jjcVar.U0 = true;
                    jjcVar.D0 = 0.0f;
                    jjcVar.C0 = 0.0f;
                    jjcVar.E0 = 0.0f;
                    jjcVar.F0 = 0.0f;
                    jjcVar.H0 = -1.0f;
                    jjcVar.G0 = -1.0f;
                    jjcVar.J0 = -1.0f;
                    jjcVar.L0 = false;
                    jjcVar.S0 = 0L;
                    jjcVar.T0 = 0.0f;
                    jjcVar.A0 = true;
                    jjcVar.Z0 = true;
                    jjcVar.invalidate();
                }
                jjc jjcVar2 = gjcVar.h;
                if (jjcVar2 != null) {
                    jjcVar2.setLanguage(jm3.H(str));
                }
                if (gjcVar.c == 2 && (ln3Var = gjcVar.f) != null) {
                    ln3Var.j(str);
                }
                gjcVar.u();
                return;
            default:
                if (num.intValue() == 0) {
                    DictationAsr.a0(true);
                    return;
                }
                String str2 = strArr[num.intValue() - 1];
                vl3 L2 = DictationAsr.L(str2);
                if (L2 != null && !DictationAsr.y(L2)) {
                    z2 = true;
                }
                DictationAsr.Z(str2);
                DictationAsr.s(L2);
                if (z2 && gjcVar.c == 2 && gjcVar.X == null && gjcVar.e0 == null) {
                    gjcVar.M.clear();
                    gjcVar.p();
                }
                String H = jm3.H(str2);
                gjcVar.l0 = H;
                yic yicVar = gjcVar.K;
                if (yicVar != null) {
                    yicVar.setLanguage(H);
                }
                if (gjcVar.c == 2 && (ln3Var2 = gjcVar.f) != null) {
                    ln3Var2.j(str2);
                }
                gjcVar.u();
                return;
        }
    }
}
