package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.wr;
public final class ad extends r7 {
    public final ce A2;
    public boolean f2344z2;

    public ad(ce ceVar, Context context, boolean z10, File file, boolean z11, boolean z12, be beVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r9 r9Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ia iaVar, zh.b bVar, d8 d8Var, nd ndVar) {
        super(context, z10, file, z11, z12, beVar, activity, i10, bitmap, bitmap2, i11, arrayList, r9Var, i12, i13, cropState, iaVar, bVar, d8Var, ndVar);
        this.A2 = ceVar;
    }

    @Override
    public final void A() {
        ce ceVar = this.A2;
        ceVar.f2498v1.O0(false);
        ceVar.f2439c1.clearAnimation();
        ViewPropertyAnimator duration = ceVar.f2439c1.animate().alpha(0.0f).setDuration(180L);
        wr wrVar = wr.f28820g;
        duration.setInterpolator(wrVar).start();
        if (ceVar.f2451g0 != 2) {
            ceVar.Y0.clearAnimation();
            ceVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(wrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j3;
        ce ceVar = this.A2;
        if (z10) {
            ceVar.f2478p1.setVisibility(0);
            ceVar.f2478p1.setAlpha(0.0f);
            ceVar.f2478p1.clearAnimation();
            ceVar.f2478p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(wr.f28820g).start();
            return;
        }
        ceVar.f2478p1.a(false, z11);
        ceVar.f2478p1.clearAnimation();
        ViewPropertyAnimator interpolator = ceVar.f2478p1.animate().alpha(0.0f).withEndAction(new wc(this, 1)).setDuration(180L).setInterpolator(wr.f28820g);
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
        ce ceVar = this.A2;
        ceVar.f2475o1.b(ceVar.f2439c1.getText());
        x7 x7Var = ceVar.f2475o1;
        if (z10 && this.f2344z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        x7Var.a(false, z11, null);
    }

    @Override
    public final boolean f0(s sVar) {
        ce ceVar = this.A2;
        Activity activity = ceVar.f2433b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    ceVar.f2511y2 = sVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                ceVar.f2511y2 = sVar;
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
        pg.j jVar;
        if (!p()) {
            z10 = false;
        }
        ce ceVar = this.A2;
        ceVar.f2439c1.clearAnimation();
        ViewPropertyAnimator animate = ceVar.f2439c1.animate();
        float f10 = 0.0f;
        if (ceVar.f2451g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        wr wrVar = wr.f28820g;
        duration.setInterpolator(wrVar).start();
        ceVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = ceVar.Y0.animate();
        int i10 = ceVar.f2451g0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(wrVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.f3521l2 = true;
        this.f2344z2 = false;
    }

    @Override
    public final void i() {
        this.f2344z2 = false;
        V0(p(), false);
        this.A2.f2475o1.a(false, false, null);
    }

    @Override
    public final void j() {
        this.f2344z2 = true;
        this.A2.f2498v1.O0(false);
        V0(false, false);
    }

    @Override
    public final void m(boolean z10) {
        this.A2.f2478p1.a(z10, false);
    }

    @Override
    public final void r0() {
        ce ceVar = this.A2;
        ceVar.f2439c1.f3268f.d();
        ceVar.l0(0, false, true);
        pg.j jVar = this.J0;
        if ((jVar instanceof pg.v2) && !this.K0) {
            pg.v2 v2Var = (pg.v2) jVar;
            this.K0 = true;
            v2Var.q();
            View focusedView = v2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void v() {
        this.A2.f2498v1.O0(false);
    }

    @Override
    public final void y(boolean z10) {
        ce ceVar = this.A2;
        ceVar.f2475o1.a(true, z10, ceVar.f2457i0);
    }

    @Override
    public final void z0(boolean z10) {
        ce ceVar = this.A2;
        nd ndVar = ceVar.X0;
        if (ndVar != null) {
            ndVar.x(6, z10);
            s7 s7Var = ceVar.f2461j1;
            if (s7Var != null) {
                ((pg0) s7Var.f3652c).a(ceVar.X0.k(), true);
            }
        }
        qd qdVar = ceVar.f2439c1;
        if (qdVar != null) {
            qdVar.f3267e0 = z10;
            qdVar.L.b(z10);
        }
    }
}
