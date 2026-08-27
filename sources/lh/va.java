package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tf0;

public final class va extends f6 {

    public boolean f16953v2;

    public final sb f16954w2;

    public va(sb sbVar, Context context, boolean z10, File file, boolean z11, boolean z12, rb rbVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, z7 z7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.z9 z9Var, jh.b bVar, p6 p6Var, hb hbVar) {
        super(context, z10, file, z11, z12, rbVar, activity, i10, bitmap, bitmap2, i11, arrayList, z7Var, i12, i13, cropState, z9Var, bVar, p6Var, hbVar);
        this.f16954w2 = sbVar;
    }

    @Override
    public final void B(boolean z10) {
        sb sbVar = this.f16954w2;
        sbVar.f16777k1.a(true, z10, sbVar.f16757e0);
    }

    @Override
    public final void C() {
        sb sbVar = this.f16954w2;
        sbVar.f16798r1.O0(false);
        sbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = sbVar.Y0.animate().alpha(0.0f).setDuration(180L);
        er erVar = er.f28123g;
        duration.setInterpolator(erVar).start();
        if (sbVar.f16750c0 != 2) {
            sbVar.U0.clearAnimation();
            sbVar.U0.animate().alpha(0.0f).setDuration(180L).setInterpolator(erVar).start();
        }
        V0(r(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        sb sbVar = this.f16954w2;
        if (!z10) {
            sbVar.l1.a(false, z11);
            sbVar.l1.clearAnimation();
            sbVar.l1.animate().alpha(0.0f).withEndAction(new kh.c(this, 22)).setDuration(180L).setInterpolator(er.f28123g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            sbVar.l1.setVisibility(0);
            sbVar.l1.setAlpha(0.0f);
            sbVar.l1.clearAnimation();
            sbVar.l1.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.f28123g).start();
        }
    }

    @Override
    public final boolean f0(cg.w1 w1Var) {
        sb sbVar = this.f16954w2;
        Activity activity = sbVar.f16745b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            sbVar.f16809u2 = w1Var;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        sbVar.f16809u2 = w1Var;
        return false;
    }

    @Override
    public final void g(boolean z10) {
        sb sbVar = this.f16954w2;
        sbVar.f16777k1.b(sbVar.Y0.getText());
        sbVar.f16777k1.a(false, z10 && this.f16953v2, null);
    }

    @Override
    public final void h(boolean z10) {
        zf.j jVar;
        if (!r()) {
            z10 = false;
        }
        sb sbVar = this.f16954w2;
        sbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = sbVar.Y0.animate().alpha(sbVar.f16750c0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        er erVar = er.f28123g;
        duration.setInterpolator(erVar).start();
        sbVar.U0.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = sbVar.U0.animate();
        int i10 = sbVar.f16750c0;
        viewPropertyAnimatorAnimate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(erVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.F0) != null) {
            C0(jVar);
        }
        T0();
        this.f15972h2 = true;
        this.f16953v2 = false;
    }

    @Override
    public final void k() {
        this.f16953v2 = false;
        V0(r(), false);
        this.f16954w2.f16777k1.a(false, false, null);
    }

    @Override
    public final void m() {
        this.f16953v2 = true;
        this.f16954w2.f16798r1.O0(false);
        V0(false, false);
    }

    @Override
    public final void o(boolean z10) {
        this.f16954w2.l1.a(z10, false);
    }

    @Override
    public final void r0() {
        sb sbVar = this.f16954w2;
        sbVar.Y0.f16338f.d();
        sbVar.l0(0, false, true);
        zf.j jVar = this.F0;
        if (!(jVar instanceof zf.v2) || this.G0) {
            return;
        }
        zf.v2 v2Var = (zf.v2) jVar;
        this.G0 = true;
        v2Var.q();
        View focusedView = v2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override
    public final void y() {
        this.f16954w2.f16798r1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        sb sbVar = this.f16954w2;
        hb hbVar = sbVar.T0;
        if (hbVar != null) {
            hbVar.x(6, z10);
            ag.t0 t0Var = sbVar.f16762f1;
            if (t0Var != null) {
                ((tf0) t0Var.f662c).a(sbVar.T0.k(), true);
            }
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            ibVar.f16330a0 = z10;
            ibVar.H.b(z10);
        }
    }
}
