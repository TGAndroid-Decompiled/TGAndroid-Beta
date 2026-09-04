package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class i6 extends View {
    public final rb f7370a;

    public i6(rb rbVar, Context context) {
        super(context);
        this.f7370a = rbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        g6 g6Var = this.f7370a.O0;
        if (g6Var != null) {
            g6Var.d(canvas);
        }
    }
}
