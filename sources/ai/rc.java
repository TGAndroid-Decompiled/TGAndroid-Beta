package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class rc extends l61 {
    public static final int f2138a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        sc scVar = (sc) view;
        org.telegram.ui.Components.q6 q6Var = scVar.f2174a;
        ImageView imageView = scVar.f2175b;
        int i13 = scVar.f2176c;
        int i14 = m61Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        scVar.f2176c = i14;
        q6Var.c(m61Var.f28559l, z11, true);
        if (m61Var.f28564q) {
            i10 = org.telegram.ui.ActionBar.k6.f21386o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.k6.v0(i10);
        if (m61Var.f28564q) {
            i11 = org.telegram.ui.ActionBar.k6.f21386o6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.a0(q6Var, i11, null);
        if (m61Var.f28564q) {
            i12 = org.telegram.ui.ActionBar.k6.f21386o6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (m61Var.f28554f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(bs.h);
        } else {
            if (m61Var.f28554f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        scVar.d = z10;
        scVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new sc(context);
    }
}
