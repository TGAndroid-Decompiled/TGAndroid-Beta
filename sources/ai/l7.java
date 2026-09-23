package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class l7 extends m6 {
    public final jc N;
    public final s7 O;

    public l7(s7 s7Var, jc jcVar, Context context) {
        super(context);
        this.O = s7Var;
        this.N = jcVar;
        this.f1256w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new j6(0, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        fc fcVar;
        s7 s7Var = this.O;
        m7 m7Var = s7Var.E;
        if (!s7Var.f1505w) {
            if (m7Var.getCurrentItem() != i10) {
                try {
                    m7Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    m7Var.getAdapter().g();
                    m7Var.x(i10, false);
                }
            }
            jc jcVar = this.N;
            if (jcVar.O0 != null && (fcVar = jcVar.f1101t0) != null) {
                if (i10 < 10) {
                    fcVar.b(false);
                } else if (i10 >= this.E.size() - 10) {
                    jcVar.f1101t0.b(true);
                }
            }
        }
    }
}
