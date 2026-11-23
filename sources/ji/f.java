package ji;

import ai.f2;
import ai.p0;
import ai.t;
import org.telegram.messenger.y10;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements y10 {
    public final int f17963a;
    public final o f17964b;
    public final String[] f17965c;

    public f(o oVar, String[] strArr, int i7) {
        this.f17963a = i7;
        this.f17964b = oVar;
        this.f17965c = strArr;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        f2 f2Var;
        r rVar;
        f2 f2Var2;
        Integer num = (Integer) obj;
        switch (this.f17963a) {
            case 0:
                o oVar = this.f17964b;
                oVar.getClass();
                if (num.intValue() == 0) {
                    DictationAsr.Y(true);
                    return;
                }
                String str = this.f17965c[num.intValue() - 1];
                t J = DictationAsr.J(str);
                if (J != null && !DictationAsr.y(J)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DictationAsr.X(str);
                DictationAsr.t(J);
                if (z10 && oVar.f17997c == 2 && (rVar = oVar.h) != null) {
                    oVar.f18010n = "";
                    if (rVar.P1) {
                        rVar.f18077x1 = null;
                    }
                    rVar.f18048k0 = "";
                    rVar.f18080y1 = -1;
                    rVar.f18050l0 = null;
                    rVar.f18054o0.clear();
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
                if (oVar.f17997c == 2 && (f2Var = oVar.f18002f) != null) {
                    f2Var.q(str);
                }
                oVar.t();
                return;
            default:
                boolean z11 = true;
                if (num.intValue() == 0) {
                    DictationAsr.Y(true);
                    return;
                }
                String str2 = this.f17965c[num.intValue() - 1];
                t J2 = DictationAsr.J(str2);
                z11 = (J2 == null || DictationAsr.y(J2)) ? false : false;
                DictationAsr.X(str2);
                DictationAsr.t(J2);
                o oVar2 = this.f17964b;
                if (z11 && oVar2.f17997c == 2 && oVar2.X == null && oVar2.f18001e0 == null) {
                    oVar2.M.clear();
                    oVar2.o();
                }
                String H = p0.H(str2);
                oVar2.f18009l0 = H;
                e eVar = oVar2.K;
                if (eVar != null) {
                    eVar.setLanguage(H);
                }
                if (oVar2.f17997c == 2 && (f2Var2 = oVar2.f18002f) != null) {
                    f2Var2.q(str2);
                }
                oVar2.t();
                return;
        }
    }
}
