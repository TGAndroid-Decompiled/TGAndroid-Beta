package ih;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class h5 extends m4 {
    public final m9 J;
    public final o5 K;

    public h5(Context context, o5 o5Var, m9 m9Var) {
        super(context);
        this.K = o5Var;
        this.J = m9Var;
        this.f11764w = -1;
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.E = new GestureDetector(new ag.f(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.D = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i9) {
        i9 i9Var;
        o5 o5Var = this.K;
        i5 i5Var = o5Var.A;
        if (!o5Var.f11898w) {
            if (i5Var.getCurrentItem() != i9) {
                try {
                    i5Var.x(i9, false);
                } catch (Throwable th) {
                    FileLog.e(th);
                    i5Var.getAdapter().g();
                    i5Var.x(i9, false);
                }
            }
            m9 m9Var = this.J;
            if (m9Var.K0 != null && (i9Var = m9Var.f11817p0) != null) {
                if (i9 < 10) {
                    i9Var.d(false);
                } else if (i9 >= this.A.size() - 10) {
                    m9Var.f11817p0.d(true);
                }
            }
        }
    }
}
