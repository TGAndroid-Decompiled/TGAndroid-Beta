package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hs;
public final class nb extends q6 {
    public final lc A2;
    public boolean f5653z2;

    public nb(lc lcVar, Context context, boolean z10, File file, boolean z11, boolean z12, kc kcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, l8 l8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ma maVar, ai.d dVar, a7 a7Var, zb zbVar) {
        super(context, z10, file, z11, z12, kcVar, activity, i10, bitmap, bitmap2, i11, arrayList, l8Var, i12, i13, cropState, maVar, dVar, a7Var, zbVar);
        this.A2 = lcVar;
    }

    @Override
    public final void A(boolean z10) {
        lc lcVar = this.A2;
        lcVar.f5504o1.a(true, z10, lcVar.f5486i0);
    }

    @Override
    public final void B() {
        lc lcVar = this.A2;
        lcVar.f5527v1.N0(false);
        lcVar.f5467c1.clearAnimation();
        ViewPropertyAnimator duration = lcVar.f5467c1.animate().alpha(0.0f).setDuration(180L);
        hs hsVar = hs.f27119g;
        duration.setInterpolator(hsVar).start();
        if (lcVar.f5480g0 != 2) {
            lcVar.Y0.clearAnimation();
            lcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(hsVar).start();
        }
        U0(q(), false);
    }

    public final void U0(boolean z10, boolean z11) {
        long j3;
        lc lcVar = this.A2;
        if (z10) {
            lcVar.f5507p1.setVisibility(0);
            lcVar.f5507p1.setAlpha(0.0f);
            lcVar.f5507p1.clearAnimation();
            lcVar.f5507p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.f27119g).start();
            return;
        }
        lcVar.f5507p1.a(false, z11);
        lcVar.f5507p1.clearAnimation();
        ViewPropertyAnimator interpolator = lcVar.f5507p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(hs.f27119g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        lc lcVar = this.A2;
        lcVar.f5504o1.b(lcVar.f5467c1.getText());
        v6 v6Var = lcVar.f5504o1;
        if (z10 && this.f5653z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v6Var.a(false, z11, null);
    }

    @Override
    public final void i(boolean z10) {
        float f7;
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        lc lcVar = this.A2;
        lcVar.f5467c1.clearAnimation();
        ViewPropertyAnimator animate = lcVar.f5467c1.animate();
        float f10 = 0.0f;
        if (lcVar.f5480g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        hs hsVar = hs.f27119g;
        duration.setInterpolator(hsVar).start();
        lcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = lcVar.Y0.animate();
        int i10 = lcVar.f5480g0;
        if (i10 == -1 || i10 == 2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).setDuration(180L).setInterpolator(hsVar).start();
        U0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            B0(jVar);
        }
        S0();
        this.f5811l2 = true;
        this.f5653z2 = false;
    }

    @Override
    public final void k() {
        this.f5653z2 = false;
        U0(q(), false);
        this.A2.f5504o1.a(false, false, null);
    }

    @Override
    public final void l() {
        this.f5653z2 = true;
        this.A2.f5527v1.N0(false);
        U0(false, false);
    }

    @Override
    public final void n(boolean z10) {
        this.A2.f5507p1.a(z10, false);
    }

    @Override
    public final void q0() {
        lc lcVar = this.A2;
        lcVar.f5467c1.f5555f.d();
        lcVar.k0(0, false, true);
        qg.j jVar = this.J0;
        if ((jVar instanceof qg.w2) && !this.K0) {
            qg.w2 w2Var = (qg.w2) jVar;
            this.K0 = true;
            w2Var.q();
            View focusedView = w2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void w() {
        this.A2.f5527v1.N0(false);
    }

    @Override
    public final void y0(boolean z10) {
        lc lcVar = this.A2;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.x(6, z10);
            r6 r6Var = lcVar.f5490j1;
            if (r6Var != null) {
                ((hh0) r6Var.f5908c).a(lcVar.X0.k(), true);
            }
        }
        bc bcVar = lcVar.f5467c1;
        if (bcVar != null) {
            bcVar.f5554e0 = z10;
            bcVar.L.b(z10);
        }
    }
}
