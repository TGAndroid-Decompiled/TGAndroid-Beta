package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.er;

public abstract class f2 {

    public int f15949a;

    public float f15950b;

    public float f15951c;
    public float d = 0.0f;

    public int f15952e = 0;

    public final RectF f15953f = new RectF();

    public final org.telegram.ui.Components.nc f15954g;
    public final org.telegram.ui.Components.y5 h;

    public f2(j2 j2Var) {
        this.f15954g = new org.telegram.ui.Components.nc(j2Var);
        this.h = new org.telegram.ui.Components.y5(j2Var, 350L, er.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
