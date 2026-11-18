package fi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class b5 extends f4 {
    public final f9 O;
    public final i5 P;

    public b5(Context context, i5 i5Var, f9 f9Var) {
        super(context);
        this.P = i5Var;
        this.O = f9Var;
        this.f11938x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new c4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i7) {
        b9 b9Var;
        i5 i5Var = this.P;
        c5 c5Var = i5Var.F;
        if (!i5Var.f12107x) {
            if (c5Var.getCurrentItem() != i7) {
                try {
                    c5Var.x(i7, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    c5Var.getAdapter().g();
                    c5Var.x(i7, false);
                }
            }
            f9 f9Var = this.O;
            if (f9Var.O0 != null && (b9Var = f9Var.f11997u0) != null) {
                if (i7 < 10) {
                    b9Var.b(false);
                } else if (i7 >= this.F.size() - 10) {
                    f9Var.f11997u0.b(true);
                }
            }
        }
    }
}
