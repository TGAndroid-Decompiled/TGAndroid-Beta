package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
public final class k4 extends org.telegram.ui.web.d1 {
    public final r4 S0;

    public k4(r4 r4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = r4Var;
    }

    @Override
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.J.setWebView(z0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r4 r4Var = this.S0;
            if (!r4Var.P) {
                r4Var.P = true;
                r4Var.f9930n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
