package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.wr;
public abstract class z2 {
    public int f3997a;
    public float f3998b;
    public float f3999c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f4000f = new RectF();
    public final org.telegram.ui.Components.xc f4001g;
    public final org.telegram.ui.Components.d6 h;

    public z2(d3 d3Var) {
        this.f4001g = new org.telegram.ui.Components.xc(d3Var);
        this.h = new org.telegram.ui.Components.d6(d3Var, 350L, wr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
