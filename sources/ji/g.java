package ji;

import ai.l0;
import ai.w1;
import org.telegram.messenger.w10;
import org.telegram.ui.Dictation.DictationAsr;
public final class g implements w10 {
    public final int f18034a;
    public final n f18035b;
    public final String[] f18036c;

    public g(n nVar, String[] strArr, int i7) {
        this.f18034a = i7;
        this.f18035b = nVar;
        this.f18036c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        w1 w1Var;
        q qVar;
        w1 w1Var2;
        Integer num = (Integer) obj;
        switch (this.f18034a) {
            case 0:
                n nVar = this.f18035b;
                nVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.b0(true);
                    return;
                }
                String str = this.f18036c[num.intValue() - 1];
                ai.q M = DictationAsr.M(str);
                if (M != null && !DictationAsr.A(M)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.a0(str);
                DictationAsr.v(M);
                if (z10 && nVar.f18062c == 2 && (qVar = nVar.h) != null) {
                    nVar.f18075n = "";
                    if (qVar.P1) {
                        qVar.f18142x1 = null;
                    }
                    qVar.f18113k0 = "";
                    qVar.f18145y1 = -1;
                    qVar.f18115l0 = null;
                    qVar.f18119o0.clear();
                    qVar.U0 = true;
                    qVar.D0 = 0.0f;
                    qVar.C0 = 0.0f;
                    qVar.E0 = 0.0f;
                    qVar.F0 = 0.0f;
                    qVar.H0 = -1.0f;
                    qVar.G0 = -1.0f;
                    qVar.J0 = -1.0f;
                    qVar.L0 = false;
                    qVar.S0 = 0L;
                    qVar.T0 = 0.0f;
                    qVar.A0 = true;
                    qVar.Z0 = true;
                    qVar.invalidate();
                }
                q qVar2 = nVar.h;
                if (qVar2 != null) {
                    qVar2.setLanguage(l0.F(str));
                }
                if (nVar.f18062c == 2 && (w1Var = nVar.f18067f) != null) {
                    w1Var.j(str);
                }
                nVar.s();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.b0(true);
                    return;
                }
                String str2 = this.f18036c[num.intValue() - 1];
                ai.q M2 = DictationAsr.M(str2);
                z11 = (M2 == null || DictationAsr.A(M2)) ? false : false;
                DictationAsr.a0(str2);
                DictationAsr.v(M2);
                n nVar2 = this.f18035b;
                if (z11 && nVar2.f18062c == 2 && nVar2.X == null && nVar2.f18066e0 == null) {
                    nVar2.M.clear();
                    nVar2.m();
                }
                String F = l0.F(str2);
                nVar2.f18074l0 = F;
                e eVar = nVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(F);
                }
                if (nVar2.f18062c == 2 && (w1Var2 = nVar2.f18067f) != null) {
                    w1Var2.j(str2);
                }
                nVar2.s();
                return;
        }
    }
}
