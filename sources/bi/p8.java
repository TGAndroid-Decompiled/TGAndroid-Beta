package bi;

import android.animation.ValueAnimator;
import hi.v9;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.vp0;
public final class p8 implements q0.a {
    public final int f3978a;
    public final Object f3979b;

    public p8(Object obj, int i7) {
        this.f3978a = i7;
        this.f3979b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j3;
        int i7 = this.f3978a;
        boolean z10 = true;
        Object obj2 = this.f3979b;
        switch (i7) {
            case 0:
                a9 a9Var = (a9) obj2;
                if (((f5.f) obj).f11286a == 0) {
                    org.telegram.messenger.g0.g3(new o8(a9Var, 1));
                    return;
                }
                return;
            case 1:
                q10 q10Var = (q10) obj2;
                int i10 = ((f5.f) obj).f11286a;
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(q10Var, z10, j3, 0));
                return;
            case 2:
                hi.l5.Y((v9) obj2, (Integer) obj);
                return;
            case 3:
                ((jg.m) obj2).S.T4(((Float) obj).floatValue());
                return;
            case 4:
                ki.t2 t2Var = (ki.t2) obj2;
                Float f10 = (Float) obj;
                t2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(lr.f37208f);
                    duration.addUpdateListener(new ki.s1(t2Var, 1));
                    duration.addListener(new ai.j0(t2Var, 29));
                    duration.start();
                    return;
                }
                return;
            case 5:
                ki.t3 t3Var = (ki.t3) obj2;
                Float f11 = (Float) obj;
                t3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(lr.f37208f);
                    duration2.addUpdateListener(new ki.l3(t3Var, 1));
                    duration2.addListener(new ki.n3(t3Var, 0));
                    duration2.start();
                    t3Var.Q();
                    return;
                }
                return;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.f1786a) {
                    case 1:
                        v9 v9Var = (v9) nVar.d;
                        v9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.f1788c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        v9Var.setNewColor(intValue);
                        hi.s4 s4Var = v9Var.f14907g1;
                        s4Var.setSelectedColorIndex(k0Var.d());
                        s4Var.getAdapter().f();
                        return;
                    default:
                        vp0 vp0Var = (vp0) nVar.d;
                        vp0Var.w0(false);
                        sg.k0 k0Var2 = vp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        vp0Var.setNewColor(intValue);
                        tg.d0 d0Var = vp0Var.f57870q1;
                        d0Var.setSelectedColorIndex(k0Var2.d());
                        d0Var.getAdapter().f();
                        return;
                }
        }
    }
}
