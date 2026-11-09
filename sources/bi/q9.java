package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wp0;
public final class q9 implements q0.a {
    public final int f4582a;
    public final Object f4583b;

    public q9(Object obj, int i7) {
        this.f4582a = i7;
        this.f4583b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j3;
        int i7 = this.f4582a;
        boolean z9 = true;
        Object obj2 = this.f4583b;
        switch (i7) {
            case 0:
                v10 v10Var = (v10) obj2;
                int i10 = ((f5.f) obj).f11151a;
                if (i10 != 0) {
                    z9 = false;
                }
                if (z9) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z9 + " " + j3);
                org.telegram.messenger.g0.h3(new u7(v10Var, z9, j3, 0));
                return;
            case 1:
                fi.o5.Y((fi.x9) obj2, (Integer) obj);
                return;
            case 2:
                hi.a3 a3Var = (hi.a3) obj2;
                Float f10 = (Float) obj;
                a3Var.E.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(xq.f40458f);
                    duration.addUpdateListener(new hi.w1(a3Var, 1));
                    duration.addListener(new t5(a3Var, 27));
                    duration.start();
                    return;
                }
                return;
            case 3:
                hi.c4 c4Var = (hi.c4) obj2;
                Float f11 = (Float) obj;
                c4Var.I.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(xq.f40458f);
                    duration2.addUpdateListener(new hi.t3(c4Var, 1));
                    duration2.addListener(new t5(c4Var, 28));
                    duration2.start();
                    c4Var.P();
                    return;
                }
                return;
            case 4:
                ((jg.n) obj2).R.L4(((Float) obj).floatValue());
                return;
            case 5:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.f1845a) {
                    case 1:
                        fi.x9 x9Var = (fi.x9) nVar.d;
                        x9Var.F0(false);
                        sg.l0 l0Var = (sg.l0) nVar.f1847c;
                        l0Var.h(intValue, true);
                        l0Var.g();
                        x9Var.setNewColor(intValue);
                        fi.w4 w4Var = x9Var.f12521f1;
                        w4Var.setSelectedColorIndex(l0Var.d());
                        w4Var.getAdapter().f();
                        return;
                    default:
                        wp0 wp0Var = (wp0) nVar.d;
                        wp0Var.w0(false);
                        sg.l0 l0Var2 = wp0Var.E1;
                        l0Var2.h(intValue, true);
                        l0Var2.g();
                        wp0Var.setNewColor(intValue);
                        tg.d0 d0Var = wp0Var.f55697p1;
                        d0Var.setSelectedColorIndex(l0Var2.d());
                        d0Var.getAdapter().f();
                        return;
                }
            default:
                zh.b4 b4Var = (zh.b4) obj2;
                if (((f5.f) obj).f11151a == 0) {
                    org.telegram.messenger.g0.h3(new zh.r3(b4Var, 1));
                    return;
                }
                return;
        }
    }
}
