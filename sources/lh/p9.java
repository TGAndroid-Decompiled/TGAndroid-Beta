package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class p9 extends h51 {
    public static final int f12925a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        int i10;
        q9 q9Var = (q9) view;
        org.telegram.ui.Components.k6 k6Var = q9Var.f12975a;
        ImageView imageView = q9Var.f12976b;
        int i11 = q9Var.f12977c;
        int i12 = i51Var.d;
        if (i11 == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        q9Var.f12977c = i12;
        k6Var.c(i51Var.f25585l, z10, true);
        if (i51Var.f25590q) {
            i10 = org.telegram.ui.ActionBar.j6.f20078o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        k6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f10 = 180.0f;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (i51Var.f25580f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(mr.h);
        } else {
            if (i51Var.f25580f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        q9Var.d = z4;
        q9Var.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q9(context);
    }
}
