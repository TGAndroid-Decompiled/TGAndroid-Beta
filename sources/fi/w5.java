package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class w5 extends View {
    public final ta f11852a;

    public w5(ta taVar, Context context) {
        super(context);
        this.f11852a = taVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        u5 u5Var = this.f11852a.D0;
        if (u5Var != null) {
            u5Var.d(canvas);
        }
    }
}
