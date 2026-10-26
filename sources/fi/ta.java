package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;
public final class ta extends e6 {
    public boolean f11724o2;
    public final sb f11725p2;

    public ta(sb sbVar, Context context, boolean z10, File file, boolean z11, boolean z12, rb rbVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, w7 w7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, di.b bVar, n6 n6Var, gb gbVar) {
        super(context, z10, file, z11, z12, rbVar, activity, i10, bitmap, bitmap2, i11, arrayList, w7Var, i12, i13, cropState, laVar, bVar, n6Var, gbVar);
        this.f11725p2 = sbVar;
    }

    @Override
    public final void A(boolean z10) {
        sb sbVar = this.f11725p2;
        sbVar.f11650o1.a(true, z10, sbVar.f11632i0);
    }

    @Override
    public final void B() {
        sb sbVar = this.f11725p2;
        sbVar.f11673v1.L0(false);
        sbVar.f11614c1.clearAnimation();
        ViewPropertyAnimator duration = sbVar.f11614c1.animate().alpha(0.0f).setDuration(180L);
        ds dsVar = ds.f27587g;
        duration.setInterpolator(dsVar).start();
        if (sbVar.f11626g0 != 2) {
            sbVar.Y0.clearAnimation();
            sbVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(dsVar).start();
        }
        S0(q(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j10;
        sb sbVar = this.f11725p2;
        if (z10) {
            sbVar.f11653p1.setVisibility(0);
            sbVar.f11653p1.setAlpha(0.0f);
            sbVar.f11653p1.clearAnimation();
            sbVar.f11653p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(ds.f27587g).start();
            return;
        }
        sbVar.f11653p1.a(false, z11);
        sbVar.f11653p1.clearAnimation();
        ViewPropertyAnimator interpolator = sbVar.f11653p1.animate().alpha(0.0f).withEndAction(new di.s8(this, 29)).setDuration(180L).setInterpolator(ds.f27587g);
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
        sb sbVar = this.f11725p2;
        sbVar.f11650o1.b(sbVar.f11614c1.getText());
        j6 j6Var = sbVar.f11650o1;
        if (z10 && this.f11724o2) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6Var.a(false, z11, null);
    }

    @Override
    public final void f(boolean z10) {
        float f7;
        sg.j jVar;
        if (!q()) {
            z10 = false;
        }
        sb sbVar = this.f11725p2;
        sbVar.f11614c1.clearAnimation();
        ViewPropertyAnimator animate = sbVar.f11614c1.animate();
        float f10 = 0.0f;
        if (sbVar.f11626g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        ds dsVar = ds.f27587g;
        duration.setInterpolator(dsVar).start();
        sbVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = sbVar.Y0.animate();
        int i10 = sbVar.f11626g0;
        if (i10 == -1 || i10 == 2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).setDuration(180L).setInterpolator(dsVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f10824y0) != null) {
            z0(jVar);
        }
        Q0();
        this.a2 = true;
        this.f11724o2 = false;
    }

    @Override
    public final void g() {
        this.f11724o2 = false;
        S0(q(), false);
        this.f11725p2.f11650o1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f11724o2 = true;
        this.f11725p2.f11673v1.L0(false);
        S0(false, false);
    }

    @Override
    public final void l(boolean z10) {
        this.f11725p2.f11653p1.a(z10, false);
    }

    @Override
    public final void o0() {
        sb sbVar = this.f11725p2;
        sbVar.f11614c1.f11199f.d();
        sbVar.k0(0, false, true);
        sg.j jVar = this.f10824y0;
        if ((jVar instanceof sg.x2) && !this.f10826z0) {
            sg.x2 x2Var = (sg.x2) jVar;
            this.f10826z0 = true;
            x2Var.q();
            View focusedView = x2Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void w0(boolean z10) {
        sb sbVar = this.f11725p2;
        gb gbVar = sbVar.X0;
        if (gbVar != null) {
            gbVar.x(6, z10);
            f6 f6Var = sbVar.f11636j1;
            if (f6Var != null) {
                ((dh0) f6Var.f10865c).a(sbVar.X0.k(), true);
            }
        }
        ib ibVar = sbVar.f11614c1;
        if (ibVar != null) {
            ibVar.f11198e0 = z10;
            ibVar.L.b(z10);
        }
    }

    @Override
    public final void x() {
        this.f11725p2.f11673v1.L0(false);
    }
}
