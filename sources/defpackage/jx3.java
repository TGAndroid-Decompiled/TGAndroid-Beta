package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public abstract class jx3 {
    public byte a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final u51 g;
    public final ln h;

    public jx3(nx3 nx3Var) {
        this.g = new u51(nx3Var);
        this.h = new ln(350L, nx3Var, d53.h);
    }

    public abstract void a(Canvas canvas, float f, float f2);

    public void b(boolean z) {
    }
}
