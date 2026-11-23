package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
public final class wa extends n41 {
    public static final int f10014b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        xa xaVar = (xa) view;
        org.telegram.ui.Components.o6 o6Var = xaVar.f10052a;
        ImageView imageView = xaVar.f10053b;
        int i12 = xaVar.f10054c;
        int i13 = o41Var.d;
        if (i12 == i13) {
            z11 = true;
        } else {
            z11 = false;
        }
        xaVar.f10054c = i13;
        o6Var.c(o41Var.f38091m, z11, true);
        if (o41Var.f38096r) {
            i7 = org.telegram.ui.ActionBar.m6.f29581o6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.m6.v0(i7);
        if (o41Var.f38096r) {
            i10 = org.telegram.ui.ActionBar.m6.f29581o6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.t6.Y(o6Var, i10, null);
        if (o41Var.f38096r) {
            i11 = org.telegram.ui.ActionBar.m6.f29581o6;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.t6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (o41Var.f38085f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(nr.h);
        } else {
            if (o41Var.f38085f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new xa(context);
    }
}
