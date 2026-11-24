package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class ji4 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final Runnable c;
    public final Object d;

    public ji4(Object obj, float f, Runnable runnable, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tr7 tr7Var;
        ira iraVar;
        byte b = this.a;
        Runnable runnable = this.c;
        float f = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                mi4 mi4Var = (mi4) obj;
                mi4Var.h = f;
                mi4Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v65 v65Var = (v65) obj;
                v65Var.h = f;
                v65Var.a.invalidate();
                u65 u65Var = (u65) runnable;
                if (u65Var != null) {
                    u65Var.run();
                    return;
                }
                return;
            case 2:
                vr7 vr7Var = (vr7) obj;
                vr7Var.n = f;
                vr7Var.invalidate();
                if (animator == vr7Var.r && (tr7Var = (tr7) runnable) != null) {
                    tr7Var.run();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.p6 = null;
                photoViewer.f6 = 0.0f;
                photoViewer.b6 = 0.0f;
                photoViewer.g6 = 0.0f;
                float y1 = photoViewer.y1(false);
                photoViewer.e6 = y1;
                photoViewer.a6 = y1;
                photoViewer.f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float y12 = photoViewer.y1(false);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = y12;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.setRotated(false);
                if (Math.abs(f) > 0.0f) {
                    v48 v48Var = photoViewer.D1;
                    b33 b33Var = v48Var.c;
                    if (b33Var != null) {
                        b33Var.b(0.0f);
                        b33Var.setRotated(false);
                    }
                    boolean m = v48Var.b.m(f);
                    ImageView imageView = photoViewer.c1;
                    if (m) {
                        zkb.s(imageView, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        imageView.setColorFilter((ColorFilter) null);
                    }
                }
                zl6 zl6Var = photoViewer.X4.c;
                if (zl6Var != null) {
                    zl6Var.b = 0.0f;
                    zl6Var.a = 0.0f;
                    zl6Var.f = 1.0f;
                    zl6Var.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                jra jraVar = (jra) obj;
                jraVar.E = f;
                jraVar.invalidate();
                if (animator == jraVar.F && (iraVar = (ira) runnable) != null) {
                    iraVar.run();
                    return;
                }
                return;
            default:
                t7b t7bVar = (t7b) obj;
                t7bVar.M = null;
                t7bVar.J = f;
                t7bVar.h();
                t7bVar.r.invalidate();
                t7bVar.n.invalidate();
                runnable.run();
                t7bVar.Q.e();
                kk7.e().k(99, 512);
                kk7.e().o();
                t7bVar.l();
                Runnable runnable2 = t7bVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    t7bVar.R = null;
                }
                t7bVar.r.invalidate();
                t7bVar.i0.invalidate();
                return;
        }
    }
}
