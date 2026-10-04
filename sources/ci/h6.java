package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class h6 extends View {
    public final mb f5135a;

    public h6(mb mbVar, Context context) {
        super(context);
        this.f5135a = mbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f6 f6Var = this.f5135a.O0;
        if (f6Var != null) {
            f6Var.d(canvas);
        }
    }
}
