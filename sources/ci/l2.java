package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.js;
public abstract class l2 {
    public int f5377a;
    public float f5378b;
    public float f5379c;
    public float d = 0.0f;
    public int f5380e = 0;
    public final RectF f5381f = new RectF();
    public final org.telegram.ui.Components.ad f5382g;
    public final org.telegram.ui.Components.g6 h;

    public l2(p2 p2Var) {
        this.f5382g = new org.telegram.ui.Components.ad(p2Var);
        this.h = new org.telegram.ui.Components.g6(p2Var, 350L, js.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
