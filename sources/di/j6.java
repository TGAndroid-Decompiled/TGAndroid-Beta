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
    public final int f9105a;
    public final float f9106b;
    public final Runnable f9107c;
    public final Object d;

    public j6(Object obj, float f10, Runnable runnable, int i7) {
        this.f9105a = i7;
        this.d = obj;
        this.f9106b = f10;
        this.f9107c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f9105a;
        Runnable runnable = this.f9107c;
        float f10 = this.f9106b;
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
                m1Var.f12303n = f10;
                m1Var.invalidate();
                if (animator == m1Var.f12304r && runnable != null) {
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
                saVar.f15437r.invalidate();
                saVar.f15425n.invalidate();
                runnable.run();
                saVar.Q.e();
                ls.e().k(99, 512);
                ls.e().o();
                saVar.n();
                Runnable runnable2 = saVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    saVar.R = null;
                }
                saVar.f15437r.invalidate();
                saVar.f15412i0.invalidate();
                return;
            case 4:
                q30 q30Var = (q30) obj;
                q30Var.h = f10;
                q30Var.f51045a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f43343p6 = null;
                photoViewer.f43259f6 = 0.0f;
                photoViewer.f43221b6 = 0.0f;
                photoViewer.f43268g6 = 0.0f;
                float p22 = photoViewer.p2(false);
                photoViewer.f43249e6 = p22;
                photoViewer.f43211a6 = p22;
                photoViewer.f43253f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f39164b.f21921a;
                float p23 = photoViewer.p2(false);
                cropAreaView.f32928o0 = 0.0f;
                cropAreaView.f32929p0 = p23;
                cropAreaView.f32930q0 = 0.0f;
                cropAreaView.f32932r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f39165c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    rd0 rd0Var = photoViewer.D1;
                    og.f fVar = rd0Var.f39165c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (rd0Var.f39164b.m(f10)) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f43226c1, org.telegram.ui.ActionBar.m6.f29630qg, photoViewer.f43403w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43226c1.setColorFilter((ColorFilter) null);
                    }
                }
                xe xeVar = photoViewer.X4.f50277c;
                if (xeVar != null) {
                    xeVar.f27875b = 0.0f;
                    xeVar.f27874a = 0.0f;
                    xeVar.f27878f = 1.0f;
                    xeVar.f27877e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
