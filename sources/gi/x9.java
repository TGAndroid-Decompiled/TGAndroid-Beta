package gi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.re;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.xq;
public final class x9 extends m5 {
    public boolean f13871j2;
    public final va f13872k2;

    public x9(va vaVar, Context context, boolean z10, File file, boolean z11, boolean z12, ua uaVar, Activity activity, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, f7 f7Var, int i11, int i12, re reVar, org.telegram.ui.Components.x9 x9Var, ei.b bVar, x5 x5Var, ja jaVar) {
        super(context, z10, file, z11, z12, uaVar, activity, i3, bitmap, bitmap2, i10, arrayList, f7Var, i11, i12, reVar, x9Var, bVar, x5Var, jaVar);
        this.f13872k2 = vaVar;
    }

    @Override
    public final void A(boolean z10) {
        va vaVar = this.f13872k2;
        vaVar.f13746p1.a(true, z10, vaVar.f13729j0);
    }

    @Override
    public final void B() {
        va vaVar = this.f13872k2;
        vaVar.f13770w1.L0(false);
        vaVar.f13710d1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.f13710d1.animate().alpha(0.0f).setDuration(180L);
        xq xqVar = xq.f40453g;
        duration.setInterpolator(xqVar).start();
        if (vaVar.f13723h0 != 2) {
            vaVar.Z0.clearAnimation();
            vaVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(xqVar).start();
        }
        S0(q(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j10;
        va vaVar = this.f13872k2;
        if (z10) {
            vaVar.f13749q1.setVisibility(0);
            vaVar.f13749q1.setAlpha(0.0f);
            vaVar.f13749q1.clearAnimation();
            vaVar.f13749q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.f40453g).start();
            return;
        }
        vaVar.f13749q1.a(false, z11);
        vaVar.f13749q1.clearAnimation();
        ViewPropertyAnimator interpolator = vaVar.f13749q1.animate().alpha(0.0f).withEndAction(new f6(this, 6)).setDuration(180L).setInterpolator(xq.f40453g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final void d(boolean z10) {
        boolean z11;
        va vaVar = this.f13872k2;
        vaVar.f13746p1.b(vaVar.f13710d1.getText());
        r5 r5Var = vaVar.f13746p1;
        if (z10 && this.f13871j2) {
            z11 = true;
        } else {
            z11 = false;
        }
        r5Var.a(false, z11, null);
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        ug.j jVar;
        if (!q()) {
            z10 = false;
        }
        va vaVar = this.f13872k2;
        vaVar.f13710d1.clearAnimation();
        ViewPropertyAnimator animate = vaVar.f13710d1.animate();
        float f11 = 0.0f;
        if (vaVar.f13723h0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        xq xqVar = xq.f40453g;
        duration.setInterpolator(xqVar).start();
        vaVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = vaVar.Z0.animate();
        int i3 = vaVar.f13723h0;
        if (i3 == -1 || i3 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(xqVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f13229t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.f13871j2 = false;
    }

    @Override
    public final void g() {
        this.f13871j2 = false;
        S0(q(), false);
        this.f13872k2.f13746p1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f13871j2 = true;
        this.f13872k2.f13770w1.L0(false);
        S0(false, false);
    }

    @Override
    public final void l(boolean z10) {
        this.f13872k2.f13749q1.a(z10, false);
    }

    @Override
    public final void o0() {
        va vaVar = this.f13872k2;
        vaVar.f13710d1.f13144f.d();
        vaVar.k0(0, false, true);
        ug.j jVar = this.f13229t0;
        if ((jVar instanceof ug.l2) && !this.f13231u0) {
            ug.l2 l2Var = (ug.l2) jVar;
            this.f13231u0 = true;
            l2Var.q();
            View focusedView = l2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.K3(focusedView);
        }
    }

    @Override
    public final void w0(boolean z10) {
        va vaVar = this.f13872k2;
        ja jaVar = vaVar.Y0;
        if (jaVar != null) {
            jaVar.x(6, z10);
            n5 n5Var = vaVar.k1;
            if (n5Var != null) {
                ((je0) n5Var.f13304c).a(vaVar.Y0.k(), true);
            }
        }
        la laVar = vaVar.f13710d1;
        if (laVar != null) {
            laVar.f13143e0 = z10;
            laVar.M.b(z10);
        }
    }

    @Override
    public final void x() {
        this.f13872k2.f13770w1.L0(false);
    }
}
