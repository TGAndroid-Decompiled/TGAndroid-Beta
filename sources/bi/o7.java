package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.n30;
public final class o7 extends AnimatorListenerAdapter {
    public final int f4473a;
    public final float f4474b;
    public final Runnable f4475c;
    public final Object d;

    public o7(Object obj, float f10, Runnable runnable, int i7) {
        this.f4473a = i7;
        this.d = obj;
        this.f4474b = f10;
        this.f4475c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f4473a;
        Runnable runnable = this.f4475c;
        float f10 = this.f4474b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                p7 p7Var = (p7) obj;
                p7Var.D = f10;
                p7Var.invalidate();
                if (animator == p7Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                di.q1 q1Var = (di.q1) obj;
                q1Var.f9627n = f10;
                q1Var.invalidate();
                if (animator == q1Var.f9628r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                fi.p2 p2Var = (fi.p2) obj;
                p2Var.h = f10;
                p2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                fi.va vaVar = (fi.va) obj;
                vaVar.L = null;
                vaVar.I = f10;
                vaVar.j();
                vaVar.f12987r.invalidate();
                vaVar.f12975n.invalidate();
                runnable.run();
                vaVar.P.e();
                qs.e().k(99, 512);
                qs.e().o();
                vaVar.n();
                Runnable runnable2 = vaVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    vaVar.Q = null;
                }
                vaVar.f12987r.invalidate();
                vaVar.f12959h0.invalidate();
                return;
            case 4:
                n30 n30Var = (n30) obj;
                n30Var.h = f10;
                n30Var.f47947a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f41475o6 = null;
                photoViewer.f41390e6 = 0.0f;
                photoViewer.f41352a6 = 0.0f;
                photoViewer.f41400f6 = 0.0f;
                float o22 = photoViewer.o2(false);
                photoViewer.f41380d6 = o22;
                photoViewer.Z5 = o22;
                photoViewer.f41384e0.invalidate();
                CropAreaView cropAreaView = photoViewer.C1.f33525b.f21007a;
                float o23 = photoViewer.o2(false);
                cropAreaView.f31316n0 = 0.0f;
                cropAreaView.f31317o0 = o23;
                cropAreaView.f31318p0 = 0.0f;
                cropAreaView.f31319q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f33526c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    fd0 fd0Var = photoViewer.C1;
                    og.f fVar = fd0Var.f33526c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (fd0Var.f33525b.m(f10)) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f41357b1, org.telegram.ui.ActionBar.k6.f28043ng, photoViewer.f41534v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41357b1.setColorFilter((ColorFilter) null);
                    }
                }
                ye yeVar = photoViewer.W4.f47865c;
                if (yeVar != null) {
                    yeVar.f26636b = 0.0f;
                    yeVar.f26635a = 0.0f;
                    yeVar.f26639f = 1.0f;
                    yeVar.f26638e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
