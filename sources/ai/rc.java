package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zr;
public final class rc extends k61 {
    public static final int f2138a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        sc scVar = (sc) view;
        org.telegram.ui.Components.o6 o6Var = scVar.f2174a;
        ImageView imageView = scVar.f2175b;
        int i13 = scVar.f2176c;
        int i14 = l61Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        scVar.f2176c = i14;
        o6Var.c(l61Var.f28227l, z11, true);
        if (l61Var.f28232q) {
            i10 = org.telegram.ui.ActionBar.k6.f21387o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.k6.v0(i10);
        if (l61Var.f28232q) {
            i11 = org.telegram.ui.ActionBar.k6.f21387o6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.a0(o6Var, i11, null);
        if (l61Var.f28232q) {
            i12 = org.telegram.ui.ActionBar.k6.f21387o6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (l61Var.f28222f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(zr.h);
        } else {
            if (l61Var.f28222f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        scVar.d = z10;
        scVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new sc(context);
    }
}
