package di;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class l5 extends o4 {
    public final p9 N;
    public final s5 O;

    public l5(Context context, s5 s5Var, p9 p9Var) {
        super(context);
        this.O = s5Var;
        this.N = p9Var;
        this.f9463x = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new l4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i7) {
        l9 l9Var;
        s5 s5Var = this.O;
        m5 m5Var = s5Var.E;
        if (!s5Var.f9764x) {
            if (m5Var.getCurrentItem() != i7) {
                try {
                    m5Var.x(i7, false);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    m5Var.getAdapter().g();
                    m5Var.x(i7, false);
                }
            }
            p9 p9Var = this.N;
            if (p9Var.N0 != null && (l9Var = p9Var.f9572t0) != null) {
                if (i7 < 10) {
                    l9Var.b(false);
                } else if (i7 >= this.E.size() - 10) {
                    p9Var.f9572t0.b(true);
                }
            }
        }
    }
}
