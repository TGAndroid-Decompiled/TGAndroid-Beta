package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ft0;
public final class u0 extends View {
    public final ft0 f4806a;

    public u0(ft0 ft0Var, Context context) {
        super(context);
        this.f4806a = ft0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s0 s0Var = this.f4806a.T0;
        if (s0Var != null) {
            s0Var.d(canvas);
        }
    }
}
