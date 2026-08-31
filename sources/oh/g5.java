package oh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class g5 extends k4 {
    public final i9 K;
    public final n5 L;

    public g5(Context context, n5 n5Var, i9 i9Var) {
        super(context);
        this.L = n5Var;
        this.K = i9Var;
        this.f17358w = -1;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.F = new GestureDetector(new gg.e(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.E = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        e9 e9Var;
        n5 n5Var = this.L;
        h5 h5Var = n5Var.B;
        if (!n5Var.f17495w) {
            if (h5Var.getCurrentItem() != i10) {
                try {
                    h5Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    h5Var.getAdapter().g();
                    h5Var.x(i10, false);
                }
            }
            i9 i9Var = this.K;
            if (i9Var.L0 != null && (e9Var = i9Var.f17288q0) != null) {
                if (i10 < 10) {
                    e9Var.b(false);
                } else if (i10 >= this.B.size() - 10) {
                    i9Var.f17288q0.b(true);
                }
            }
        }
    }
}
