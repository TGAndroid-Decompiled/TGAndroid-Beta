package fi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class c5 extends f4 {
    public final f9 O;
    public final j5 P;

    public c5(Context context, j5 j5Var, f9 f9Var) {
        super(context);
        this.P = j5Var;
        this.O = f9Var;
        this.f11983x = -1;
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
        j5 j5Var = this.P;
        d5 d5Var = j5Var.F;
        if (!j5Var.f12196x) {
            if (d5Var.getCurrentItem() != i7) {
                try {
                    d5Var.x(i7, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    d5Var.getAdapter().g();
                    d5Var.x(i7, false);
                }
            }
            f9 f9Var = this.O;
            if (f9Var.O0 != null && (b9Var = f9Var.f12041u0) != null) {
                if (i7 < 10) {
                    b9Var.b(false);
                } else if (i7 >= this.F.size() - 10) {
                    f9Var.f12041u0.b(true);
                }
            }
        }
    }
}
