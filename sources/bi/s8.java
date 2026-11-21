package bi;

import android.animation.ValueAnimator;
import hi.u9;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.vp0;
public final class s8 implements q0.a {
    public final int f4094a;
    public final Object f4095b;

    public s8(Object obj, int i7) {
        this.f4094a = i7;
        this.f4095b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String j3;
        int i7 = this.f4094a;
        boolean z10 = true;
        Object obj2 = this.f4095b;
        switch (i7) {
            case 0:
                d9 d9Var = (d9) obj2;
                if (((f5.f) obj).f11312a == 0) {
                    org.telegram.messenger.g0.g3(new r8(d9Var, 1));
                    return;
                }
                return;
            case 1:
                q10 q10Var = (q10) obj2;
                int i10 = ((f5.f) obj).f11312a;
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
                hi.k5.Y((u9) obj2, (Integer) obj);
                return;
            case 3:
                ((jg.m) obj2).S.T4(((Float) obj).floatValue());
                return;
            case 4:
                ki.s2 s2Var = (ki.s2) obj2;
                Float f10 = (Float) obj;
                s2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(nr.f37956f);
                    duration.addUpdateListener(new ki.r1(s2Var, 1));
                    duration.addListener(new ai.k0(s2Var, 29));
                    duration.start();
                    return;
                }
                return;
            case 5:
                ki.s3 s3Var = (ki.s3) obj2;
                Float f11 = (Float) obj;
                s3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(nr.f37956f);
                    duration2.addUpdateListener(new ki.k3(s3Var, 1));
                    duration2.addListener(new ki.m3(s3Var, 0));
                    duration2.start();
                    s3Var.Q();
                    return;
                }
                return;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.f1799a) {
                    case 1:
                        u9 u9Var = (u9) nVar.d;
                        u9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.f1801c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        u9Var.setNewColor(intValue);
                        hi.s4 s4Var = u9Var.f14879g1;
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
                        tg.e0 e0Var = vp0Var.f57924q1;
                        e0Var.setSelectedColorIndex(k0Var2.d());
                        e0Var.getAdapter().f();
                        return;
                }
        }
    }
}
