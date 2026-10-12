package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class g6 extends View {
    public final mb f6972a;

    public g6(mb mbVar, Context context) {
        super(context);
        this.f6972a = mbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e6 e6Var = this.f6972a.O0;
        if (e6Var != null) {
            e6Var.d(canvas);
        }
    }
}
