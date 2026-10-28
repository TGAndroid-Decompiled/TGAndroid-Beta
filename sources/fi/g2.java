package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;
public abstract class g2 {
    public int f10891a;
    public float f10892b;
    public float f10893c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f10894f = new RectF();
    public final xc f10895g;
    public final org.telegram.ui.Components.h6 h;

    public g2(j2 j2Var) {
        this.f10895g = new xc(j2Var);
        this.h = new org.telegram.ui.Components.h6(j2Var, 350L, ds.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
