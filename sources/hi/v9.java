package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.we0;
public final class v9 extends l5 {
    public boolean f15568j2;
    public final ta f15569k2;

    public v9(ta taVar, Context context, boolean z10, File file, boolean z11, boolean z12, sa saVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.ca caVar, fi.b bVar, v5 v5Var, ha haVar) {
        super(context, z10, file, z11, z12, saVar, activity, i7, bitmap, bitmap2, i10, arrayList, d7Var, i11, i12, xeVar, caVar, bVar, v5Var, haVar);
        this.f15569k2 = taVar;
    }

    @Override
    public final void B(boolean z10) {
        ta taVar = this.f15569k2;
        taVar.f15435p1.a(true, z10, taVar.f15418j0);
    }

    @Override
    public final void C() {
        ta taVar = this.f15569k2;
        taVar.f15459w1.L0(false);
        taVar.f15400d1.clearAnimation();
        ViewPropertyAnimator duration = taVar.f15400d1.animate().alpha(0.0f).setDuration(180L);
        nr nrVar = nr.f37918g;
        duration.setInterpolator(nrVar).start();
        if (taVar.f15412h0 != 2) {
            taVar.Z0.clearAnimation();
            taVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(nrVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j3;
        ta taVar = this.f15569k2;
        if (z10) {
            taVar.f15438q1.setVisibility(0);
            taVar.f15438q1.setAlpha(0.0f);
            taVar.f15438q1.clearAnimation();
            taVar.f15438q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.f37918g).start();
            return;
        }
        taVar.f15438q1.a(false, z11);
        taVar.f15438q1.clearAnimation();
        ViewPropertyAnimator interpolator = taVar.f15438q1.animate().alpha(0.0f).withEndAction(new b0(this, 18)).setDuration(180L).setInterpolator(nr.f37918g);
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
        ta taVar = this.f15569k2;
        taVar.f15435p1.b(taVar.f15400d1.getText());
        q5 q5Var = taVar.f15435p1;
        if (z10 && this.f15568j2) {
            z11 = true;
        } else {
            z11 = false;
        }
        q5Var.a(false, z11, null);
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        tg.j jVar;
        if (!p()) {
            z10 = false;
        }
        ta taVar = this.f15569k2;
        taVar.f15400d1.clearAnimation();
        ViewPropertyAnimator animate = taVar.f15400d1.animate();
        float f11 = 0.0f;
        if (taVar.f15412h0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        nr nrVar = nr.f37918g;
        duration.setInterpolator(nrVar).start();
        taVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = taVar.Z0.animate();
        int i7 = taVar.f15412h0;
        if (i7 == -1 || i7 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(nrVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f14916t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.f15568j2 = false;
    }

    @Override
    public final void g() {
        this.f15568j2 = false;
        S0(p(), false);
        this.f15569k2.f15435p1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f15568j2 = true;
        this.f15569k2.f15459w1.L0(false);
        S0(false, false);
    }

    @Override
    public final void j(boolean z10) {
        this.f15569k2.f15438q1.a(z10, false);
    }

    @Override
    public final void o0() {
        ta taVar = this.f15569k2;
        taVar.f15400d1.f14971f.d();
        taVar.k0(0, false, true);
        tg.j jVar = this.f14916t0;
        if ((jVar instanceof tg.n2) && !this.f14918u0) {
            tg.n2 n2Var = (tg.n2) jVar;
            this.f14918u0 = true;
            n2Var.q();
            View focusedView = n2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.I3(focusedView);
        }
    }

    @Override
    public final void w0(boolean z10) {
        ta taVar = this.f15569k2;
        ha haVar = taVar.Y0;
        if (haVar != null) {
            haVar.x(6, z10);
            m5 m5Var = taVar.f15422k1;
            if (m5Var != null) {
                ((we0) m5Var.f15016c).a(taVar.Y0.k(), true);
            }
        }
        ja jaVar = taVar.f15400d1;
        if (jaVar != null) {
            jaVar.f14970e0 = z10;
            jaVar.M.b(z10);
        }
    }

    @Override
    public final void y() {
        this.f15569k2.f15459w1.L0(false);
    }
}
