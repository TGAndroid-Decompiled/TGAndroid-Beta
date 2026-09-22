package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
public final class j4 extends org.telegram.ui.web.d1 {
    public final q4 S0;

    public j4(q4 q4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = q4Var;
    }

    @Override
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.J.setWebView(z0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q4 q4Var = this.S0;
            if (!q4Var.P) {
                q4Var.P = true;
                q4Var.f8569n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
