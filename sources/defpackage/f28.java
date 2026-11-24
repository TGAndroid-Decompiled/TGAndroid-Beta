package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class f28 extends h28 {
    public int H;
    public final d38 I;

    public f28(d38 d38Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.I = d38Var;
        this.H = 0;
    }

    @Override
    public final void a() {
        d38 d38Var = this.I;
        if (d38Var.getParentActivity() != null) {
            gm.k3(d38Var.getParentActivity(), d38Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = d38Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = d38Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        d38Var.K0();
        d38Var.D0();
    }
}
