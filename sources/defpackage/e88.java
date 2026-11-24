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
public final class e88 extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public e88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        boolean z2;
        x02 x02Var;
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                photoViewer.o6 = null;
                v48 v48Var = photoViewer.D1;
                if (v48Var != null) {
                    boolean j = v48Var.b.j();
                    ImageView imageView = photoViewer.b1;
                    if (j) {
                        zkb.s(imageView, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
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
                q88 q88Var = photoViewer.M1;
                q88Var.k1.setTypeface(k38.e(q88Var.F1).j);
                q88Var.P0.setVisibility(0);
                q88Var.M0.setVisibility(0);
                q88Var.N0.setVisibility(0);
                ju7 ju7Var = photoViewer.x4;
                ju7Var.f = true;
                int childCount = ju7Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ju7Var.getChildAt(i).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = (byte) 3;
                mv5 mv5Var = photoViewer.d0().M;
                if (photoViewer.t4 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mv5Var.b(z);
                mv5 mv5Var2 = photoViewer.L1;
                if (mv5Var2 != null) {
                    if (photoViewer.t4 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mv5Var2.b(z2);
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
                o98 o98Var = photoViewer.d;
                if (o98Var == null || !o98Var.P()) {
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
                gl.c3(new w88(this, (byte) 1));
                return;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    mu1 mu1Var = photoViewer.k4;
                    if (mu1Var == null && (x02Var = photoViewer.b2) != null) {
                        d dVar = x02Var.Z1;
                        if (dVar instanceof mu1) {
                            mu1Var = (mu1) dVar;
                        }
                    }
                    if (mu1Var != null) {
                        mu1Var.s6(runnable);
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
