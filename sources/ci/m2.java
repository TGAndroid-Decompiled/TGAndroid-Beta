package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.rr;
public abstract class m2 {
    public int f5160a;
    public float f5161b;
    public float f5162c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f5163f = new RectF();
    public final org.telegram.ui.Components.zc f5164g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.f5164g = new org.telegram.ui.Components.zc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, rr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
