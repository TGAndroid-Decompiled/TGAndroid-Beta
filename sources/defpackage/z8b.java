package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
public final class z8b extends xv7 {
    public boolean t2;
    public final v9b u2;

    public z8b(v9b v9bVar, Context context, boolean z, File file, boolean z2, boolean z3, u9b u9bVar, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, g6b g6bVar, int i3, int i4, ao6 ao6Var, sm0 sm0Var, r63 r63Var, n10 n10Var, k9b k9bVar) {
        super(context, z, file, z2, z3, u9bVar, activity, i, bitmap, bitmap2, i2, arrayList, g6bVar, i3, i4, ao6Var, sm0Var, r63Var, n10Var, k9bVar);
        this.u2 = v9bVar;
    }

    @Override
    public final void B(boolean z) {
        v9b v9bVar = this.u2;
        v9bVar.p1.a(true, z, v9bVar.j0);
    }

    @Override
    public final void C() {
        v9b v9bVar = this.u2;
        v9bVar.w1.O0(false);
        v9bVar.d1.clearAnimation();
        ViewPropertyAnimator duration = v9bVar.d1.animate().alpha(0.0f).setDuration(180L);
        d53 d53Var = d53.g;
        duration.setInterpolator(d53Var).start();
        if (v9bVar.h0 != 2) {
            v9bVar.Z0.clearAnimation();
            v9bVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(d53Var).start();
        }
        V0(o(), false);
    }

    public final void V0(boolean z, boolean z2) {
        long j;
        v9b v9bVar = this.u2;
        k3c k3cVar = v9bVar.q1;
        if (z) {
            k3cVar.setVisibility(0);
            v9bVar.q1.setAlpha(0.0f);
            v9bVar.q1.clearAnimation();
            v9bVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(d53.g).start();
            return;
        }
        k3cVar.a(false, z2);
        v9bVar.q1.clearAnimation();
        ViewPropertyAnimator interpolator = v9bVar.q1.animate().alpha(0.0f).withEndAction(new yu7(this, (byte) 1)).setDuration(180L).setInterpolator(d53.g);
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
        v9b v9bVar = this.u2;
        v9bVar.p1.b(v9bVar.d1.getText());
        zk8 zk8Var = v9bVar.p1;
        if (z && this.t2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zk8Var.a(false, z2, null);
    }

    @Override
    public final void e(boolean z) {
        float f;
        w44 w44Var;
        if (!o()) {
            z = false;
        }
        v9b v9bVar = this.u2;
        v9bVar.d1.clearAnimation();
        ViewPropertyAnimator animate = v9bVar.d1.animate();
        float f2 = 0.0f;
        if (v9bVar.h0 == -1) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f).setDuration(180L);
        d53 d53Var = d53.g;
        duration.setInterpolator(d53Var).start();
        v9bVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = v9bVar.Z0.animate();
        int i = v9bVar.h0;
        if (i == -1 || i == 2) {
            f2 = 1.0f;
        }
        animate2.alpha(f2).setDuration(180L).setInterpolator(d53Var).start();
        V0(false, z);
        if (z && (w44Var = this.z0) != null) {
            B0(w44Var);
        }
        T0();
        this.f2 = true;
        this.t2 = false;
    }

    @Override
    public final void f() {
        this.t2 = false;
        V0(o(), false);
        this.u2.p1.a(false, false, null);
    }

    @Override
    public final void g() {
        this.t2 = true;
        this.u2.w1.O0(false);
        V0(false, false);
    }

    @Override
    public final void j(boolean z) {
        this.u2.q1.a(z, false);
    }

    @Override
    public final void o0() {
        v9b v9bVar = this.u2;
        v9bVar.d1.f.d();
        v9bVar.k0(0, false, true);
        w44 w44Var = this.z0;
        if ((w44Var instanceof xjb) && !this.A0) {
            xjb xjbVar = (xjb) w44Var;
            if (xjbVar instanceof kd1) {
                kd1 kd1Var = (kd1) xjbVar;
                kd1Var.z();
                if (kd1Var.E0 == null) {
                    return;
                }
            }
            this.A0 = true;
            xjbVar.q();
            View focusedView = xjbVar.getFocusedView();
            focusedView.requestFocus();
            gm.E3(focusedView);
        }
    }

    @Override
    public final void x() {
        this.u2.w1.O0(false);
    }

    @Override
    public final void y0(boolean z) {
        v9b v9bVar = this.u2;
        k9b k9bVar = v9bVar.Y0;
        if (k9bVar != null) {
            k9bVar.x(6, z);
            a91 a91Var = v9bVar.k1;
            if (a91Var != null) {
                ((ae8) a91Var.c).a(v9bVar.Y0.j(), true);
            }
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null) {
            l9bVar.e0 = z;
            l9bVar.M.b(z);
        }
    }
}
