package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eh0;
public final class xa extends f6 {
    public final vb A2;
    public boolean f10133z2;

    public xa(vb vbVar, Context context, boolean z10, File file, boolean z11, boolean z12, ub ubVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, a8 a8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, ci.b bVar, q6 q6Var, jb jbVar) {
        super(context, z10, file, z11, z12, ubVar, activity, i10, bitmap, bitmap2, i11, arrayList, a8Var, i12, i13, cropState, jaVar, bVar, q6Var, jbVar);
        this.A2 = vbVar;
    }

    @Override
    public final void A(boolean z10) {
        vb vbVar = this.A2;
        vbVar.f10009o1.a(true, z10, vbVar.f9991i0);
    }

    @Override
    public final void B() {
        vb vbVar = this.A2;
        vbVar.f10032v1.M0(false);
        vbVar.f9973c1.clearAnimation();
        ViewPropertyAnimator duration = vbVar.f9973c1.animate().alpha(0.0f).setDuration(180L);
        bs bsVar = bs.f25134g;
        duration.setInterpolator(bsVar).start();
        if (vbVar.f9985g0 != 2) {
            vbVar.Y0.clearAnimation();
            vbVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(bsVar).start();
        }
        T0(p(), false);
    }

    public final void T0(boolean z10, boolean z11) {
        long j10;
        vb vbVar = this.A2;
        if (z10) {
            vbVar.f10012p1.setVisibility(0);
            vbVar.f10012p1.setAlpha(0.0f);
            vbVar.f10012p1.clearAnimation();
            vbVar.f10012p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25134g).start();
            return;
        }
        vbVar.f10012p1.a(false, z11);
        vbVar.f10012p1.clearAnimation();
        ViewPropertyAnimator interpolator = vbVar.f10012p1.animate().alpha(0.0f).withEndAction(new com.google.firebase.messaging.s(this, 25)).setDuration(180L).setInterpolator(bs.f25134g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        vb vbVar = this.A2;
        vbVar.f10009o1.b(vbVar.f9973c1.getText());
        l6 l6Var = vbVar.f10009o1;
        if (z10 && this.f10133z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        l6Var.a(false, z11, null);
    }

    @Override
    public final void f(boolean z10) {
        float f7;
        rg.j jVar;
        if (!p()) {
            z10 = false;
        }
        vb vbVar = this.A2;
        vbVar.f9973c1.clearAnimation();
        ViewPropertyAnimator animate = vbVar.f9973c1.animate();
        float f10 = 0.0f;
        if (vbVar.f9985g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        bs bsVar = bs.f25134g;
        duration.setInterpolator(bsVar).start();
        vbVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = vbVar.Y0.animate();
        int i10 = vbVar.f9985g0;
        if (i10 == -1 || i10 == 2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).setDuration(180L).setInterpolator(bsVar).start();
        T0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            A0(jVar);
        }
        R0();
        this.f9031l2 = true;
        this.f10133z2 = false;
    }

    @Override
    public final void i() {
        this.f10133z2 = false;
        T0(p(), false);
        this.A2.f10009o1.a(false, false, null);
    }

    @Override
    public final void j() {
        this.f10133z2 = true;
        this.A2.f10032v1.M0(false);
        T0(false, false);
    }

    @Override
    public final void l(boolean z10) {
        this.A2.f10012p1.a(z10, false);
    }

    @Override
    public final void p0() {
        vb vbVar = this.A2;
        vbVar.f9973c1.f9410f.d();
        vbVar.k0(0, false, true);
        rg.j jVar = this.J0;
        if ((jVar instanceof rg.w2) && !this.K0) {
            rg.w2 w2Var = (rg.w2) jVar;
            this.K0 = true;
            w2Var.q();
            View focusedView = w2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void x() {
        this.A2.f10032v1.M0(false);
    }

    @Override
    public final void x0(boolean z10) {
        vb vbVar = this.A2;
        jb jbVar = vbVar.X0;
        if (jbVar != null) {
            jbVar.x(6, z10);
            g6 g6Var = vbVar.f9995j1;
            if (g6Var != null) {
                ((eh0) g6Var.f9080c).a(vbVar.X0.k(), true);
            }
        }
        lb lbVar = vbVar.f9973c1;
        if (lbVar != null) {
            lbVar.f9409e0 = z10;
            lbVar.L.b(z10);
        }
    }
}
