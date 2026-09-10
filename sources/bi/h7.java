package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class h7 extends View {
    public final ad f2792a;

    public h7(ad adVar, Context context) {
        super(context);
        this.f2792a = adVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f7 f7Var = this.f2792a.O0;
        if (f7Var != null) {
            f7Var.d(canvas);
        }
    }
}
