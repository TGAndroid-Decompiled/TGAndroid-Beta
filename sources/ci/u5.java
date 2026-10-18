package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class u5 extends w4 {
    public final z9 N;
    public final b6 O;

    public u5(Context context, b6 b6Var, z9 z9Var) {
        super(context);
        this.O = b6Var;
        this.N = z9Var;
        this.f6051w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new t4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        v9 v9Var;
        b6 b6Var = this.O;
        v5 v5Var = b6Var.E;
        if (!b6Var.f5183w) {
            if (v5Var.getCurrentItem() != i10) {
                try {
                    v5Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    v5Var.getAdapter().g();
                    v5Var.x(i10, false);
                }
            }
            z9 z9Var = this.N;
            if (z9Var.O0 != null && (v9Var = z9Var.f6252t0) != null) {
                if (i10 < 10) {
                    v9Var.b(false);
                } else if (i10 >= this.E.size() - 10) {
                    z9Var.f6252t0.b(true);
                }
            }
        }
    }
}
