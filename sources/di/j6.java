package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ls;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.q30;
public final class j6 extends AnimatorListenerAdapter {
    public final int f9070a;
    public final float f9071b;
    public final Runnable f9072c;
    public final Object d;

    public j6(Object obj, float f10, Runnable runnable, int i7) {
        this.f9070a = i7;
        this.d = obj;
        this.f9071b = f10;
        this.f9072c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f9070a;
        Runnable runnable = this.f9072c;
        float f10 = this.f9071b;
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
                m1Var.f12252n = f10;
                m1Var.invalidate();
                if (animator == m1Var.f12253r && runnable != null) {
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
                hi.ta taVar = (hi.ta) obj;
                taVar.M = null;
                taVar.J = f10;
                taVar.j();
                taVar.f15440r.invalidate();
                taVar.f15428n.invalidate();
                runnable.run();
                taVar.Q.e();
                ls.e().k(99, 512);
                ls.e().o();
                taVar.n();
                Runnable runnable2 = taVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    taVar.R = null;
                }
                taVar.f15440r.invalidate();
                taVar.f15415i0.invalidate();
                return;
            case 4:
                q30 q30Var = (q30) obj;
                q30Var.h = f10;
                q30Var.f50976a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f43308p6 = null;
                photoViewer.f43224f6 = 0.0f;
                photoViewer.f43186b6 = 0.0f;
                photoViewer.f43233g6 = 0.0f;
                float p22 = photoViewer.p2(false);
                photoViewer.f43214e6 = p22;
                photoViewer.f43176a6 = p22;
                photoViewer.f43218f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f39118b.f21887a;
                float p23 = photoViewer.p2(false);
                cropAreaView.f32894o0 = 0.0f;
                cropAreaView.f32895p0 = p23;
                cropAreaView.f32896q0 = 0.0f;
                cropAreaView.f32898r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f39119c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    rd0 rd0Var = photoViewer.D1;
                    og.f fVar = rd0Var.f39119c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (rd0Var.f39118b.m(f10)) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f43191c1, org.telegram.ui.ActionBar.m6.f29596qg, photoViewer.f43368w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43191c1.setColorFilter((ColorFilter) null);
                    }
                }
                xe xeVar = photoViewer.X4.f50620c;
                if (xeVar != null) {
                    xeVar.f27839b = 0.0f;
                    xeVar.f27838a = 0.0f;
                    xeVar.f27842f = 1.0f;
                    xeVar.f27841e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
