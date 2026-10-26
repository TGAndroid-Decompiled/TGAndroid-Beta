package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class ic extends s61 {
    public static final int f4848a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        jc jcVar = (jc) view;
        org.telegram.ui.Components.s6 s6Var = jcVar.f4916a;
        ImageView imageView = jcVar.f4917b;
        int i13 = jcVar.f4918c;
        int i14 = t61Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        jcVar.f4918c = i14;
        s6Var.c(t61Var.f32875l, z11, true);
        if (t61Var.f32880q) {
            i10 = org.telegram.ui.ActionBar.y6.f23560o6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.y6.v0(i10);
        if (t61Var.f32880q) {
            i11 = org.telegram.ui.ActionBar.y6.f23560o6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        if (t61Var.f32880q) {
            i12 = org.telegram.ui.ActionBar.y6.f23560o6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.f7.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (t61Var.f32870f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(ds.h);
        } else {
            if (t61Var.f32870f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        jcVar.d = z10;
        jcVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new jc(context);
    }
}
