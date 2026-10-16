package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.es;
public abstract class l2 {
    public int f7346a;
    public float f7347b;
    public float f7348c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f7349f = new RectF();
    public final org.telegram.ui.Components.ad f7350g;
    public final org.telegram.ui.Components.g6 h;

    public l2(p2 p2Var) {
        this.f7350g = new org.telegram.ui.Components.ad(p2Var);
        this.h = new org.telegram.ui.Components.g6(p2Var, 350L, es.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
