package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.b6;
public final class z3 extends org.telegram.ui.web.y0 {
    public final g4 L0;

    public z3(g4 g4Var, Context context, b6 b6Var, int i9) {
        super(i9, context, b6Var, true);
        this.L0 = g4Var;
    }

    @Override
    public final void G(org.telegram.ui.web.v0 v0Var) {
        this.L0.F.setWebView(v0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g4 g4Var = this.L0;
            if (!g4Var.L) {
                g4Var.L = true;
                g4Var.f17861n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
