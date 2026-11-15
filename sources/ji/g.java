package ji;

import ai.c2;
import ai.n0;
import ai.t;
import org.telegram.messenger.z10;
import org.telegram.ui.Dictation.DictationAsr;
public final class g implements z10 {
    public final int f17547a;
    public final m f17548b;
    public final String[] f17549c;

    public g(m mVar, String[] strArr, int i7) {
        this.f17547a = i7;
        this.f17548b = mVar;
        this.f17549c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        c2 c2Var;
        p pVar;
        c2 c2Var2;
        Integer num = (Integer) obj;
        switch (this.f17547a) {
            case 0:
                m mVar = this.f17548b;
                mVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.T(true);
                    return;
                }
                String str = this.f17549c[num.intValue() - 1];
                t H = DictationAsr.H(str);
                if (H != null && !DictationAsr.w(H)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.S(str);
                DictationAsr.s(H);
                if (z10 && mVar.f17573c == 2 && (pVar = mVar.h) != null) {
                    mVar.f17586n = "";
                    if (pVar.N1) {
                        pVar.f17645v1 = null;
                    }
                    pVar.f17618i0 = "";
                    pVar.f17648w1 = -1;
                    pVar.f17620j0 = null;
                    pVar.m0.clear();
                    pVar.S0 = true;
                    pVar.B0 = 0.0f;
                    pVar.A0 = 0.0f;
                    pVar.C0 = 0.0f;
                    pVar.D0 = 0.0f;
                    pVar.F0 = -1.0f;
                    pVar.E0 = -1.0f;
                    pVar.H0 = -1.0f;
                    pVar.J0 = false;
                    pVar.Q0 = 0L;
                    pVar.R0 = 0.0f;
                    pVar.f17653y0 = true;
                    pVar.X0 = true;
                    pVar.invalidate();
                }
                p pVar2 = mVar.h;
                if (pVar2 != null) {
                    pVar2.setLanguage(n0.l(str));
                }
                if (mVar.f17573c == 2 && (c2Var = mVar.f17578f) != null) {
                    c2Var.p(str);
                }
                mVar.t();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.T(true);
                    return;
                }
                String str2 = this.f17549c[num.intValue() - 1];
                t H2 = DictationAsr.H(str2);
                z11 = (H2 == null || DictationAsr.w(H2)) ? false : false;
                DictationAsr.S(str2);
                DictationAsr.s(H2);
                m mVar2 = this.f17548b;
                if (z11 && mVar2.f17573c == 2 && mVar2.X == null && mVar2.f17577e0 == null) {
                    mVar2.M.clear();
                    mVar2.n();
                }
                String l10 = n0.l(str2);
                mVar2.f17585l0 = l10;
                e eVar = mVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(l10);
                }
                if (mVar2.f17573c == 2 && (c2Var2 = mVar2.f17578f) != null) {
                    c2Var2.p(str2);
                }
                mVar2.t();
                return;
        }
    }
}
