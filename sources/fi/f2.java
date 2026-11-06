package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import bi.nd;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
public abstract class f2 {
    public int f11949a;
    public float f11950b;
    public float f11951c;
    public float d = 0.0f;
    public int f11952e = 0;
    public final RectF f11953f = new RectF();
    public final ic f11954g;
    public final org.telegram.ui.Components.w5 h;

    public f2(nd ndVar) {
        this.f11954g = new ic(ndVar);
        this.h = new org.telegram.ui.Components.w5(ndVar, 350L, xq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z9) {
    }
}
