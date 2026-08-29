package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
public abstract class e2 {
    public int f17585a;
    public float f17586b;
    public float f17587c;
    public float d = 0.0f;
    public int f17588e = 0;
    public final RectF f17589f = new RectF();
    public final uc f17590g;
    public final org.telegram.ui.Components.d6 h;

    public e2(i2 i2Var) {
        this.f17590g = new uc(i2Var);
        this.h = new org.telegram.ui.Components.d6(i2Var, 350L, jr.h);
    }

    public abstract void a(Canvas canvas, float f9, float f10);

    public void b(boolean z10) {
    }
}
