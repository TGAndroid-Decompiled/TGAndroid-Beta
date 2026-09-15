package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class i6 extends View {
    public final qb f4782a;

    public i6(qb qbVar, Context context) {
        super(context);
        this.f4782a = qbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        g6 g6Var = this.f4782a.O0;
        if (g6Var != null) {
            g6Var.d(canvas);
        }
    }
}
