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
        ut7 ut7Var;
        jta jtaVar;
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
                t85 t85Var = (t85) obj;
                t85Var.h = f;
                t85Var.a.invalidate();
                s85 s85Var = (s85) runnable;
                if (s85Var != null) {
                    s85Var.run();
                    return;
                }
                return;
            case 2:
                wt7 wt7Var = (wt7) obj;
                wt7Var.n = f;
                wt7Var.invalidate();
                if (animator == wt7Var.r && (ut7Var = (ut7) runnable) != null) {
                    ut7Var.run();
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
                    x68 x68Var = photoViewer.D1;
                    m43 m43Var = x68Var.c;
                    if (m43Var != null) {
                        m43Var.b(0.0f);
                        m43Var.setRotated(false);
                    }
                    boolean m = x68Var.b.m(f);
                    ImageView imageView = photoViewer.c1;
                    if (m) {
                        anb.s(imageView, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        imageView.setColorFilter((ColorFilter) null);
                    }
                }
                ao6 ao6Var = photoViewer.W4.c;
                if (ao6Var != null) {
                    ao6Var.b = 0.0f;
                    ao6Var.a = 0.0f;
                    ao6Var.f = 1.0f;
                    ao6Var.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                kta ktaVar = (kta) obj;
                ktaVar.E = f;
                ktaVar.invalidate();
                if (animator == ktaVar.F && (jtaVar = (jta) runnable) != null) {
                    jtaVar.run();
                    return;
                }
                return;
            default:
                v9b v9bVar = (v9b) obj;
                v9bVar.M = null;
                v9bVar.J = f;
                v9bVar.h();
                v9bVar.r.invalidate();
                v9bVar.n.invalidate();
                runnable.run();
                v9bVar.Q.e();
                nm7.e().k(100, 512);
                nm7.e().o();
                v9bVar.l();
                Runnable runnable2 = v9bVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    v9bVar.R = null;
                }
                v9bVar.r.invalidate();
                v9bVar.i0.invalidate();
                return;
        }
    }
}
