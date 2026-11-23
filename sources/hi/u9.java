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
public final class u9 extends k5 {
    public boolean f15583j2;
    public final sa f15584k2;

    public u9(sa saVar, Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, c7 c7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.ca caVar, fi.b bVar, u5 u5Var, ga gaVar) {
        super(context, z10, file, z11, z12, raVar, activity, i7, bitmap, bitmap2, i10, arrayList, c7Var, i11, i12, xeVar, caVar, bVar, u5Var, gaVar);
        this.f15584k2 = saVar;
    }

    @Override
    public final void B(boolean z10) {
        sa saVar = this.f15584k2;
        saVar.f15432p1.a(true, z10, saVar.f15415j0);
    }

    @Override
    public final void C() {
        sa saVar = this.f15584k2;
        saVar.f15456w1.L0(false);
        saVar.f15397d1.clearAnimation();
        ViewPropertyAnimator duration = saVar.f15397d1.animate().alpha(0.0f).setDuration(180L);
        nr nrVar = nr.f37962g;
        duration.setInterpolator(nrVar).start();
        if (saVar.f15409h0 != 2) {
            saVar.Z0.clearAnimation();
            saVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(nrVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j3;
        sa saVar = this.f15584k2;
        if (z10) {
            saVar.f15435q1.setVisibility(0);
            saVar.f15435q1.setAlpha(0.0f);
            saVar.f15435q1.clearAnimation();
            saVar.f15435q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.f37962g).start();
            return;
        }
        saVar.f15435q1.a(false, z11);
        saVar.f15435q1.clearAnimation();
        ViewPropertyAnimator interpolator = saVar.f15435q1.animate().alpha(0.0f).withEndAction(new l(this, 19)).setDuration(180L).setInterpolator(nr.f37962g);
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
        sa saVar = this.f15584k2;
        saVar.f15432p1.b(saVar.f15397d1.getText());
        p5 p5Var = saVar.f15432p1;
        if (z10 && this.f15583j2) {
            z11 = true;
        } else {
            z11 = false;
        }
        p5Var.a(false, z11, null);
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        tg.j jVar;
        if (!p()) {
            z10 = false;
        }
        sa saVar = this.f15584k2;
        saVar.f15397d1.clearAnimation();
        ViewPropertyAnimator animate = saVar.f15397d1.animate();
        float f11 = 0.0f;
        if (saVar.f15409h0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        nr nrVar = nr.f37962g;
        duration.setInterpolator(nrVar).start();
        saVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = saVar.Z0.animate();
        int i7 = saVar.f15409h0;
        if (i7 == -1 || i7 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(nrVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f14904t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.f15583j2 = false;
    }

    @Override
    public final void g() {
        this.f15583j2 = false;
        S0(p(), false);
        this.f15584k2.f15432p1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f15583j2 = true;
        this.f15584k2.f15456w1.L0(false);
        S0(false, false);
    }

    @Override
    public final void j(boolean z10) {
        this.f15584k2.f15435q1.a(z10, false);
    }

    @Override
    public final void o0() {
        sa saVar = this.f15584k2;
        saVar.f15397d1.f15151f.d();
        saVar.k0(0, false, true);
        tg.j jVar = this.f14904t0;
        if ((jVar instanceof tg.n2) && !this.f14906u0) {
            tg.n2 n2Var = (tg.n2) jVar;
            this.f14906u0 = true;
            n2Var.q();
            View focusedView = n2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.I3(focusedView);
        }
    }

    @Override
    public final void w0(boolean z10) {
        sa saVar = this.f15584k2;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.x(6, z10);
            l5 l5Var = saVar.f15419k1;
            if (l5Var != null) {
                ((we0) l5Var.f15006c).a(saVar.Y0.k(), true);
            }
        }
        ia iaVar = saVar.f15397d1;
        if (iaVar != null) {
            iaVar.f15150e0 = z10;
            iaVar.M.b(z10);
        }
    }

    @Override
    public final void y() {
        this.f15584k2.f15456w1.L0(false);
    }
}
