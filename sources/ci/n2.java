package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qr;
public abstract class n2 {
    public int f5064a;
    public float f5065b;
    public float f5066c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f5067f = new RectF();
    public final org.telegram.ui.Components.yc f5068g;
    public final org.telegram.ui.Components.d6 h;

    public n2(r2 r2Var) {
        this.f5068g = new org.telegram.ui.Components.yc(r2Var);
        this.h = new org.telegram.ui.Components.d6(r2Var, 350L, qr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
