package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.sr;
public abstract class m2 {
    public int f5161a;
    public float f5162b;
    public float f5163c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f5164f = new RectF();
    public final org.telegram.ui.Components.yc f5165g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.f5165g = new org.telegram.ui.Components.yc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, sr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
