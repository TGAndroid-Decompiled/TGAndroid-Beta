package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class o9 extends v41 {
    public static final int f12588a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        int i10;
        p9 p9Var = (p9) view;
        org.telegram.ui.Components.o6 o6Var = p9Var.f12625a;
        ImageView imageView = p9Var.f12626b;
        int i11 = p9Var.f12627c;
        int i12 = w41Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        p9Var.f12627c = i12;
        o6Var.c(w41Var.f34300l, z11, true);
        if (w41Var.f34305q) {
            i10 = org.telegram.ui.ActionBar.g6.f23260o6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f9 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (w41Var.f34295f) {
                f9 = 0.0f;
            }
            animate.rotation(f9).setDuration(340L).setInterpolator(jr.h);
        } else {
            if (w41Var.f34295f) {
                f9 = 0.0f;
            }
            imageView.setRotation(f9);
        }
        p9Var.d = z10;
        p9Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p9(context);
    }
}
