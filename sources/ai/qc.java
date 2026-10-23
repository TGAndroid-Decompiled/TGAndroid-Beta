package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class qc extends g61 {
    public static final int f2090a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        int i10;
        rc rcVar = (rc) view;
        org.telegram.ui.Components.q6 q6Var = rcVar.f2132a;
        ImageView imageView = rcVar.f2133b;
        int i11 = rcVar.f2134c;
        int i12 = h61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        rcVar.f2134c = i12;
        q6Var.c(h61Var.f26786l, z11, true);
        if (h61Var.f26791q) {
            i10 = org.telegram.ui.ActionBar.h6.f21197o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        q6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (h61Var.f26781f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(bs.h);
        } else {
            if (h61Var.f26781f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        rcVar.d = z10;
        rcVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new rc(context);
    }
}
