package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
public abstract class i2 {
    public int f9185a;
    public float f9186b;
    public float f9187c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f9188f = new RectF();
    public final yc f9189g;
    public final org.telegram.ui.Components.f6 h;

    public i2(l2 l2Var) {
        this.f9189g = new yc(l2Var);
        this.h = new org.telegram.ui.Components.f6(l2Var, 350L, bs.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
