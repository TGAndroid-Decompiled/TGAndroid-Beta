package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.q30;
public final class j6 extends AnimatorListenerAdapter {
    public final int f9102a;
    public final float f9103b;
    public final Runnable f9104c;
    public final Object d;

    public j6(Object obj, float f10, Runnable runnable, int i7) {
        this.f9102a = i7;
        this.d = obj;
        this.f9103b = f10;
        this.f9104c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f9102a;
        Runnable runnable = this.f9104c;
        float f10 = this.f9103b;
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
                m1Var.f12300n = f10;
                m1Var.invalidate();
                if (animator == m1Var.f12301r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                hi.n2 n2Var = (hi.n2) obj;
                n2Var.h = f10;
                n2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                hi.sa saVar = (hi.sa) obj;
                saVar.M = null;
                saVar.J = f10;
                saVar.j();
                saVar.f15434r.invalidate();
                saVar.f15422n.invalidate();
                runnable.run();
                saVar.Q.e();
                ks.e().k(99, 512);
                ks.e().o();
                saVar.n();
                Runnable runnable2 = saVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    saVar.R = null;
                }
                saVar.f15434r.invalidate();
                saVar.f15409i0.invalidate();
                return;
            case 4:
                q30 q30Var = (q30) obj;
                q30Var.h = f10;
                q30Var.f51041a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f43339p6 = null;
                photoViewer.f43255f6 = 0.0f;
                photoViewer.f43217b6 = 0.0f;
                photoViewer.f43264g6 = 0.0f;
                float p22 = photoViewer.p2(false);
                photoViewer.f43245e6 = p22;
                photoViewer.f43207a6 = p22;
                photoViewer.f43249f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f39154b.f21918a;
                float p23 = photoViewer.p2(false);
                cropAreaView.f32925o0 = 0.0f;
                cropAreaView.f32926p0 = p23;
                cropAreaView.f32927q0 = 0.0f;
                cropAreaView.f32929r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f39155c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    rd0 rd0Var = photoViewer.D1;
                    og.f fVar = rd0Var.f39155c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (rd0Var.f39154b.m(f10)) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f43222c1, org.telegram.ui.ActionBar.m6.f29627qg, photoViewer.f43399w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43222c1.setColorFilter((ColorFilter) null);
                    }
                }
                we weVar = photoViewer.X4.f50273c;
                if (weVar != null) {
                    weVar.f27703b = 0.0f;
                    weVar.f27702a = 0.0f;
                    weVar.f27706f = 1.0f;
                    weVar.f27705e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
