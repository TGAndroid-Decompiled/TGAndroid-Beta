package bi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class t6 extends w5 {
    public final pb N;
    public final a7 O;

    public t6(Context context, a7 a7Var, pb pbVar) {
        super(context);
        this.O = a7Var;
        this.N = pbVar;
        this.f3954w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new t5(0, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        lb lbVar;
        a7 a7Var = this.O;
        u6 u6Var = a7Var.E;
        if (!a7Var.f2769w) {
            if (u6Var.getCurrentItem() != i10) {
                try {
                    u6Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    u6Var.getAdapter().g();
                    u6Var.x(i10, false);
                }
            }
            pb pbVar = this.N;
            if (pbVar.O0 != null && (lbVar = pbVar.f3575t0) != null) {
                if (i10 < 10) {
                    lbVar.e(false);
                } else if (i10 >= this.E.size() - 10) {
                    pbVar.f3575t0.e(true);
                }
            }
        }
    }
}
