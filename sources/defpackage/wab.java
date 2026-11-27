package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
public final class wab extends dx7 {
    public boolean n2;
    public final sbb o2;

    public wab(sbb sbbVar, Context context, boolean z, File file, boolean z2, boolean z3, rbb rbbVar, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, c8b c8bVar, int i3, int i4, fo6 fo6Var, tl0 tl0Var, x53 x53Var, o00 o00Var, hbb hbbVar) {
        super(context, z, file, z2, z3, rbbVar, activity, i, bitmap, bitmap2, i2, arrayList, c8bVar, i3, i4, fo6Var, tl0Var, x53Var, o00Var, hbbVar);
        this.o2 = sbbVar;
    }

    @Override
    public final void B(boolean z) {
        sbb sbbVar = this.o2;
        sbbVar.p1.a(true, z, sbbVar.j0);
    }

    @Override
    public final void C() {
        sbb sbbVar = this.o2;
        sbbVar.w1.N0(false);
        sbbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = sbbVar.d1.animate().alpha(0.0f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        if (sbbVar.h0 != 2) {
            sbbVar.Z0.clearAnimation();
            sbbVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(k43Var).start();
        }
        U0(o(), false);
    }

    public final void U0(boolean z, boolean z2) {
        long j;
        sbb sbbVar = this.o2;
        j5c j5cVar = sbbVar.q1;
        if (z) {
            j5cVar.setVisibility(0);
            sbbVar.q1.setAlpha(0.0f);
            sbbVar.q1.clearAnimation();
            sbbVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.g).start();
            return;
        }
        j5cVar.a(false, z2);
        sbbVar.q1.clearAnimation();
        ViewPropertyAnimator interpolator = sbbVar.q1.animate().alpha(0.0f).withEndAction(new ew7(this, (byte) 1)).setDuration(180L).setInterpolator(k43.g);
        if (z2) {
            j = 500;
        } else {
            j = 0;
        }
        interpolator.setStartDelay(j).start();
    }

    @Override
    public final void d(boolean z) {
        boolean z2;
        sbb sbbVar = this.o2;
        sbbVar.p1.b(sbbVar.d1.getText());
        jm8 jm8Var = sbbVar.p1;
        if (z && this.n2) {
            z2 = true;
        } else {
            z2 = false;
        }
        jm8Var.a(false, z2, null);
    }

    @Override
    public final void e(boolean z) {
        float f;
        h44 h44Var;
        if (!o()) {
            z = false;
        }
        sbb sbbVar = this.o2;
        sbbVar.d1.clearAnimation();
        ViewPropertyAnimator animate = sbbVar.d1.animate();
        float f2 = 0.0f;
        if (sbbVar.h0 == -1) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        sbbVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = sbbVar.Z0.animate();
        int i = sbbVar.h0;
        if (i == -1 || i == 2) {
            f2 = 1.0f;
        }
        animate2.alpha(f2).setDuration(180L).setInterpolator(k43Var).start();
        U0(false, z);
        if (z && (h44Var = this.t0) != null) {
            B0(h44Var);
        }
        S0();
        this.Z1 = true;
        this.n2 = false;
    }

    @Override
    public final void f() {
        this.n2 = false;
        U0(o(), false);
        this.o2.p1.a(false, false, null);
    }

    @Override
    public final void g() {
        this.n2 = true;
        this.o2.w1.N0(false);
        U0(false, false);
    }

    @Override
    public final void j(boolean z) {
        this.o2.q1.a(z, false);
    }

    @Override
    public final void o0() {
        sbb sbbVar = this.o2;
        sbbVar.d1.f.d();
        sbbVar.k0(0, false, true);
        h44 h44Var = this.t0;
        if ((h44Var instanceof rlb) && !this.u0) {
            rlb rlbVar = (rlb) h44Var;
            if (rlbVar instanceof kc1) {
                kc1 kc1Var = (kc1) rlbVar;
                kc1Var.z();
                if (kc1Var.E0 == null) {
                    return;
                }
            }
            this.u0 = true;
            rlbVar.q();
            View focusedView = rlbVar.getFocusedView();
            focusedView.requestFocus();
            hl.E3(focusedView);
        }
    }

    @Override
    public final void x() {
        this.o2.w1.N0(false);
    }

    @Override
    public final void y0(boolean z) {
        sbb sbbVar = this.o2;
        hbb hbbVar = sbbVar.Y0;
        if (hbbVar != null) {
            hbbVar.x(6, z);
            a81 a81Var = sbbVar.k1;
            if (a81Var != null) {
                ((mf8) a81Var.c).a(sbbVar.Y0.j(), true);
            }
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null) {
            ibbVar.e0 = z;
            ibbVar.M.b(z);
        }
    }
}
