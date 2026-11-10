package di;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class m5 extends p4 {
    public final q9 N;
    public final t5 O;

    public m5(Context context, t5 t5Var, q9 q9Var) {
        super(context);
        this.O = t5Var;
        this.N = q9Var;
        this.f9512x = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new m4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i7) {
        m9 m9Var;
        t5 t5Var = this.O;
        n5 n5Var = t5Var.E;
        if (!t5Var.f9798x) {
            if (n5Var.getCurrentItem() != i7) {
                try {
                    n5Var.x(i7, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    n5Var.getAdapter().g();
                    n5Var.x(i7, false);
                }
            }
            q9 q9Var = this.N;
            if (q9Var.N0 != null && (m9Var = q9Var.f9642t0) != null) {
                if (i7 < 10) {
                    m9Var.b(false);
                } else if (i7 >= this.E.size() - 10) {
                    q9Var.f9642t0.b(true);
                }
            }
        }
    }
}
