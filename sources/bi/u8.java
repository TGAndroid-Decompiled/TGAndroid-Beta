package bi;

import android.animation.ValueAnimator;
import hi.v9;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.wp0;
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
                if (((f5.f) obj).f11278a == 0) {
                    org.telegram.messenger.g0.g3(new t8(f9Var, 1));
                    return;
                }
                return;
            case 1:
                r10 r10Var = (r10) obj2;
                int i10 = ((f5.f) obj).f11278a;
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(r10Var, z10, j3, 0));
                return;
            case 2:
                hi.l5.Y((v9) obj2, (Integer) obj);
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
                    duration.setInterpolator(nr.f37917f);
                    duration.addUpdateListener(new ki.r1(s2Var, 1));
                    duration.addListener(new ai.f0(s2Var, 29));
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
                    duration2.setInterpolator(nr.f37917f);
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
                switch (nVar.f1757a) {
                    case 1:
                        v9 v9Var = (v9) nVar.d;
                        v9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.f1759c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        v9Var.setNewColor(intValue);
                        hi.t4 t4Var = v9Var.f14894g1;
                        t4Var.setSelectedColorIndex(k0Var.d());
                        t4Var.getAdapter().f();
                        return;
                    default:
                        wp0 wp0Var = (wp0) nVar.d;
                        wp0Var.w0(false);
                        sg.k0 k0Var2 = wp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        wp0Var.setNewColor(intValue);
                        tg.e0 e0Var = wp0Var.f57893q1;
                        e0Var.setSelectedColorIndex(k0Var2.d());
                        e0Var.getAdapter().f();
                        return;
                }
        }
    }
}
