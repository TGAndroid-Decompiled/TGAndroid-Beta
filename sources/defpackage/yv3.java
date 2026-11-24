package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public abstract class yv3 {
    public byte a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final n41 g;
    public final lm h;

    public yv3(cw3 cw3Var) {
        this.g = new n41(cw3Var);
        this.h = new lm(350L, cw3Var, s33.h);
    }

    public abstract void a(Canvas canvas, float f, float f2);

    public void b(boolean z) {
    }
}
