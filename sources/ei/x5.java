package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class x5 extends View {
    public final xa f10104a;

    public x5(xa xaVar, Context context) {
        super(context);
        this.f10104a = xaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        v5 v5Var = this.f10104a.O0;
        if (v5Var != null) {
            v5Var.d(canvas);
        }
    }
}
