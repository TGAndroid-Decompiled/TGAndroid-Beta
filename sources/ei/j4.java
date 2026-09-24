package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d6;
public final class j4 extends org.telegram.ui.web.b1 {
    public final q4 S0;

    public j4(q4 q4Var, Context context, d6 d6Var, int i10) {
        super(i10, context, d6Var, true);
        this.S0 = q4Var;
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.J.setWebView(y0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q4 q4Var = this.S0;
            if (!q4Var.P) {
                q4Var.P = true;
                q4Var.f8552n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
