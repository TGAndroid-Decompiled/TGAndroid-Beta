package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ve0;
public final class pa extends v5 {
    public boolean f15197n2;
    public final nb f15198o2;

    public pa(nb nbVar, Context context, boolean z10, File file, boolean z11, boolean z12, mb mbVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, x7 x7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ba baVar, fi.b bVar, e6 e6Var, bb bbVar) {
        super(context, z10, file, z11, z12, mbVar, activity, i7, bitmap, bitmap2, i10, arrayList, x7Var, i11, i12, weVar, baVar, bVar, e6Var, bbVar);
        this.f15198o2 = nbVar;
    }

    @Override
    public final void B(boolean z10) {
        nb nbVar = this.f15198o2;
        nbVar.f15102p1.a(true, z10, nbVar.f15085j0);
    }

    @Override
    public final void C() {
        nb nbVar = this.f15198o2;
        nbVar.f15126w1.O0(false);
        nbVar.f15067d1.clearAnimation();
        ViewPropertyAnimator duration = nbVar.f15067d1.animate().alpha(0.0f).setDuration(180L);
        kr krVar = kr.f36859g;
        duration.setInterpolator(krVar).start();
        if (nbVar.f15079h0 != 2) {
            nbVar.Z0.clearAnimation();
            nbVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(krVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        long j3;
        nb nbVar = this.f15198o2;
        if (z10) {
            nbVar.f15105q1.setVisibility(0);
            nbVar.f15105q1.setAlpha(0.0f);
            nbVar.f15105q1.clearAnimation();
            nbVar.f15105q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(kr.f36859g).start();
            return;
        }
        nbVar.f15105q1.a(false, z11);
        nbVar.f15105q1.clearAnimation();
        ViewPropertyAnimator interpolator = nbVar.f15105q1.animate().alpha(0.0f).withEndAction(new m4(this, 1)).setDuration(180L).setInterpolator(kr.f36859g);
        if (z11) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final void d(boolean z10) {
        boolean z11;
        nb nbVar = this.f15198o2;
        nbVar.f15102p1.b(nbVar.f15067d1.getText());
        a6 a6Var = nbVar.f15102p1;
        if (z10 && this.f15197n2) {
            z11 = true;
        } else {
            z11 = false;
        }
        a6Var.a(false, z11, null);
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        tg.n nVar;
        if (!p()) {
            z10 = false;
        }
        nb nbVar = this.f15198o2;
        nbVar.f15067d1.clearAnimation();
        ViewPropertyAnimator animate = nbVar.f15067d1.animate();
        float f11 = 0.0f;
        if (nbVar.f15079h0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        kr krVar = kr.f36859g;
        duration.setInterpolator(krVar).start();
        nbVar.Z0.clearAnimation();
        ViewPropertyAnimator animate2 = nbVar.Z0.animate();
        int i7 = nbVar.f15079h0;
        if (i7 == -1 || i7 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(krVar).start();
        V0(false, z10);
        if (z10 && (nVar = this.f15590t0) != null) {
            B0(nVar);
        }
        T0();
        this.Z1 = true;
        this.f15197n2 = false;
    }

    @Override
    public final void g() {
        this.f15197n2 = false;
        V0(p(), false);
        this.f15198o2.f15102p1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f15197n2 = true;
        this.f15198o2.f15126w1.O0(false);
        V0(false, false);
    }

    @Override
    public final void j(boolean z10) {
        this.f15198o2.f15105q1.a(z10, false);
    }

    @Override
    public final void q0() {
        nb nbVar = this.f15198o2;
        nbVar.f15067d1.f14936f.d();
        nbVar.k0(0, false, true);
        tg.n nVar = this.f15590t0;
        if ((nVar instanceof tg.q2) && !this.f15592u0) {
            tg.q2 q2Var = (tg.q2) nVar;
            if (q2Var instanceof tg.d) {
                tg.d dVar = (tg.d) q2Var;
                dVar.z();
                if (dVar.E0 == null) {
                    return;
                }
            }
            this.f15592u0 = true;
            q2Var.q();
            View focusedView = q2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.I3(focusedView);
        }
    }

    @Override
    public final void y() {
        this.f15198o2.f15126w1.O0(false);
    }

    @Override
    public final void y0(boolean z10) {
        nb nbVar = this.f15198o2;
        bb bbVar = nbVar.Y0;
        if (bbVar != null) {
            bbVar.x(6, z10);
            w5 w5Var = nbVar.f15089k1;
            if (w5Var != null) {
                ((ve0) w5Var.f15678c).a(nbVar.Y0.k(), true);
            }
        }
        db dbVar = nbVar.f15067d1;
        if (dbVar != null) {
            dbVar.f14935e0 = z10;
            dbVar.M.b(z10);
        }
    }
}
