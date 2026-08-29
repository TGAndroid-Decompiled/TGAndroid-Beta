package nh;

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
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.jr;
public final class ja extends t5 {
    public boolean f17974v2;
    public final gb f17975w2;

    public ja(gb gbVar, Context context, boolean z10, File file, boolean z11, boolean z12, fb fbVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o7 o7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ga gaVar, lh.b bVar, e6 e6Var, va vaVar) {
        super(context, z10, file, z11, z12, fbVar, activity, i10, bitmap, bitmap2, i11, arrayList, o7Var, i12, i13, cropState, gaVar, bVar, e6Var, vaVar);
        this.f17975w2 = gbVar;
    }

    @Override
    public final void B(boolean z10) {
        gb gbVar = this.f17975w2;
        gbVar.f17771k1.a(true, z10, gbVar.f17751e0);
    }

    @Override
    public final void C() {
        gb gbVar = this.f17975w2;
        gbVar.f17792r1.O0(false);
        gbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = gbVar.Y0.animate().alpha(0.0f).setDuration(180L);
        jr jrVar = jr.f29801g;
        duration.setInterpolator(jrVar).start();
        if (gbVar.f17744c0 != 2) {
            gbVar.U0.clearAnimation();
            gbVar.U0.animate().alpha(0.0f).setDuration(180L).setInterpolator(jrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j10;
        gb gbVar = this.f17975w2;
        if (z10) {
            gbVar.l1.setVisibility(0);
            gbVar.l1.setAlpha(0.0f);
            gbVar.l1.clearAnimation();
            gbVar.l1.animate().alpha(1.0f).setDuration(180L).setInterpolator(jr.f29801g).start();
            return;
        }
        gbVar.l1.a(false, z11);
        gbVar.l1.clearAnimation();
        ViewPropertyAnimator interpolator = gbVar.l1.animate().alpha(0.0f).withEndAction(new m6(this, 6)).setDuration(180L).setInterpolator(jr.f29801g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final boolean f0(bg.f fVar) {
        gb gbVar = this.f17975w2;
        Activity activity = gbVar.f17739b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    gbVar.f17803u2 = fVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                gbVar.f17803u2 = fVar;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void g(boolean z10) {
        boolean z11;
        gb gbVar = this.f17975w2;
        gbVar.f17771k1.b(gbVar.Y0.getText());
        x5 x5Var = gbVar.f17771k1;
        if (z10 && this.f17974v2) {
            z11 = true;
        } else {
            z11 = false;
        }
        x5Var.a(false, z11, null);
    }

    @Override
    public final void h(boolean z10) {
        float f9;
        bg.k kVar;
        if (!p()) {
            z10 = false;
        }
        gb gbVar = this.f17975w2;
        gbVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = gbVar.Y0.animate();
        float f10 = 0.0f;
        if (gbVar.f17744c0 == -1) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f9).setDuration(180L);
        jr jrVar = jr.f29801g;
        duration.setInterpolator(jrVar).start();
        gbVar.U0.clearAnimation();
        ViewPropertyAnimator animate2 = gbVar.U0.animate();
        int i10 = gbVar.f17744c0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(jrVar).start();
        V0(false, z10);
        if (z10 && (kVar = this.F0) != null) {
            C0(kVar);
        }
        T0();
        this.f18637h2 = true;
        this.f17974v2 = false;
    }

    @Override
    public final void j() {
        this.f17974v2 = false;
        V0(p(), false);
        this.f17975w2.f17771k1.a(false, false, null);
    }

    @Override
    public final void k() {
        this.f17974v2 = true;
        this.f17975w2.f17792r1.O0(false);
        V0(false, false);
    }

    @Override
    public final void m(boolean z10) {
        this.f17975w2.l1.a(z10, false);
    }

    @Override
    public final void r0() {
        gb gbVar = this.f17975w2;
        gbVar.Y0.f18076f.d();
        gbVar.l0(0, false, true);
        bg.k kVar = this.F0;
        if ((kVar instanceof bg.f4) && !this.G0) {
            bg.f4 f4Var = (bg.f4) kVar;
            this.G0 = true;
            f4Var.q();
            View focusedView = f4Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void x() {
        this.f17975w2.f17792r1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        gb gbVar = this.f17975w2;
        va vaVar = gbVar.T0;
        if (vaVar != null) {
            vaVar.x(6, z10);
            cg.i0 i0Var = gbVar.f17756f1;
            if (i0Var != null) {
                ((cg0) i0Var.f3158c).a(gbVar.T0.k(), true);
            }
        }
        wa waVar = gbVar.Y0;
        if (waVar != null) {
            waVar.f18068a0 = z10;
            waVar.H.b(z10);
        }
    }
}
