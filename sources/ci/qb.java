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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.qr;
public final class qb extends r6 {
    public final oc A2;
    public boolean f5363z2;

    public qb(oc ocVar, Context context, boolean z10, File file, boolean z11, boolean z12, nc ncVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ha haVar, ai.d dVar, c7 c7Var, cc ccVar) {
        super(context, z10, file, z11, z12, ncVar, activity, i10, bitmap, bitmap2, i11, arrayList, o8Var, i12, i13, cropState, haVar, dVar, c7Var, ccVar);
        this.A2 = ocVar;
    }

    @Override
    public final void A(boolean z10) {
        oc ocVar = this.A2;
        ocVar.f5246o1.a(true, z10, ocVar.f5228i0);
    }

    @Override
    public final void B() {
        oc ocVar = this.A2;
        ocVar.f5269v1.O0(false);
        ocVar.f5210c1.clearAnimation();
        ViewPropertyAnimator duration = ocVar.f5210c1.animate().alpha(0.0f).setDuration(180L);
        qr qrVar = qr.f27421g;
        duration.setInterpolator(qrVar).start();
        if (ocVar.f5222g0 != 2) {
            ocVar.Y0.clearAnimation();
            ocVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(qrVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j3;
        oc ocVar = this.A2;
        if (z10) {
            ocVar.f5249p1.setVisibility(0);
            ocVar.f5249p1.setAlpha(0.0f);
            ocVar.f5249p1.clearAnimation();
            ocVar.f5249p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(qr.f27421g).start();
            return;
        }
        ocVar.f5249p1.a(false, z11);
        ocVar.f5249p1.clearAnimation();
        ViewPropertyAnimator interpolator = ocVar.f5249p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(qr.f27421g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final boolean f0(ai.n8 n8Var) {
        oc ocVar = this.A2;
        Activity activity = ocVar.f5204b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    ocVar.f5282y2 = n8Var;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                ocVar.f5282y2 = n8Var;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        oc ocVar = this.A2;
        ocVar.f5246o1.b(ocVar.f5210c1.getText());
        w6 w6Var = ocVar.f5246o1;
        if (z10 && this.f5363z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        w6Var.a(false, z11, null);
    }

    @Override
    public final void i(boolean z10) {
        float f7;
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        oc ocVar = this.A2;
        ocVar.f5210c1.clearAnimation();
        ViewPropertyAnimator animate = ocVar.f5210c1.animate();
        float f10 = 0.0f;
        if (ocVar.f5222g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        qr qrVar = qr.f27421g;
        duration.setInterpolator(qrVar).start();
        ocVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = ocVar.Y0.animate();
        int i10 = ocVar.f5222g0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(qrVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.f5427l2 = true;
        this.f5363z2 = false;
    }

    @Override
    public final void k() {
        this.f5363z2 = false;
        V0(q(), false);
        this.A2.f5246o1.a(false, false, null);
    }

    @Override
    public final void l() {
        this.f5363z2 = true;
        this.A2.f5269v1.O0(false);
        V0(false, false);
    }

    @Override
    public final void n(boolean z10) {
        this.A2.f5249p1.a(z10, false);
    }

    @Override
    public final void r0() {
        oc ocVar = this.A2;
        ocVar.f5210c1.f4992f.d();
        ocVar.l0(0, false, true);
        qg.j jVar = this.J0;
        if ((jVar instanceof qg.x2) && !this.K0) {
            qg.x2 x2Var = (qg.x2) jVar;
            this.K0 = true;
            x2Var.q();
            View focusedView = x2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void w() {
        this.A2.f5269v1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        oc ocVar = this.A2;
        cc ccVar = ocVar.X0;
        if (ccVar != null) {
            ccVar.x(6, z10);
            s6 s6Var = ocVar.f5232j1;
            if (s6Var != null) {
                ((fg0) s6Var.f5514c).a(ocVar.X0.k(), true);
            }
        }
        ec ecVar = ocVar.f5210c1;
        if (ecVar != null) {
            ecVar.f4991e0 = z10;
            ecVar.L.b(z10);
        }
    }
}
