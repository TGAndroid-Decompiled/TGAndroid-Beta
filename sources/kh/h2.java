package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.gr;
public abstract class h2 {
    public int f15386a;
    public float f15387b;
    public float f15388c;
    public float d = 0.0f;
    public int f15389e = 0;
    public final RectF f15390f = new RectF();
    public final org.telegram.ui.Components.pc f15391g;
    public final org.telegram.ui.Components.y5 h;

    public h2(l2 l2Var) {
        this.f15391g = new org.telegram.ui.Components.pc(l2Var);
        this.h = new org.telegram.ui.Components.y5(l2Var, 350L, gr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
