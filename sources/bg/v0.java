package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ws0;
public final class v0 extends View {
    public final ws0 f2576a;

    public v0(ws0 ws0Var, Context context) {
        super(context);
        this.f2576a = ws0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t0 t0Var = this.f2576a.S0;
        if (t0Var != null) {
            t0Var.d(canvas);
        }
    }
}
