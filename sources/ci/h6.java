package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class h6 extends View {
    public final nb f5168a;

    public h6(nb nbVar, Context context) {
        super(context);
        this.f5168a = nbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f6 f6Var = this.f5168a.O0;
        if (f6Var != null) {
            f6Var.d(canvas);
        }
    }
}
