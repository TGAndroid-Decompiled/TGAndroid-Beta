package ji;

import ai.e2;
import ai.p0;
import ai.t;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements x10 {
    public final int f17960a;
    public final o f17961b;
    public final String[] f17962c;

    public f(o oVar, String[] strArr, int i7) {
        this.f17960a = i7;
        this.f17961b = oVar;
        this.f17962c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        e2 e2Var;
        r rVar;
        e2 e2Var2;
        Integer num = (Integer) obj;
        switch (this.f17960a) {
            case 0:
                o oVar = this.f17961b;
                oVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.Y(true);
                    return;
                }
                String str = this.f17962c[num.intValue() - 1];
                t J = DictationAsr.J(str);
                if (J != null && !DictationAsr.y(J)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.X(str);
                DictationAsr.t(J);
                if (z10 && oVar.f17994c == 2 && (rVar = oVar.h) != null) {
                    oVar.f18007n = "";
                    if (rVar.P1) {
                        rVar.f18074x1 = null;
                    }
                    rVar.f18045k0 = "";
                    rVar.f18077y1 = -1;
                    rVar.f18047l0 = null;
                    rVar.f18051o0.clear();
                    rVar.U0 = true;
                    rVar.D0 = 0.0f;
                    rVar.C0 = 0.0f;
                    rVar.E0 = 0.0f;
                    rVar.F0 = 0.0f;
                    rVar.H0 = -1.0f;
                    rVar.G0 = -1.0f;
                    rVar.J0 = -1.0f;
                    rVar.L0 = false;
                    rVar.S0 = 0L;
                    rVar.T0 = 0.0f;
                    rVar.A0 = true;
                    rVar.Z0 = true;
                    rVar.invalidate();
                }
                r rVar2 = oVar.h;
                if (rVar2 != null) {
                    rVar2.setLanguage(p0.H(str));
                }
                if (oVar.f17994c == 2 && (e2Var = oVar.f17999f) != null) {
                    e2Var.p(str);
                }
                oVar.t();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.Y(true);
                    return;
                }
                String str2 = this.f17962c[num.intValue() - 1];
                t J2 = DictationAsr.J(str2);
                z11 = (J2 == null || DictationAsr.y(J2)) ? false : false;
                DictationAsr.X(str2);
                DictationAsr.t(J2);
                o oVar2 = this.f17961b;
                if (z11 && oVar2.f17994c == 2 && oVar2.X == null && oVar2.f17998e0 == null) {
                    oVar2.M.clear();
                    oVar2.o();
                }
                String H = p0.H(str2);
                oVar2.f18006l0 = H;
                e eVar = oVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(H);
                }
                if (oVar2.f17994c == 2 && (e2Var2 = oVar2.f17999f) != null) {
                    e2Var2.p(str2);
                }
                oVar2.t();
                return;
        }
    }
}
