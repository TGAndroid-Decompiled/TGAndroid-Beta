package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class i38 extends k38 {
    public int H;
    public final h48 I;

    public i38(h48 h48Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.I = h48Var;
        this.H = 0;
    }

    @Override
    public final void a() {
        h48 h48Var = this.I;
        if (h48Var.getParentActivity() != null) {
            hl.k3(h48Var.getParentActivity(), h48Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = h48Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = h48Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        h48Var.K0();
        h48Var.D0();
    }
}
