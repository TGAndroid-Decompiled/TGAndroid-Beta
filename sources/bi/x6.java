package bi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class x6 extends y5 {
    public final sb N;
    public final e7 O;

    public x6(Context context, e7 e7Var, sb sbVar) {
        super(context);
        this.O = e7Var;
        this.N = sbVar;
        this.f4017w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new v5(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        ob obVar;
        e7 e7Var = this.O;
        y6 y6Var = e7Var.E;
        if (!e7Var.f2995w) {
            if (y6Var.getCurrentItem() != i10) {
                try {
                    y6Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    y6Var.getAdapter().g();
                    y6Var.x(i10, false);
                }
            }
            sb sbVar = this.N;
            if (sbVar.O0 != null && (obVar = sbVar.f3703t0) != null) {
                if (i10 < 10) {
                    obVar.b(false);
                } else if (i10 >= this.E.size() - 10) {
                    sbVar.f3703t0.b(true);
                }
            }
        }
    }
}
