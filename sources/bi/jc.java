package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
public final class jc extends x31 {
    public static final int f4118b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        kc kcVar = (kc) view;
        org.telegram.ui.Components.j6 j6Var = kcVar.f4232a;
        ImageView imageView = kcVar.f4233b;
        int i12 = kcVar.f4234c;
        int i13 = y31Var.d;
        if (i12 == i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        kcVar.f4234c = i13;
        j6Var.c(y31Var.f40568l, z10, true);
        if (y31Var.f40573q) {
            i7 = org.telegram.ui.ActionBar.l6.f28065o6;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.G6;
        }
        org.telegram.ui.ActionBar.l6.v0(i7);
        if (y31Var.f40573q) {
            i10 = org.telegram.ui.ActionBar.l6.f28065o6;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.G6;
        }
        org.telegram.ui.ActionBar.s6.Y(j6Var, i10, null);
        if (y31Var.f40573q) {
            i11 = org.telegram.ui.ActionBar.l6.f28065o6;
        } else {
            i11 = org.telegram.ui.ActionBar.l6.G6;
        }
        org.telegram.ui.ActionBar.s6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (y31Var.f40563f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(xq.h);
        } else {
            if (y31Var.f40563f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new kc(context);
    }
}
