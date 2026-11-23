package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
public abstract class e2 {
    public int f14498a;
    public float f14499b;
    public float f14500c;
    public float d = 0.0f;
    public int f14501e = 0;
    public final RectF f14502f = new RectF();
    public final mc f14503g;
    public final org.telegram.ui.Components.d6 h;

    public e2(yb ybVar) {
        this.f14503g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.d6(ybVar, 350L, nr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
