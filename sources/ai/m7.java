package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class m7 extends n6 {
    public final kc N;
    public final t7 O;

    public m7(t7 t7Var, kc kcVar, Context context) {
        super(context);
        this.O = t7Var;
        this.N = kcVar;
        this.f1474w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new k6(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        gc gcVar;
        t7 t7Var = this.O;
        n7 n7Var = t7Var.E;
        if (!t7Var.f1746w) {
            if (n7Var.getCurrentItem() != i10) {
                try {
                    n7Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    n7Var.getAdapter().g();
                    n7Var.x(i10, false);
                }
            }
            kc kcVar = this.N;
            if (kcVar.O0 != null && (gcVar = kcVar.f1297t0) != null) {
                if (i10 < 10) {
                    gcVar.b(false);
                } else if (i10 >= this.E.size() - 10) {
                    kcVar.f1297t0.b(true);
                }
            }
        }
    }
}
