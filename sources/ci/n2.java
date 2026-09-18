package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qr;
public abstract class n2 {
    public int f5063a;
    public float f5064b;
    public float f5065c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f5066f = new RectF();
    public final org.telegram.ui.Components.wc f5067g;
    public final org.telegram.ui.Components.c6 h;

    public n2(r2 r2Var) {
        this.f5067g = new org.telegram.ui.Components.wc(r2Var);
        this.h = new org.telegram.ui.Components.c6(r2Var, 350L, qr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
