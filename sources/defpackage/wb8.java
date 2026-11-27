package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public final class wb8 extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public wb8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        boolean z2;
        n12 n12Var;
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                photoViewer.o6 = null;
                k88 k88Var = photoViewer.D1;
                if (k88Var != null) {
                    boolean j = k88Var.b.j();
                    ImageView imageView = photoViewer.b1;
                    if (j) {
                        yob.s(imageView, aob.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
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
                hc8 hc8Var = photoViewer.M1;
                hc8Var.e1.setTypeface(a78.e(hc8Var.z1).j);
                hc8Var.J0.setVisibility(0);
                hc8Var.G0.setVisibility(0);
                hc8Var.H0.setVisibility(0);
                qx7 qx7Var = photoViewer.x4;
                qx7Var.f = true;
                int childCount = qx7Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    qx7Var.getChildAt(i).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = (byte) 3;
                rx5 rx5Var = photoViewer.c0().M;
                if (photoViewer.t4 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                rx5Var.b(z);
                rx5 rx5Var2 = photoViewer.L1;
                if (rx5Var2 != null) {
                    if (photoViewer.t4 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rx5Var2.b(z2);
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
                ed8 ed8Var = photoViewer.d;
                if (ed8Var == null || !ed8Var.P()) {
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
                hl.c3(new x38(this, (byte) 16));
                return;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    zu1 zu1Var = photoViewer.k4;
                    if (zu1Var == null && (n12Var = photoViewer.b2) != null) {
                        e eVar = n12Var.Z1;
                        if (eVar instanceof zu1) {
                            zu1Var = (zu1) eVar;
                        }
                    }
                    if (zu1Var != null) {
                        zu1Var.z6(runnable);
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
