package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class c08 extends e08 {
    public int H;
    public final a18 I;

    public c08(a18 a18Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.I = a18Var;
        this.H = 0;
    }

    @Override
    public final void a() {
        a18 a18Var = this.I;
        if (a18Var.getParentActivity() != null) {
            gl.l3(a18Var.getParentActivity(), a18Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = a18Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = a18Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        a18Var.J0();
        a18Var.C0();
    }
}
