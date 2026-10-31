package ig;

import android.animation.ValueAnimator;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.u1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.bk0;
import org.telegram.ui.er0;
import ph.g4;
import ph.w3;
import vh.b4;
import vh.n3;
import vh.s7;
import xh.c3;
import xh.i3;
import xh.m2;
public final class i implements q0.a {
    public final int f8324a;
    public final Object f8325b;

    public i(Object obj, int i10) {
        this.f8324a = i10;
        this.f8325b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j10;
        int i10 = this.f8324a;
        boolean z10 = false;
        Object obj2 = this.f8325b;
        switch (i10) {
            case 0:
                androidx.activity.o oVar = (androidx.activity.o) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (oVar.f952a) {
                    case 3:
                        er0 er0Var = (er0) oVar.d;
                        er0Var.v0(false);
                        s0 s0Var = er0Var.E1;
                        s0Var.h(intValue, true);
                        s0Var.g();
                        er0Var.setNewColor(intValue);
                        jg.m0 m0Var = er0Var.f10183p1;
                        m0Var.setSelectedColorIndex(s0Var.d());
                        m0Var.getAdapter().f();
                        return;
                    default:
                        s7 s7Var = (s7) oVar.d;
                        s7Var.F0(false);
                        s0 s0Var2 = (s0) oVar.f954c;
                        s0Var2.h(intValue, true);
                        s0Var2.g();
                        s7Var.setNewColor(intValue);
                        n3 n3Var = s7Var.f50963f1;
                        n3Var.setSelectedColorIndex(s0Var2.d());
                        n3Var.getAdapter().f();
                        return;
                }
            case 1:
                g4 g4Var = (g4) obj2;
                if (((c5.g) obj).f3785a == 0) {
                    org.telegram.messenger.i0.g3(new w3(g4Var, 1));
                    return;
                }
                return;
            case 2:
                j20 j20Var = (j20) obj2;
                int i11 = ((c5.g) obj).f3785a;
                if (i11 == 0) {
                    z10 = true;
                }
                if (z10) {
                    j10 = null;
                } else {
                    j10 = u1.j(i11);
                }
                f8.b("StarsController.buy onResult " + z10 + " " + j10);
                org.telegram.messenger.i0.g3(new bk0(j20Var, z10, j10, 14));
                return;
            case 3:
                b4.Y((s7) obj2, (Integer) obj);
                return;
            case 4:
                m2 m2Var = (m2) obj2;
                Float f7 = (Float) obj;
                m2Var.E.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(gr.f26495f);
                    duration.addUpdateListener(new xh.p1(m2Var, 1));
                    duration.addListener(new sg.r(m2Var, 24));
                    duration.start();
                    return;
                }
                return;
            case 5:
                i3 i3Var = (i3) obj2;
                Float f10 = (Float) obj;
                i3Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(gr.f26495f);
                    duration2.addUpdateListener(new c3(i3Var, 1));
                    duration2.addListener(new sg.r(i3Var, 25));
                    duration2.start();
                    i3Var.O();
                    return;
                }
                return;
            default:
                ((zf.m) obj2).R.K4(((Float) obj).floatValue());
                return;
        }
    }
}
