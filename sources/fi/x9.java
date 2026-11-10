package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.wq;
public final class x9 extends o5 {
    public boolean f13103i2;
    public final va f13104j2;

    public x9(va vaVar, Context context, boolean z9, File file, boolean z10, boolean z11, ua uaVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, e7 e7Var, int i11, int i12, ye yeVar, org.telegram.ui.Components.x9 x9Var, di.b bVar, x5 x5Var, ja jaVar) {
        super(context, z9, file, z10, z11, uaVar, activity, i7, bitmap, bitmap2, i10, arrayList, e7Var, i11, i12, yeVar, x9Var, bVar, x5Var, jaVar);
        this.f13104j2 = vaVar;
    }

    @Override
    public final void B(boolean z9) {
        va vaVar = this.f13104j2;
        vaVar.f12981o1.a(true, z9, vaVar.f12964i0);
    }

    @Override
    public final void C() {
        va vaVar = this.f13104j2;
        vaVar.f13004v1.L0(false);
        vaVar.f12946c1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.f12946c1.animate().alpha(0.0f).setDuration(180L);
        wq wqVar = wq.f40047g;
        duration.setInterpolator(wqVar).start();
        if (vaVar.f12958g0 != 2) {
            vaVar.Y0.clearAnimation();
            vaVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(wqVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z9, boolean z10) {
        long j3;
        va vaVar = this.f13104j2;
        if (z9) {
            vaVar.f12984p1.setVisibility(0);
            vaVar.f12984p1.setAlpha(0.0f);
            vaVar.f12984p1.clearAnimation();
            vaVar.f12984p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(wq.f40047g).start();
            return;
        }
        vaVar.f12984p1.a(false, z10);
        vaVar.f12984p1.clearAnimation();
        ViewPropertyAnimator interpolator = vaVar.f12984p1.animate().alpha(0.0f).withEndAction(new v9(this, 1)).setDuration(180L).setInterpolator(wq.f40047g);
        if (z10) {
            j3 = 500;
        } else {
            j3 = 0;
        }
        interpolator.setStartDelay(j3).start();
    }

    @Override
    public final void d(boolean z9) {
        boolean z10;
        va vaVar = this.f13104j2;
        vaVar.f12981o1.b(vaVar.f12946c1.getText());
        t5 t5Var = vaVar.f12981o1;
        if (z9 && this.f13103i2) {
            z10 = true;
        } else {
            z10 = false;
        }
        t5Var.a(false, z10, null);
    }

    @Override
    public final void e(boolean z9) {
        float f10;
        tg.j jVar;
        if (!p()) {
            z9 = false;
        }
        va vaVar = this.f13104j2;
        vaVar.f12946c1.clearAnimation();
        ViewPropertyAnimator animate = vaVar.f12946c1.animate();
        float f11 = 0.0f;
        if (vaVar.f12958g0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        wq wqVar = wq.f40047g;
        duration.setInterpolator(wqVar).start();
        vaVar.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = vaVar.Y0.animate();
        int i7 = vaVar.f12958g0;
        if (i7 == -1 || i7 == 2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).setDuration(180L).setInterpolator(wqVar).start();
        S0(false, z9);
        if (z9 && (jVar = this.f12547s0) != null) {
            z0(jVar);
        }
        Q0();
        this.U1 = true;
        this.f13103i2 = false;
    }

    @Override
    public final void g() {
        this.f13103i2 = false;
        S0(p(), false);
        this.f13104j2.f12981o1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f13103i2 = true;
        this.f13104j2.f13004v1.L0(false);
        S0(false, false);
    }

    @Override
    public final void j(boolean z9) {
        this.f13104j2.f12984p1.a(z9, false);
    }

    @Override
    public final void o0() {
        va vaVar = this.f13104j2;
        vaVar.f12946c1.f12367f.d();
        vaVar.k0(0, false, true);
        tg.j jVar = this.f12547s0;
        if ((jVar instanceof tg.k2) && !this.f12549t0) {
            tg.k2 k2Var = (tg.k2) jVar;
            this.f12549t0 = true;
            k2Var.q();
            View focusedView = k2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.K3(focusedView);
        }
    }

    @Override
    public final void w0(boolean z9) {
        va vaVar = this.f13104j2;
        ja jaVar = vaVar.X0;
        if (jaVar != null) {
            jaVar.x(6, z9);
            p5 p5Var = vaVar.f12968j1;
            if (p5Var != null) {
                ((he0) p5Var.f12600c).a(vaVar.X0.k(), true);
            }
        }
        la laVar = vaVar.f12946c1;
        if (laVar != null) {
            laVar.f12364d0 = z9;
            laVar.L.b(z9);
        }
    }

    @Override
    public final void y() {
        this.f13104j2.f13004v1.L0(false);
    }
}
