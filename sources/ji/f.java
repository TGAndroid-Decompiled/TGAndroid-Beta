package ji;

import ai.k0;
import ai.v1;
import org.telegram.messenger.y10;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements y10 {
    public final int f17929a;
    public final n f17930b;
    public final String[] f17931c;

    public f(n nVar, String[] strArr, int i7) {
        this.f17929a = i7;
        this.f17930b = nVar;
        this.f17931c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        v1 v1Var;
        q qVar;
        v1 v1Var2;
        Integer num = (Integer) obj;
        switch (this.f17929a) {
            case 0:
                n nVar = this.f17930b;
                nVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.X(true);
                    return;
                }
                String str = this.f17931c[num.intValue() - 1];
                ai.p I = DictationAsr.I(str);
                if (I != null && !DictationAsr.y(I)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.W(str);
                DictationAsr.t(I);
                if (z10 && nVar.f17960c == 2 && (qVar = nVar.h) != null) {
                    nVar.f17973n = "";
                    if (qVar.P1) {
                        qVar.f18040x1 = null;
                    }
                    qVar.f18011k0 = "";
                    qVar.f18043y1 = -1;
                    qVar.f18013l0 = null;
                    qVar.f18017o0.clear();
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
                    qVar2.setLanguage(k0.H(str));
                }
                if (nVar.f17960c == 2 && (v1Var = nVar.f17965f) != null) {
                    v1Var.j(str);
                }
                nVar.t();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.X(true);
                    return;
                }
                String str2 = this.f17931c[num.intValue() - 1];
                ai.p I2 = DictationAsr.I(str2);
                z11 = (I2 == null || DictationAsr.y(I2)) ? false : false;
                DictationAsr.W(str2);
                DictationAsr.t(I2);
                n nVar2 = this.f17930b;
                if (z11 && nVar2.f17960c == 2 && nVar2.X == null && nVar2.f17964e0 == null) {
                    nVar2.M.clear();
                    nVar2.o();
                }
                String H = k0.H(str2);
                nVar2.f17972l0 = H;
                e eVar = nVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(H);
                }
                if (nVar2.f17960c == 2 && (v1Var2 = nVar2.f17965f) != null) {
                    v1Var2.j(str2);
                }
                nVar2.t();
                return;
        }
    }
}
