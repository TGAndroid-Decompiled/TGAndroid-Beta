package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class ha8 extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public ha8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        boolean z2;
        i22 i22Var;
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                photoViewer.o6 = null;
                x68 x68Var = photoViewer.D1;
                if (x68Var != null) {
                    boolean j = x68Var.b.j();
                    ImageView imageView = photoViewer.b1;
                    if (j) {
                        anb.s(imageView, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        imageView.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f6 = 0.0f;
                    photoViewer.f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q2();
                return;
            case 3:
                photoViewer.M1.o0(false);
                sa8 sa8Var = photoViewer.M1;
                sa8Var.k1.setTypeface(m58.e(sa8Var.F1).j);
                sa8Var.P0.setVisibility(0);
                sa8Var.M0.setVisibility(0);
                sa8Var.N0.setVisibility(0);
                kw7 kw7Var = photoViewer.x4;
                kw7Var.f = true;
                int childCount = kw7Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    kw7Var.getChildAt(i).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = (byte) 3;
                mx5 mx5Var = photoViewer.d0().M;
                if (photoViewer.t4 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mx5Var.b(z);
                mx5 mx5Var2 = photoViewer.L1;
                if (mx5Var2 != null) {
                    if (photoViewer.t4 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mx5Var2.b(z2);
                }
                photoViewer.n6 = -1;
                float z1 = photoViewer.z1(false);
                photoViewer.Z5 = z1;
                photoViewer.d6 = z1;
                photoViewer.b6 = 0.0f;
                photoViewer.c6 = 0.0f;
                photoViewer.I2(z1);
                photoViewer.u2 = true;
                photoViewer.f0.invalidate();
                pb8 pb8Var = photoViewer.d;
                if (pb8Var == null || !pb8Var.Q()) {
                    photoViewer.W0();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                gm.c3(new q78(this, (byte) 8));
                return;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    yv1 yv1Var = photoViewer.k4;
                    if (yv1Var == null && (i22Var = photoViewer.b2) != null) {
                        d dVar = i22Var.Z1;
                        if (dVar instanceof yv1) {
                            yv1Var = (yv1) dVar;
                        }
                    }
                    if (yv1Var != null) {
                        yv1Var.z6(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.o4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.o6 = null;
                photoViewer.f0.invalidate();
                return;
            case 8:
                photoViewer.y3[0].setTag(null);
                return;
            default:
                photoViewer.y3[0].setTag(null);
                return;
        }
    }
}
