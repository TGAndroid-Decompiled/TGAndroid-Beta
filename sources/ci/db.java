package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public final class db extends q31 {
    public static final int f4990b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        int i3;
        int i10;
        int i11;
        eb ebVar = (eb) view;
        org.telegram.ui.Components.h6 h6Var = ebVar.f5054a;
        ImageView imageView = ebVar.f5055b;
        int i12 = ebVar.f5056c;
        int i13 = r31Var.d;
        if (i12 == i13) {
            z11 = true;
        } else {
            z11 = false;
        }
        ebVar.f5056c = i13;
        h6Var.c(r31Var.f37627l, z11, true);
        if (r31Var.f37632q) {
            i3 = org.telegram.ui.ActionBar.k6.f28081o6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.k6.v0(i3);
        if (r31Var.f37632q) {
            i10 = org.telegram.ui.ActionBar.k6.f28081o6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, null);
        if (r31Var.f37632q) {
            i11 = org.telegram.ui.ActionBar.k6.f28081o6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (r31Var.f37622f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(xq.h);
        } else {
            if (r31Var.f37622f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        ebVar.d = z10;
        ebVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new eb(context);
    }
}
