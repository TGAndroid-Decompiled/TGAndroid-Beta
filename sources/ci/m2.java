package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.tr;
public abstract class m2 {
    public int f5557a;
    public float f5558b;
    public float f5559c;
    public float d = 0.0f;
    public int f5560e = 0;
    public final RectF f5561f = new RectF();
    public final org.telegram.ui.Components.zc f5562g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.f5562g = new org.telegram.ui.Components.zc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, tr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
