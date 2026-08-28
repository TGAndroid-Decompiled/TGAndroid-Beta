package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qf0;
public final class ya extends g6 {
    public boolean f16411v2;
    public final wb f16412w2;

    public ya(wb wbVar, Context context, boolean z10, File file, boolean z11, boolean z12, vb vbVar, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, a8 a8Var, int i11, int i12, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, ih.b bVar, q6 q6Var, kb kbVar) {
        super(context, z10, file, z11, z12, vbVar, activity, i9, bitmap, bitmap2, i10, arrayList, a8Var, i11, i12, cropState, baVar, bVar, q6Var, kbVar);
        this.f16412w2 = wbVar;
    }

    @Override
    public final void B(boolean z10) {
        wb wbVar = this.f16412w2;
        wbVar.f16281k1.a(true, z10, wbVar.f16261e0);
    }

    @Override
    public final void C() {
        wb wbVar = this.f16412w2;
        wbVar.f16302r1.O0(false);
        wbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = wbVar.Y0.animate().alpha(0.0f).setDuration(180L);
        gr grVar = gr.f28845g;
        duration.setInterpolator(grVar).start();
        if (wbVar.f16254c0 != 2) {
            wbVar.U0.clearAnimation();
            wbVar.U0.animate().alpha(0.0f).setDuration(180L).setInterpolator(grVar).start();
        }
        V0(r(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j10;
        wb wbVar = this.f16412w2;
        if (z10) {
            wbVar.l1.setVisibility(0);
            wbVar.l1.setAlpha(0.0f);
            wbVar.l1.clearAnimation();
            wbVar.l1.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.f28845g).start();
            return;
        }
        wbVar.l1.a(false, z11);
        wbVar.l1.clearAnimation();
        ViewPropertyAnimator interpolator = wbVar.l1.animate().alpha(0.0f).withEndAction(new f1(this, 15)).setDuration(180L).setInterpolator(gr.f28845g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final boolean f0(bg.c2 c2Var) {
        wb wbVar = this.f16412w2;
        Activity activity = wbVar.f16249b;
        if (activity != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    wbVar.f16313u2 = c2Var;
                    return false;
                }
                return true;
            } else if (i9 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                wbVar.f16313u2 = c2Var;
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
        wb wbVar = this.f16412w2;
        wbVar.f16281k1.b(wbVar.Y0.getText());
        l6 l6Var = wbVar.f16281k1;
        if (z10 && this.f16411v2) {
            z11 = true;
        } else {
            z11 = false;
        }
        l6Var.a(false, z11, null);
    }

    @Override
    public final void h(boolean z10) {
        float f10;
        yf.j jVar;
        if (!r()) {
            z10 = false;
        }
        wb wbVar = this.f16412w2;
        wbVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = wbVar.Y0.animate();
        float f11 = 0.0f;
        if (wbVar.f16254c0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        gr grVar = gr.f28845g;
        duration.setInterpolator(grVar).start();
        wbVar.U0.clearAnimation();
        ViewPropertyAnimator animate2 = wbVar.U0.animate();
        int i9 = wbVar.f16254c0;
        animate2.alpha((i9 == -1 || i9 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(grVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.F0) != null) {
            C0(jVar);
        }
        T0();
        this.f15282h2 = true;
        this.f16411v2 = false;
    }

    @Override
    public final void j() {
        this.f16411v2 = false;
        V0(r(), false);
        this.f16412w2.f16281k1.a(false, false, null);
    }

    @Override
    public final void l() {
        this.f16411v2 = true;
        this.f16412w2.f16302r1.O0(false);
        V0(false, false);
    }

    @Override
    public final void o(boolean z10) {
        this.f16412w2.l1.a(z10, false);
    }

    @Override
    public final void r0() {
        wb wbVar = this.f16412w2;
        wbVar.Y0.f15632f.d();
        wbVar.l0(0, false, true);
        yf.j jVar = this.F0;
        if ((jVar instanceof yf.v2) && !this.G0) {
            yf.v2 v2Var = (yf.v2) jVar;
            this.G0 = true;
            v2Var.q();
            View focusedView = v2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void y() {
        this.f16412w2.f16302r1.O0(false);
    }

    @Override
    public final void z0(boolean z10) {
        wb wbVar = this.f16412w2;
        kb kbVar = wbVar.T0;
        if (kbVar != null) {
            kbVar.x(6, z10);
            h6 h6Var = wbVar.f16266f1;
            if (h6Var != null) {
                ((qf0) h6Var.f15398c).a(wbVar.T0.k(), true);
            }
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            mbVar.f15624a0 = z10;
            mbVar.H.b(z10);
        }
    }
}
