package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.kr;
public abstract class m2 {
    public int f14880a;
    public float f14881b;
    public float f14882c;
    public float d = 0.0f;
    public int f14883e = 0;
    public final RectF f14884f = new RectF();
    public final org.telegram.ui.Components.lc f14885g;
    public final org.telegram.ui.Components.c6 h;

    public m2(p2 p2Var) {
        this.f14885g = new org.telegram.ui.Components.lc(p2Var);
        this.h = new org.telegram.ui.Components.c6(p2Var, 350L, kr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
