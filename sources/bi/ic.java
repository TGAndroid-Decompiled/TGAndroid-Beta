package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class ic extends t61 {
    public static final int f4848a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        jc jcVar = (jc) view;
        org.telegram.ui.Components.s6 s6Var = jcVar.f4916a;
        ImageView imageView = jcVar.f4917b;
        int i13 = jcVar.f4918c;
        int i14 = u61Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        jcVar.f4918c = i14;
        s6Var.c(u61Var.f33249l, z11, true);
        if (u61Var.f33254q) {
            i10 = org.telegram.ui.ActionBar.y6.f23561o6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.y6.v0(i10);
        if (u61Var.f33254q) {
            i11 = org.telegram.ui.ActionBar.y6.f23561o6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        if (u61Var.f33254q) {
            i12 = org.telegram.ui.ActionBar.y6.f23561o6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.f7.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (u61Var.f33244f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(ds.h);
        } else {
            if (u61Var.f33244f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        jcVar.d = z10;
        jcVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new jc(context);
    }
}
