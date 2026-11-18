package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.z41;
public final class wa extends k41 {
    public static final int f9976b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        xa xaVar = (xa) view;
        org.telegram.ui.Components.n6 n6Var = xaVar.f10046a;
        ImageView imageView = xaVar.f10047b;
        int i12 = xaVar.f10048c;
        int i13 = l41Var.d;
        if (i12 == i13) {
            z11 = true;
        } else {
            z11 = false;
        }
        xaVar.f10048c = i13;
        n6Var.c(l41Var.f37018m, z11, true);
        if (l41Var.f37023r) {
            i7 = org.telegram.ui.ActionBar.n6.f29594o6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.n6.v0(i7);
        if (l41Var.f37023r) {
            i10 = org.telegram.ui.ActionBar.n6.f29594o6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.u6.Y(n6Var, i10, null);
        if (l41Var.f37023r) {
            i11 = org.telegram.ui.ActionBar.n6.f29594o6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.u6.s(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (l41Var.f37012f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(lr.h);
        } else {
            if (l41Var.f37012f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        xaVar.d = z10;
        xaVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new xa(context);
    }
}
