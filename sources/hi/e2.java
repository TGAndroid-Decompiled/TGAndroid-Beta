package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
public abstract class e2 {
    public int f14583a;
    public float f14584b;
    public float f14585c;
    public float d = 0.0f;
    public int f14586e = 0;
    public final RectF f14587f = new RectF();
    public final mc f14588g;
    public final org.telegram.ui.Components.d6 h;

    public e2(yb ybVar) {
        this.f14588g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.d6(ybVar, 350L, nr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
