package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.is;
public abstract class l2 {
    public int f5378a;
    public float f5379b;
    public float f5380c;
    public float d = 0.0f;
    public int f5381e = 0;
    public final RectF f5382f = new RectF();
    public final org.telegram.ui.Components.bd f5383g;
    public final org.telegram.ui.Components.g6 h;

    public l2(p2 p2Var) {
        this.f5383g = new org.telegram.ui.Components.bd(p2Var);
        this.h = new org.telegram.ui.Components.g6(p2Var, 350L, is.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
