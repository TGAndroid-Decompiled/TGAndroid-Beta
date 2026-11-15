package fi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class d5 extends h4 {
    public final i9 O;
    public final k5 P;

    public d5(Context context, k5 k5Var, i9 i9Var) {
        super(context);
        this.P = k5Var;
        this.O = i9Var;
        this.f11772x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new e4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i7) {
        e9 e9Var;
        k5 k5Var = this.P;
        e5 e5Var = k5Var.F;
        if (!k5Var.f11936x) {
            if (e5Var.getCurrentItem() != i7) {
                try {
                    e5Var.x(i7, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    e5Var.getAdapter().g();
                    e5Var.x(i7, false);
                }
            }
            i9 i9Var = this.O;
            if (i9Var.O0 != null && (e9Var = i9Var.f11875u0) != null) {
                if (i7 < 10) {
                    e9Var.c(false);
                } else if (i7 >= this.F.size() - 10) {
                    i9Var.f11875u0.c(true);
                }
            }
        }
    }
}
