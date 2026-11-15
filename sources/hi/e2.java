package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.vb;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
public abstract class e2 {
    public int f14228a;
    public float f14229b;
    public float f14230c;
    public float d = 0.0f;
    public int f14231e = 0;
    public final RectF f14232f = new RectF();
    public final dc f14233g;
    public final org.telegram.ui.Components.u5 h;

    public e2(vb vbVar) {
        this.f14233g = new dc(vbVar);
        this.h = new org.telegram.ui.Components.u5(vbVar, 350L, er.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
