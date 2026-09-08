package di;

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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.pr;
public final class rb extends q6 {
    public final pc A2;
    public boolean f8111z2;

    public rb(pc pcVar, Context context, boolean z10, File file, boolean z11, boolean z12, oc ocVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, bi.b bVar, c7 c7Var, dc dcVar) {
        super(context, z10, file, z11, z12, ocVar, activity, i10, bitmap, bitmap2, i11, arrayList, o8Var, i12, i13, cropState, jaVar, bVar, c7Var, dcVar);
        this.A2 = pcVar;
    }

    @Override
    public final void B(boolean z10) {
        pc pcVar = this.A2;
        pcVar.f7915o1.a(true, z10, pcVar.f7897i0);
    }

    @Override
    public final void C() {
        pc pcVar = this.A2;
        pcVar.f7938v1.O0(false);
        pcVar.f7878c1.clearAnimation();
        ViewPropertyAnimator duration = pcVar.f7878c1.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.f29494g;
        duration.setInterpolator(prVar).start();
        if (pcVar.f7891g0 != 2) {
            pcVar.Y0.clearAnimation();
            pcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j3;
        pc pcVar = this.A2;
        if (z10) {
            pcVar.f7918p1.setVisibility(0);
            pcVar.f7918p1.setAlpha(0.0f);
            pcVar.f7918p1.clearAnimation();
            pcVar.f7918p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.f29494g).start();
            return;
        }
        pcVar.f7918p1.a(false, z11);
        pcVar.f7918p1.clearAnimation();
        ViewPropertyAnimator interpolator = pcVar.f7918p1.animate().alpha(0.0f).withEndAction(new nb(this, 1)).setDuration(180L).setInterpolator(pr.f29494g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final void f(boolean z10) {
        boolean z11;
        pc pcVar = this.A2;
        pcVar.f7915o1.b(pcVar.f7878c1.getText());
        v6 v6Var = pcVar.f7915o1;
        if (z10 && this.f8111z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v6Var.a(false, z11, null);
    }

    @Override
    public final boolean f0(ah.g gVar) {
        pc pcVar = this.A2;
        Activity activity = pcVar.f7872b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    pcVar.f7951y2 = gVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                pcVar.f7951y2 = gVar;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void g(boolean z10) {
        float f7;
        rg.k kVar;
        if (!q()) {
            z10 = false;
        }
        pc pcVar = this.A2;
        pcVar.f7878c1.clearAnimation();
        ViewPropertyAnimator animate = pcVar.f7878c1.animate();
        float f10 = 0.0f;
        if (pcVar.f7891g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        pr prVar = pr.f29494g;
        duration.setInterpolator(prVar).start();
        pcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = pcVar.Y0.animate();
        int i10 = pcVar.f7891g0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(prVar).start();
        V0(false, z10);
        if (z10 && (kVar = this.J0) != null) {
            C0(kVar);
        }
        T0();
        this.f8002l2 = true;
        this.f8111z2 = false;
    }

    @Override
    public final void j() {
        this.f8111z2 = false;
        V0(q(), false);
        this.A2.f7915o1.a(false, false, null);
    }

    @Override
    public final void k() {
        this.f8111z2 = true;
        this.A2.f7938v1.O0(false);
        V0(false, false);
    }

    @Override
    public final void m(boolean z10) {
        this.A2.f7918p1.a(z10, false);
    }

    @Override
    public final void r0() {
        pc pcVar = this.A2;
        pcVar.f7878c1.f7621f.d();
        pcVar.l0(0, false, true);
        rg.k kVar = this.J0;
        if ((kVar instanceof rg.x2) && !this.K0) {
            rg.x2 x2Var = (rg.x2) kVar;
            this.K0 = true;
            x2Var.q();
            View focusedView = x2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void y() {
        this.A2.f7938v1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        pc pcVar = this.A2;
        dc dcVar = pcVar.X0;
        if (dcVar != null) {
            dcVar.x(6, z10);
            r6 r6Var = pcVar.f7901j1;
            if (r6Var != null) {
                ((fg0) r6Var.f8097c).a(pcVar.X0.k(), true);
            }
        }
        fc fcVar = pcVar.f7878c1;
        if (fcVar != null) {
            fcVar.f7620e0 = z10;
            fcVar.L.b(z10);
        }
    }
}
