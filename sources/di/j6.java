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
import org.telegram.ui.q30;
public final class j6 extends AnimatorListenerAdapter {
    public final int f9082a;
    public final float f9083b;
    public final Runnable f9084c;
    public final Object d;

    public j6(Object obj, float f10, Runnable runnable, int i7) {
        this.f9082a = i7;
        this.d = obj;
        this.f9083b = f10;
        this.f9084c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f9082a;
        Runnable runnable = this.f9084c;
        float f10 = this.f9083b;
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
                m1Var.f12260n = f10;
                m1Var.invalidate();
                if (animator == m1Var.f12261r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                hi.o2 o2Var = (hi.o2) obj;
                o2Var.h = f10;
                o2Var.i();
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
                taVar.f15476r.invalidate();
                taVar.f15464n.invalidate();
                runnable.run();
                taVar.Q.e();
                ks.e().k(99, 512);
                ks.e().o();
                taVar.n();
                Runnable runnable2 = taVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    taVar.R = null;
                }
                taVar.f15476r.invalidate();
                taVar.f15451i0.invalidate();
                return;
            case 4:
                q30 q30Var = (q30) obj;
                q30Var.h = f10;
                q30Var.f51074a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f43298p6 = null;
                photoViewer.f43214f6 = 0.0f;
                photoViewer.f43176b6 = 0.0f;
                photoViewer.f43223g6 = 0.0f;
                float p22 = photoViewer.p2(false);
                photoViewer.f43204e6 = p22;
                photoViewer.f43166a6 = p22;
                photoViewer.f43208f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f38763b.f21896a;
                float p23 = photoViewer.p2(false);
                cropAreaView.f32892o0 = 0.0f;
                cropAreaView.f32893p0 = p23;
                cropAreaView.f32894q0 = 0.0f;
                cropAreaView.f32896r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f38764c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    qd0 qd0Var = photoViewer.D1;
                    og.f fVar = qd0Var.f38764c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (qd0Var.f38763b.m(f10)) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.f43181c1, org.telegram.ui.ActionBar.n6.f29645qg, photoViewer.f43358w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43181c1.setColorFilter((ColorFilter) null);
                    }
                }
                we weVar = photoViewer.X4.f50282c;
                if (weVar != null) {
                    weVar.f27677b = 0.0f;
                    weVar.f27676a = 0.0f;
                    weVar.f27680f = 1.0f;
                    weVar.f27679e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
