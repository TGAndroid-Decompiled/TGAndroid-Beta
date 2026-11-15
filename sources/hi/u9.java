package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ke0;
public final class u9 extends m5 {
    public boolean f15199j2;
    public final sa f15200k2;

    public u9(sa saVar, Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.u9 u9Var, fi.b bVar, w5 w5Var, ga gaVar) {
        super(context, z10, file, z11, z12, raVar, activity, i7, bitmap, bitmap2, i10, arrayList, d7Var, i11, i12, xeVar, u9Var, bVar, w5Var, gaVar);
        this.f15200k2 = saVar;
    }

    @Override
    public final void B(boolean z10) {
        sa saVar = this.f15200k2;
        saVar.f15083p1.a(true, z10, saVar.f15066j0);
    }

    @Override
    public final void C() {
        sa saVar = this.f15200k2;
        saVar.f15107w1.L0(false);
        saVar.f15048d1.clearAnimation();
        ViewPropertyAnimator duration = saVar.f15048d1.animate().alpha(0.0f).setDuration(180L);
        er erVar = er.f34421g;
        duration.setInterpolator(erVar).start();
        if (saVar.f15060h0 != 2) {
            saVar.Z0.clearAnimation();
            saVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(erVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j3;
        sa saVar = this.f15200k2;
        if (z10) {
            saVar.f15086q1.setVisibility(0);
            saVar.f15086q1.setAlpha(0.0f);
            saVar.f15086q1.clearAnimation();
            saVar.f15086q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.f34421g).start();
            return;
        }
        saVar.f15086q1.a(false, z11);
        saVar.f15086q1.clearAnimation();
        ViewPropertyAnimator interpolator = saVar.f15086q1.animate().alpha(0.0f).withEndAction(new e1(this, 15)).setDuration(180L).setInterpolator(er.f34421g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final void d(boolean z10) {
        boolean z11;
        sa saVar = this.f15200k2;
        saVar.f15083p1.b(saVar.f15048d1.getText());
        s5 s5Var = saVar.f15083p1;
        if (z10 && this.f15199j2) {
            z11 = true;
        } else {
            z11 = false;
        }
        s5Var.a(false, z11, null);
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        tg.j jVar;
        if (!p()) {
            z10 = false;
        }
        sa saVar = this.f15200k2;
        saVar.f15048d1.clearAnimation();
        ViewPropertyAnimator animate = saVar.f15048d1.animate();
        float f11 = 0.0f;
        if (saVar.f15060h0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        er erVar = er.f34421g;
        duration.setInterpolator(erVar).start();
        saVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = saVar.Z0.animate();
        int i7 = saVar.f15060h0;
        if (i7 == -1 || i7 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(erVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f14690t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.f15199j2 = false;
    }

    @Override
    public final void g() {
        this.f15199j2 = false;
        S0(p(), false);
        this.f15200k2.f15083p1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f15199j2 = true;
        this.f15200k2.f15107w1.L0(false);
        S0(false, false);
    }

    @Override
    public final void j(boolean z10) {
        this.f15200k2.f15086q1.a(z10, false);
    }

    @Override
    public final void o0() {
        sa saVar = this.f15200k2;
        saVar.f15048d1.f14623f.d();
        saVar.k0(0, false, true);
        tg.j jVar = this.f14690t0;
        if ((jVar instanceof tg.o2) && !this.f14692u0) {
            tg.o2 o2Var = (tg.o2) jVar;
            this.f14692u0 = true;
            o2Var.q();
            View focusedView = o2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.J3(focusedView);
        }
    }

    @Override
    public final void w0(boolean z10) {
        sa saVar = this.f15200k2;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.x(6, z10);
            n5 n5Var = saVar.f15070k1;
            if (n5Var != null) {
                ((ke0) n5Var.f14762c).a(saVar.Y0.k(), true);
            }
        }
        ia iaVar = saVar.f15048d1;
        if (iaVar != null) {
            iaVar.f14622e0 = z10;
            iaVar.M.b(z10);
        }
    }

    @Override
    public final void y() {
        this.f15200k2.f15107w1.L0(false);
    }
}
