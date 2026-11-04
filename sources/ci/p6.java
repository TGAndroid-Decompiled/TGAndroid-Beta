package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.i30;
public final class p6 extends AnimatorListenerAdapter {
    public final int f5750a;
    public final float f5751b;
    public final Runnable f5752c;
    public final Object d;

    public p6(Object obj, float f10, Runnable runnable, int i3) {
        this.f5750a = i3;
        this.d = obj;
        this.f5751b = f10;
        this.f5752c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f5750a;
        Runnable runnable = this.f5752c;
        float f10 = this.f5751b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                q6 q6Var = (q6) obj;
                q6Var.E = f10;
                q6Var.invalidate();
                if (animator == q6Var.F && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ei.v1 v1Var = (ei.v1) obj;
                v1Var.f11115n = f10;
                v1Var.invalidate();
                if (animator == v1Var.f11116r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                gi.n2 n2Var = (gi.n2) obj;
                n2Var.h = f10;
                n2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                gi.va vaVar = (gi.va) obj;
                vaVar.M = null;
                vaVar.J = f10;
                vaVar.j();
                vaVar.f13751r.invalidate();
                vaVar.f13738n.invalidate();
                runnable.run();
                vaVar.Q.e();
                hs.e().k(99, 512);
                hs.e().o();
                vaVar.n();
                Runnable runnable2 = vaVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    vaVar.R = null;
                }
                vaVar.f13751r.invalidate();
                vaVar.f13726i0.invalidate();
                return;
            case 4:
                i30 i30Var = (i30) obj;
                i30Var.h = f10;
                i30Var.f46044a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f41519q6 = null;
                photoViewer.f41435g6 = 0.0f;
                photoViewer.f41397c6 = 0.0f;
                photoViewer.f41443h6 = 0.0f;
                float u22 = photoViewer.u2(false);
                photoViewer.f41426f6 = u22;
                photoViewer.f41388b6 = u22;
                photoViewer.f41420f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f31808b.f53511a;
                float u23 = photoViewer.u2(false);
                cropAreaView.f31388o0 = 0.0f;
                cropAreaView.f31389p0 = u23;
                cropAreaView.f31390q0 = 0.0f;
                cropAreaView.f31392r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f31809c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    ad0 ad0Var = photoViewer.D1;
                    pg.e eVar = ad0Var.f31809c;
                    if (eVar != null) {
                        eVar.b(0.0f);
                        eVar.setRotated(false);
                    }
                    if (ad0Var.f31808b.m(f10)) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f41393c1, org.telegram.ui.ActionBar.k6.f28071ng, photoViewer.f41570w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41393c1.setColorFilter((ColorFilter) null);
                    }
                }
                re reVar = photoViewer.Y4.f44797c;
                if (reVar != null) {
                    reVar.f25111b = 0.0f;
                    reVar.f25110a = 0.0f;
                    reVar.f25114f = 1.0f;
                    reVar.f25113e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
