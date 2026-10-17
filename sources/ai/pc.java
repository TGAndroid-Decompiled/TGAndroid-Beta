package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class pc extends e61 {
    public static final int f2037a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        int i10;
        qc qcVar = (qc) view;
        org.telegram.ui.Components.q6 q6Var = qcVar.f2082a;
        ImageView imageView = qcVar.f2083b;
        int i11 = qcVar.f2084c;
        int i12 = f61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        qcVar.f2084c = i12;
        q6Var.c(f61Var.f26140l, z11, true);
        if (f61Var.f26145q) {
            i10 = org.telegram.ui.ActionBar.h6.f21189o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        q6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (f61Var.f26135f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(bs.h);
        } else {
            if (f61Var.f26135f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        qcVar.d = z10;
        qcVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new qc(context);
    }
}
