package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class l5 extends View {
    public final ja f18044a;

    public l5(ja jaVar, Context context) {
        super(context);
        this.f18044a = jaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        j5 j5Var = this.f18044a.K0;
        if (j5Var != null) {
            j5Var.d(canvas);
        }
    }
}
