package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class s9 extends m41 {

    public static final int f10031a = 0;

    static {
        m41.setup(new s9());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        t9 t9Var = (t9) view;
        org.telegram.ui.Components.j6 j6Var = t9Var.f10109a;
        ImageView imageView = t9Var.f10110b;
        int i10 = t9Var.f10111c;
        int i11 = n41Var.d;
        boolean z11 = i10 == i11;
        t9Var.f10111c = i11;
        j6Var.c(n41Var.f30844l, z11, true);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, n41Var.f30849q ? org.telegram.ui.ActionBar.g6.f23251o6 : org.telegram.ui.ActionBar.g6.G6, false);
        j6Var.setTextColor(iW0);
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(n41Var.f30839f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h);
        } else {
            imageView.setRotation(n41Var.f30839f ? 0.0f : 180.0f);
        }
        t9Var.d = z10;
        t9Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t9(context);
    }
}
