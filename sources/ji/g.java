package ji;

import ai.c2;
import ai.n0;
import ai.t;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationAsr;
public final class g implements x10 {
    public final int f17940a;
    public final m f17941b;
    public final String[] f17942c;

    public g(m mVar, String[] strArr, int i7) {
        this.f17940a = i7;
        this.f17941b = mVar;
        this.f17942c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        c2 c2Var;
        p pVar;
        c2 c2Var2;
        Integer num = (Integer) obj;
        switch (this.f17940a) {
            case 0:
                m mVar = this.f17941b;
                mVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.T(true);
                    return;
                }
                String str = this.f17942c[num.intValue() - 1];
                t H = DictationAsr.H(str);
                if (H != null && !DictationAsr.w(H)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.S(str);
                DictationAsr.r(H);
                if (z10 && mVar.f17966c == 2 && (pVar = mVar.h) != null) {
                    mVar.f17979n = "";
                    if (pVar.P1) {
                        pVar.f18046x1 = null;
                    }
                    pVar.f18017k0 = "";
                    pVar.f18049y1 = -1;
                    pVar.f18019l0 = null;
                    pVar.f18023o0.clear();
                    pVar.U0 = true;
                    pVar.D0 = 0.0f;
                    pVar.C0 = 0.0f;
                    pVar.E0 = 0.0f;
                    pVar.F0 = 0.0f;
                    pVar.H0 = -1.0f;
                    pVar.G0 = -1.0f;
                    pVar.J0 = -1.0f;
                    pVar.L0 = false;
                    pVar.S0 = 0L;
                    pVar.T0 = 0.0f;
                    pVar.A0 = true;
                    pVar.Z0 = true;
                    pVar.invalidate();
                }
                p pVar2 = mVar.h;
                if (pVar2 != null) {
                    pVar2.setLanguage(n0.p(str));
                }
                if (mVar.f17966c == 2 && (c2Var = mVar.f17971f) != null) {
                    c2Var.p(str);
                }
                mVar.u();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.T(true);
                    return;
                }
                String str2 = this.f17942c[num.intValue() - 1];
                t H2 = DictationAsr.H(str2);
                z11 = (H2 == null || DictationAsr.w(H2)) ? false : false;
                DictationAsr.S(str2);
                DictationAsr.r(H2);
                m mVar2 = this.f17941b;
                if (z11 && mVar2.f17966c == 2 && mVar2.X == null && mVar2.f17970e0 == null) {
                    mVar2.M.clear();
                    mVar2.p();
                }
                String p10 = n0.p(str2);
                mVar2.f17978l0 = p10;
                e eVar = mVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(p10);
                }
                if (mVar2.f17966c == 2 && (c2Var2 = mVar2.f17971f) != null) {
                    c2Var2.p(str2);
                }
                mVar2.u();
                return;
        }
    }
}
