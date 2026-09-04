package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.pr;
public abstract class n2 {
    public int f7671a;
    public float f7672b;
    public float f7673c;
    public float d = 0.0f;
    public int f7674e = 0;
    public final RectF f7675f = new RectF();
    public final org.telegram.ui.Components.zc f7676g;
    public final org.telegram.ui.Components.e6 h;

    public n2(r2 r2Var) {
        this.f7676g = new org.telegram.ui.Components.zc(r2Var);
        this.h = new org.telegram.ui.Components.e6(r2Var, 350L, pr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
