package gi;

import android.graphics.Canvas;
import android.graphics.RectF;
import ci.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;
public abstract class e2 {
    public int f12651a;
    public float f12652b;
    public float f12653c;
    public float d = 0.0f;
    public int f12654e = 0;
    public final RectF f12655f = new RectF();
    public final gc f12656g;
    public final org.telegram.ui.Components.u5 h;

    public e2(fc fcVar) {
        this.f12656g = new gc(fcVar);
        this.h = new org.telegram.ui.Components.u5(fcVar, 350L, xq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
