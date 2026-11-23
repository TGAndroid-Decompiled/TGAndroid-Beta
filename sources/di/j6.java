package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p30;
public final class j6 extends AnimatorListenerAdapter {
    public final int f9066a;
    public final float f9067b;
    public final Runnable f9068c;
    public final Object d;

    public j6(Object obj, float f10, Runnable runnable, int i7) {
        this.f9066a = i7;
        this.d = obj;
        this.f9067b = f10;
        this.f9068c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f9066a;
        Runnable runnable = this.f9068c;
        float f10 = this.f9067b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                k6 k6Var = (k6) obj;
                k6Var.E = f10;
                k6Var.invalidate();
                if (animator == k6Var.F && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                fi.m1 m1Var = (fi.m1) obj;
                m1Var.f12265n = f10;
                m1Var.invalidate();
                if (animator == m1Var.f12266r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                hi.w2 w2Var = (hi.w2) obj;
                w2Var.h = f10;
                w2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                hi.nb nbVar = (hi.nb) obj;
                nbVar.M = null;
                nbVar.J = f10;
                nbVar.j();
                nbVar.f15107r.invalidate();
                nbVar.f15095n.invalidate();
                runnable.run();
                nbVar.Q.e();
                ks.e().k(99, 512);
                ks.e().o();
                nbVar.n();
                Runnable runnable2 = nbVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    nbVar.R = null;
                }
                nbVar.f15107r.invalidate();
                nbVar.f15082i0.invalidate();
                return;
            case 4:
                p30 p30Var = (p30) obj;
                p30Var.h = f10;
                p30Var.f50814a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f43424p6 = null;
                photoViewer.f43340f6 = 0.0f;
                photoViewer.f43298b6 = 0.0f;
                photoViewer.f43349g6 = 0.0f;
                float q22 = photoViewer.q2(false);
                photoViewer.f43329e6 = q22;
                photoViewer.f43287a6 = q22;
                photoViewer.f43334f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f38811b.f21987a;
                float q23 = photoViewer.q2(false);
                cropAreaView.f32992o0 = 0.0f;
                cropAreaView.f32993p0 = q23;
                cropAreaView.f32994q0 = 0.0f;
                cropAreaView.f32996r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f38812c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    qd0 qd0Var = photoViewer.D1;
                    og.f fVar = qd0Var.f38812c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (qd0Var.f38811b.m(f10)) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.f43304c1, org.telegram.ui.ActionBar.n6.f29700qg, photoViewer.f43484w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43304c1.setColorFilter((ColorFilter) null);
                    }
                }
                we weVar = photoViewer.X4.f50393c;
                if (weVar != null) {
                    weVar.f27769b = 0.0f;
                    weVar.f27768a = 0.0f;
                    weVar.f27772f = 1.0f;
                    weVar.f27771e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
