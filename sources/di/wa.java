package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class wa extends m41 {
    public static final int f9975b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        xa xaVar = (xa) view;
        org.telegram.ui.Components.n6 n6Var = xaVar.f10013a;
        ImageView imageView = xaVar.f10014b;
        int i12 = xaVar.f10015c;
        int i13 = n41Var.d;
        if (i12 == i13) {
            z11 = true;
        } else {
            z11 = false;
        }
        xaVar.f10015c = i13;
        n6Var.c(n41Var.f37655m, z11, true);
        if (n41Var.f37660r) {
            i7 = org.telegram.ui.ActionBar.n6.f29651o6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.n6.v0(i7);
        if (n41Var.f37660r) {
            i10 = org.telegram.ui.ActionBar.n6.f29651o6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.u6.Y(n6Var, i10, null);
        if (n41Var.f37660r) {
            i11 = org.telegram.ui.ActionBar.n6.f29651o6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.u6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (n41Var.f37649f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(kr.h);
        } else {
            if (n41Var.f37649f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new xa(context);
    }
}
