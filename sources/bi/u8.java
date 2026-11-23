package bi;

import android.animation.ValueAnimator;
import hi.pa;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.vp0;
public final class u8 implements q0.a {
    public final int f4128a;
    public final Object f4129b;

    public u8(Object obj, int i7) {
        this.f4128a = i7;
        this.f4129b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j3;
        int i7 = this.f4128a;
        boolean z10 = true;
        Object obj2 = this.f4129b;
        switch (i7) {
            case 0:
                f9 f9Var = (f9) obj2;
                if (((f5.f) obj).f11277a == 0) {
                    org.telegram.messenger.g0.g3(new t8(f9Var, 1));
                    return;
                }
                return;
            case 1:
                p10 p10Var = (p10) obj2;
                int i10 = ((f5.f) obj).f11277a;
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(p10Var, z10, j3, 0));
                return;
            case 2:
                hi.v5.X((pa) obj2, (Integer) obj);
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
                    duration.setInterpolator(kr.f36858f);
                    duration.addUpdateListener(new ki.r1(t2Var, 1));
                    duration.addListener(new ai.g0(t2Var, 29));
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
                    duration2.setInterpolator(kr.f36858f);
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
                switch (nVar.f1758a) {
                    case 1:
                        pa paVar = (pa) nVar.d;
                        paVar.I0(false);
                        sg.j0 j0Var = (sg.j0) nVar.f1760c;
                        j0Var.h(intValue, true);
                        j0Var.g();
                        paVar.setNewColor(intValue);
                        hi.d5 d5Var = paVar.f15564g1;
                        d5Var.setSelectedColorIndex(j0Var.d());
                        d5Var.getAdapter().f();
                        return;
                    default:
                        vp0 vp0Var = (vp0) nVar.d;
                        vp0Var.z0(false);
                        sg.j0 j0Var2 = vp0Var.F1;
                        j0Var2.h(intValue, true);
                        j0Var2.g();
                        vp0Var.setNewColor(intValue);
                        tg.i0 i0Var = vp0Var.f58044q1;
                        i0Var.setSelectedColorIndex(j0Var2.d());
                        i0Var.getAdapter().f();
                        return;
                }
        }
    }
}
