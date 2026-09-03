package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class q7 extends FrameLayout {
    public d4 f15787a;
    public long f15788b;
    public ArrayList f15789c;
    public boolean d;
    public final y8 e;

    public q7(y8 y8Var, Context context) {
        super(context);
        this.e = y8Var;
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            invalidate();
            this.f15787a.setIsVisible(z4);
            this.e.A();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d) {
            return;
        }
        super.dispatchDraw(canvas);
    }
}
