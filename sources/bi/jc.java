package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;
public final class jc extends q31 {
    public static final int f4118b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        kc kcVar = (kc) view;
        org.telegram.ui.Components.j6 j6Var = kcVar.f4232a;
        ImageView imageView = kcVar.f4233b;
        int i12 = kcVar.f4234c;
        int i13 = r31Var.d;
        if (i12 == i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        kcVar.f4234c = i13;
        j6Var.c(r31Var.f37598l, z10, true);
        if (r31Var.f37603q) {
            i7 = org.telegram.ui.ActionBar.k6.f28048o6;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.k6.v0(i7);
        if (r31Var.f37603q) {
            i10 = org.telegram.ui.ActionBar.k6.f28048o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.Z(j6Var, i10, null);
        if (r31Var.f37603q) {
            i11 = org.telegram.ui.ActionBar.k6.f28048o6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (r31Var.f37593f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(xq.h);
        } else {
            if (r31Var.f37593f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        kcVar.d = z9;
        kcVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new kc(context);
    }
}
