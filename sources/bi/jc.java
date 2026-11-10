package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
public final class jc extends w31 {
    public static final int f4115b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        kc kcVar = (kc) view;
        org.telegram.ui.Components.i6 i6Var = kcVar.f4232a;
        ImageView imageView = kcVar.f4233b;
        int i12 = kcVar.f4234c;
        int i13 = x31Var.d;
        if (i12 == i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        kcVar.f4234c = i13;
        i6Var.c(x31Var.f40156l, z10, true);
        if (x31Var.f40161q) {
            i7 = org.telegram.ui.ActionBar.m6.f28090o6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.m6.v0(i7);
        if (x31Var.f40161q) {
            i10 = org.telegram.ui.ActionBar.m6.f28090o6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.t6.Y(i6Var, i10, null);
        if (x31Var.f40161q) {
            i11 = org.telegram.ui.ActionBar.m6.f28090o6;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.t6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (x31Var.f40151f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(wq.h);
        } else {
            if (x31Var.f40151f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new kc(context);
    }
}
