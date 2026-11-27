package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class ok4 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final Runnable c;
    public final Object d;

    public ok4(Object obj, float f, Runnable runnable, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zu7 zu7Var;
        kva kvaVar;
        byte b = this.a;
        Runnable runnable = this.c;
        float f = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                rk4 rk4Var = (rk4) obj;
                rk4Var.h = f;
                rk4Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x85 x85Var = (x85) obj;
                x85Var.h = f;
                x85Var.a.invalidate();
                w85 w85Var = (w85) runnable;
                if (w85Var != null) {
                    w85Var.run();
                    return;
                }
                return;
            case 2:
                bv7 bv7Var = (bv7) obj;
                bv7Var.n = f;
                bv7Var.invalidate();
                if (animator == bv7Var.r && (zu7Var = (zu7) runnable) != null) {
                    zu7Var.run();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.o6 = null;
                photoViewer.e6 = 0.0f;
                photoViewer.a6 = 0.0f;
                photoViewer.f6 = 0.0f;
                float z1 = photoViewer.z1(false);
                photoViewer.d6 = z1;
                photoViewer.Z5 = z1;
                photoViewer.f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float z12 = photoViewer.z1(false);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = z12;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.setRotated(false);
                if (Math.abs(f) > 0.0f) {
                    k88 k88Var = photoViewer.D1;
                    t33 t33Var = k88Var.c;
                    if (t33Var != null) {
                        t33Var.b(0.0f);
                        t33Var.setRotated(false);
                    }
                    boolean m = k88Var.b.m(f);
                    ImageView imageView = photoViewer.c1;
                    if (m) {
                        yob.s(imageView, aob.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        imageView.setColorFilter((ColorFilter) null);
                    }
                }
                fo6 fo6Var = photoViewer.W4.c;
                if (fo6Var != null) {
                    fo6Var.b = 0.0f;
                    fo6Var.a = 0.0f;
                    fo6Var.f = 1.0f;
                    fo6Var.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                lva lvaVar = (lva) obj;
                lvaVar.E = f;
                lvaVar.invalidate();
                if (animator == lvaVar.F && (kvaVar = (kva) runnable) != null) {
                    kvaVar.run();
                    return;
                }
                return;
            default:
                rbb rbbVar = (rbb) obj;
                rbbVar.M = null;
                rbbVar.J = f;
                rbbVar.h();
                rbbVar.r.invalidate();
                rbbVar.n.invalidate();
                runnable.run();
                rbbVar.Q.e();
                jn7.e().k(100, 512);
                jn7.e().o();
                rbbVar.l();
                Runnable runnable2 = rbbVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    rbbVar.R = null;
                }
                rbbVar.r.invalidate();
                rbbVar.i0.invalidate();
                return;
        }
    }
}
