package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import bi.nd;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;
public abstract class f2 {
    public int f11953a;
    public float f11954b;
    public float f11955c;
    public float d = 0.0f;
    public int f11956e = 0;
    public final RectF f11957f = new RectF();
    public final hc f11958g;
    public final org.telegram.ui.Components.v5 h;

    public f2(nd ndVar) {
        this.f11958g = new hc(ndVar);
        this.h = new org.telegram.ui.Components.v5(ndVar, 350L, wq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z9) {
    }
}
