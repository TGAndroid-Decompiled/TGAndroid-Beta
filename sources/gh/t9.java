package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class t9 extends k41 {
    public static final int f8926a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        boolean z11;
        int i9;
        u9 u9Var = (u9) view;
        org.telegram.ui.Components.j6 j6Var = u9Var.f8986a;
        ImageView imageView = u9Var.f8987b;
        int i10 = u9Var.f8988c;
        int i11 = l41Var.d;
        if (i10 == i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        u9Var.f8988c = i11;
        j6Var.c(l41Var.f30339l, z11, true);
        if (l41Var.f30344q) {
            i9 = org.telegram.ui.ActionBar.f6.o6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        j6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f10 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (l41Var.f30334f) {
                f10 = 0.0f;
            }
            animate.rotation(f10).setDuration(340L).setInterpolator(gr.h);
        } else {
            if (l41Var.f30334f) {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        u9Var.d = z10;
        u9Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new u9(context);
    }
}
