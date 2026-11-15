package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ns;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.n30;
public final class g6 extends AnimatorListenerAdapter {
    public final int f8616a;
    public final float f8617b;
    public final Runnable f8618c;
    public final Object d;

    public g6(Object obj, float f10, Runnable runnable, int i7) {
        this.f8616a = i7;
        this.d = obj;
        this.f8617b = f10;
        this.f8618c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f8616a;
        Runnable runnable = this.f8618c;
        float f10 = this.f8617b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                h6 h6Var = (h6) obj;
                h6Var.E = f10;
                h6Var.invalidate();
                if (animator == h6Var.F && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                fi.o1 o1Var = (fi.o1) obj;
                o1Var.f12108n = f10;
                o1Var.invalidate();
                if (animator == o1Var.f12109r && runnable != null) {
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
                saVar.f15088r.invalidate();
                saVar.f15076n.invalidate();
                runnable.run();
                saVar.Q.e();
                ns.e().k(99, 512);
                ns.e().o();
                saVar.n();
                Runnable runnable2 = saVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    saVar.R = null;
                }
                saVar.f15088r.invalidate();
                saVar.f15063i0.invalidate();
                return;
            case 4:
                n30 n30Var = (n30) obj;
                n30Var.h = f10;
                n30Var.f49431a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f42853p6 = null;
                photoViewer.f42769f6 = 0.0f;
                photoViewer.f42731b6 = 0.0f;
                photoViewer.f42778g6 = 0.0f;
                float p22 = photoViewer.p2(false);
                photoViewer.f42759e6 = p22;
                photoViewer.f42721a6 = p22;
                photoViewer.f42763f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.f34907b.f21530a;
                float p23 = photoViewer.p2(false);
                cropAreaView.f32495o0 = 0.0f;
                cropAreaView.f32496p0 = p23;
                cropAreaView.f32497q0 = 0.0f;
                cropAreaView.f32499r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f34908c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    gd0 gd0Var = photoViewer.D1;
                    og.f fVar = gd0Var.f34908c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (gd0Var.f34907b.m(f10)) {
                        org.telegram.ui.ActionBar.q6.s(photoViewer.f42736c1, org.telegram.ui.ActionBar.j6.f29098qg, photoViewer.f42913w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f42736c1.setColorFilter((ColorFilter) null);
                    }
                }
                xe xeVar = photoViewer.X4.f49023c;
                if (xeVar != null) {
                    xeVar.f27490b = 0.0f;
                    xeVar.f27489a = 0.0f;
                    xeVar.f27493f = 1.0f;
                    xeVar.f27492e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
