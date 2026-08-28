package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class y5 extends View {
    public final ya f16399a;

    public y5(ya yaVar, Context context) {
        super(context);
        this.f16399a = yaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        w5 w5Var = this.f16399a.K0;
        if (w5Var != null) {
            w5Var.d(canvas);
        }
    }
}
