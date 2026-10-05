package ci;

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
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;
public final class mb extends q6 {
    public final kc A2;
    public boolean f5584z2;

    public mb(kc kcVar, Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ka kaVar, ai.d dVar, a7 a7Var, yb ybVar) {
        super(context, z10, file, z11, z12, jcVar, activity, i10, bitmap, bitmap2, i11, arrayList, k8Var, i12, i13, cropState, kaVar, dVar, a7Var, ybVar);
        this.A2 = kcVar;
    }

    @Override
    public final void B(boolean z10) {
        kc kcVar = this.A2;
        kcVar.f5420o1.a(true, z10, kcVar.f5402i0);
    }

    @Override
    public final void C() {
        kc kcVar = this.A2;
        kcVar.f5443v1.O0(false);
        kcVar.f5383c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.f5383c1.animate().alpha(0.0f).setDuration(180L);
        tr trVar = tr.f31216g;
        duration.setInterpolator(trVar).start();
        if (kcVar.f5396g0 != 2) {
            kcVar.Y0.clearAnimation();
            kcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(trVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j3;
        kc kcVar = this.A2;
        if (z10) {
            kcVar.f5423p1.setVisibility(0);
            kcVar.f5423p1.setAlpha(0.0f);
            kcVar.f5423p1.clearAnimation();
            kcVar.f5423p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(tr.f31216g).start();
            return;
        }
        kcVar.f5423p1.a(false, z11);
        kcVar.f5423p1.clearAnimation();
        ViewPropertyAnimator interpolator = kcVar.f5423p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(tr.f31216g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final boolean f0(ai.o8 o8Var) {
        kc kcVar = this.A2;
        Activity activity = kcVar.f5377b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    kcVar.f5456y2 = o8Var;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                kcVar.f5456y2 = o8Var;
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
        kc kcVar = this.A2;
        kcVar.f5420o1.b(kcVar.f5383c1.getText());
        v6 v6Var = kcVar.f5420o1;
        if (z10 && this.f5584z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v6Var.a(false, z11, null);
    }

    @Override
    public final void h(boolean z10) {
        float f7;
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        kc kcVar = this.A2;
        kcVar.f5383c1.clearAnimation();
        ViewPropertyAnimator animate = kcVar.f5383c1.animate();
        float f10 = 0.0f;
        if (kcVar.f5396g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        tr trVar = tr.f31216g;
        duration.setInterpolator(trVar).start();
        kcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = kcVar.Y0.animate();
        int i10 = kcVar.f5396g0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(trVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.f5767l2 = true;
        this.f5584z2 = false;
    }

    @Override
    public final void i() {
        this.f5584z2 = false;
        V0(q(), false);
        this.A2.f5420o1.a(false, false, null);
    }

    @Override
    public final void j() {
        this.f5584z2 = true;
        this.A2.f5443v1.O0(false);
        V0(false, false);
    }

    @Override
    public final void l(boolean z10) {
        this.A2.f5423p1.a(z10, false);
    }

    @Override
    public final void r0() {
        kc kcVar = this.A2;
        kcVar.f5383c1.f5518f.d();
        kcVar.l0(0, false, true);
        qg.j jVar = this.J0;
        if ((jVar instanceof qg.v2) && !this.K0) {
            qg.v2 v2Var = (qg.v2) jVar;
            this.K0 = true;
            v2Var.q();
            View focusedView = v2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void x() {
        this.A2.f5443v1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        kc kcVar = this.A2;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.x(6, z10);
            r6 r6Var = kcVar.f5406j1;
            if (r6Var != null) {
                ((sg0) r6Var.f5869c).a(kcVar.X0.k(), true);
            }
        }
        ac acVar = kcVar.f5383c1;
        if (acVar != null) {
            acVar.f5517e0 = z10;
            acVar.L.b(z10);
        }
    }
}
