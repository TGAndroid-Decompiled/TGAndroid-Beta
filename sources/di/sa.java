package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class sa extends a41 {
    public static final int f9407b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        ta taVar = (ta) view;
        org.telegram.ui.Components.h6 h6Var = taVar.f9478a;
        ImageView imageView = taVar.f9479b;
        int i12 = taVar.f9480c;
        int i13 = b41Var.d;
        if (i12 == i13) {
            z11 = true;
        } else {
            z11 = false;
        }
        taVar.f9480c = i13;
        h6Var.c(b41Var.f33184l, z11, true);
        if (b41Var.f33189q) {
            i7 = org.telegram.ui.ActionBar.j6.f29049o6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.j6.v0(i7);
        if (b41Var.f33189q) {
            i10 = org.telegram.ui.ActionBar.j6.f29049o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, null);
        if (b41Var.f33189q) {
            i11 = org.telegram.ui.ActionBar.j6.f29049o6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.q6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (b41Var.f33179f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(er.h);
        } else {
            if (b41Var.f33179f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        taVar.d = z10;
        taVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ta(context);
    }
}
