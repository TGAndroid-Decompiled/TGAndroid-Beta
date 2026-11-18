package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
public abstract class f2 {
    public int f14645a;
    public float f14646b;
    public float f14647c;
    public float d = 0.0f;
    public int f14648e = 0;
    public final RectF f14649f = new RectF();
    public final mc f14650g;
    public final org.telegram.ui.Components.c6 h;

    public f2(yb ybVar) {
        this.f14650g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.c6(ybVar, 350L, lr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
