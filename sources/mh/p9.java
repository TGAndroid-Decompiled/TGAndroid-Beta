package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class p9 extends i51 {
    public static final int f14609a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        int i10;
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.f14645a;
        ImageView imageView = q9Var.f14646b;
        int i11 = q9Var.f14647c;
        int i12 = j51Var.d;
        if (i11 == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        q9Var.f14647c = i12;
        k6Var.c(j51Var.f28014l, z10, true);
        if (j51Var.f28019q) {
            i10 = org.telegram.ui.ActionBar.k6.f21857o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (j51Var.f28009f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(pr.h);
        } else {
            if (j51Var.f28009f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q9(context);
    }
}
