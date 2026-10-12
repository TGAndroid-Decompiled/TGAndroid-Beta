package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gh0;
public final class mb extends o6 {
    public final kc A2;
    public boolean f7435z2;

    public mb(kc kcVar, Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, bi.b bVar, z6 z6Var, yb ybVar) {
        super(context, z10, file, z11, z12, jcVar, activity, i10, bitmap, bitmap2, i11, arrayList, k8Var, i12, i13, cropState, laVar, bVar, z6Var, ybVar);
        this.A2 = kcVar;
    }

    @Override
    public final void B(boolean z10) {
        kc kcVar = this.A2;
        kcVar.f7279o1.a(true, z10, kcVar.f7261i0);
    }

    @Override
    public final void C() {
        kc kcVar = this.A2;
        kcVar.f7302v1.N0(false);
        kcVar.f7243c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.f7243c1.animate().alpha(0.0f).setDuration(180L);
        es esVar = es.f24772g;
        duration.setInterpolator(esVar).start();
        if (kcVar.f7255g0 != 2) {
            kcVar.Y0.clearAnimation();
            kcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(esVar).start();
        }
        U0(q(), false);
    }

    public final void U0(boolean z10, boolean z11) {
        long j10;
        kc kcVar = this.A2;
        if (z10) {
            kcVar.f7282p1.setVisibility(0);
            kcVar.f7282p1.setAlpha(0.0f);
            kcVar.f7282p1.clearAnimation();
            kcVar.f7282p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(es.f24772g).start();
            return;
        }
        kcVar.f7282p1.a(false, z11);
        kcVar.f7282p1.clearAnimation();
        ViewPropertyAnimator interpolator = kcVar.f7282p1.animate().alpha(0.0f).withEndAction(new x8(this, 4)).setDuration(180L).setInterpolator(es.f24772g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final void f(boolean z10) {
        boolean z11;
        kc kcVar = this.A2;
        kcVar.f7279o1.b(kcVar.f7243c1.getText());
        t6 t6Var = kcVar.f7279o1;
        if (z10 && this.f7435z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6Var.a(false, z11, null);
    }

    @Override
    public final void g(boolean z10) {
        float f7;
        rg.j jVar;
        if (!q()) {
            z10 = false;
        }
        kc kcVar = this.A2;
        kcVar.f7243c1.clearAnimation();
        ViewPropertyAnimator animate = kcVar.f7243c1.animate();
        float f10 = 0.0f;
        if (kcVar.f7255g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        es esVar = es.f24772g;
        duration.setInterpolator(esVar).start();
        kcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = kcVar.Y0.animate();
        int i10 = kcVar.f7255g0;
        if (i10 == -1 || i10 == 2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).setDuration(180L).setInterpolator(esVar).start();
        U0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            B0(jVar);
        }
        S0();
        this.f7533l2 = true;
        this.f7435z2 = false;
    }

    @Override
    public final void j() {
        this.f7435z2 = false;
        U0(q(), false);
        this.A2.f7279o1.a(false, false, null);
    }

    @Override
    public final void k() {
        this.f7435z2 = true;
        this.A2.f7302v1.N0(false);
        U0(false, false);
    }

    @Override
    public final void m(boolean z10) {
        this.A2.f7282p1.a(z10, false);
    }

    @Override
    public final void q0() {
        kc kcVar = this.A2;
        kcVar.f7243c1.f7382f.d();
        kcVar.k0(0, false, true);
        rg.j jVar = this.J0;
        if ((jVar instanceof rg.x2) && !this.K0) {
            rg.x2 x2Var = (rg.x2) jVar;
            this.K0 = true;
            x2Var.q();
            View focusedView = x2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void y() {
        this.A2.f7302v1.N0(false);
    }

    @Override
    public final void y0(boolean z10) {
        kc kcVar = this.A2;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.x(6, z10);
            p6 p6Var = kcVar.f7265j1;
            if (p6Var != null) {
                ((gh0) p6Var.f7588c).a(kcVar.X0.k(), true);
            }
        }
        ac acVar = kcVar.f7243c1;
        if (acVar != null) {
            acVar.f7381e0 = z10;
            acVar.L.b(z10);
        }
    }
}
