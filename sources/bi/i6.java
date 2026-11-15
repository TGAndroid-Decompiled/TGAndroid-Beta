package bi;

import android.animation.ValueAnimator;
import hi.u9;
import org.telegram.messenger.a8;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.er;
import org.telegram.ui.tp0;
public final class i6 implements q0.a {
    public final int f3619a;
    public final Object f3620b;

    public i6(Object obj, int i7) {
        this.f3619a = i7;
        this.f3620b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j3;
        int i7 = this.f3619a;
        boolean z10 = true;
        Object obj2 = this.f3620b;
        switch (i7) {
            case 0:
                u6 u6Var = (u6) obj2;
                if (((f5.f) obj).f10978a == 0) {
                    org.telegram.messenger.g0.h3(new h6(u6Var, 1));
                    return;
                }
                return;
            case 1:
                s10 s10Var = (s10) obj2;
                int i10 = ((f5.f) obj).f10978a;
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.h3(new di.m6(s10Var, z10, j3, 0));
                return;
            case 2:
                hi.m5.Y((u9) obj2, (Integer) obj);
                return;
            case 3:
                ((jg.m) obj2).S.L4(((Float) obj).floatValue());
                return;
            case 4:
                ki.x2 x2Var = (ki.x2) obj2;
                Float f10 = (Float) obj;
                x2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(er.f34420f);
                    duration.addUpdateListener(new ki.w1(x2Var, 1));
                    duration.addListener(new ai.i0(x2Var, 29));
                    duration.start();
                    return;
                }
                return;
            case 5:
                ki.y3 y3Var = (ki.y3) obj2;
                Float f11 = (Float) obj;
                y3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(er.f34420f);
                    duration2.addUpdateListener(new ki.q3(y3Var, 1));
                    duration2.addListener(new ki.s3(y3Var, 0));
                    duration2.start();
                    y3Var.Q();
                    return;
                }
                return;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.f1788a) {
                    case 1:
                        u9 u9Var = (u9) nVar.d;
                        u9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.f1790c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        u9Var.setNewColor(intValue);
                        hi.u4 u4Var = u9Var.f14668g1;
                        u4Var.setSelectedColorIndex(k0Var.d());
                        u4Var.getAdapter().f();
                        return;
                    default:
                        tp0 tp0Var = (tp0) nVar.d;
                        tp0Var.w0(false);
                        sg.k0 k0Var2 = tp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        tp0Var.setNewColor(intValue);
                        tg.d0 d0Var = tp0Var.f57288q1;
                        d0Var.setSelectedColorIndex(k0Var2.d());
                        d0Var.getAdapter().f();
                        return;
                }
        }
    }
}
