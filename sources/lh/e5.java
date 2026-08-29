package lh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class e5 extends i4 {
    public final i9 J;
    public final l5 K;

    public e5(Context context, l5 l5Var, i9 i9Var) {
        super(context);
        this.K = l5Var;
        this.J = i9Var;
        this.f15723w = -1;
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.E = new GestureDetector(new dg.e(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.D = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        e9 e9Var;
        l5 l5Var = this.K;
        f5 f5Var = l5Var.A;
        if (!l5Var.f15890w) {
            if (f5Var.getCurrentItem() != i10) {
                try {
                    f5Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    f5Var.getAdapter().g();
                    f5Var.x(i10, false);
                }
            }
            i9 i9Var = this.J;
            if (i9Var.K0 != null && (e9Var = i9Var.f15776p0) != null) {
                if (i10 < 10) {
                    e9Var.d(false);
                } else if (i10 >= this.A.size() - 10) {
                    i9Var.f15776p0.d(true);
                }
            }
        }
    }
}
