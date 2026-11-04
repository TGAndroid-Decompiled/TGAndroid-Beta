package ei;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class l5 extends p4 {
    public final r9 O;
    public final s5 P;

    public l5(Context context, s5 s5Var, r9 r9Var) {
        super(context);
        this.P = s5Var;
        this.O = r9Var;
        this.f10767x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new m4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i3) {
        n9 n9Var;
        s5 s5Var = this.P;
        m5 m5Var = s5Var.F;
        if (!s5Var.f11006x) {
            if (m5Var.getCurrentItem() != i3) {
                try {
                    m5Var.x(i3, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    m5Var.getAdapter().g();
                    m5Var.x(i3, false);
                }
            }
            r9 r9Var = this.O;
            if (r9Var.P0 != null && (n9Var = r9Var.f10953u0) != null) {
                if (i3 < 10) {
                    n9Var.c(false);
                } else if (i3 >= this.F.size() - 10) {
                    r9Var.f10953u0.c(true);
                }
            }
        }
    }
}
