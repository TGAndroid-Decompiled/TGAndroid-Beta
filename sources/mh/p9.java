package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class p9 extends g51 {
    public static final int f14611a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        int i10;
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.f14647a;
        ImageView imageView = q9Var.f14648b;
        int i11 = q9Var.f14649c;
        int i12 = h51Var.d;
        if (i11 == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        q9Var.f14649c = i12;
        k6Var.c(h51Var.f27375l, z10, true);
        if (h51Var.f27380q) {
            i10 = org.telegram.ui.ActionBar.k6.f21859o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (h51Var.f27370f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(pr.h);
        } else {
            if (h51Var.f27370f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q9(context);
    }
}
