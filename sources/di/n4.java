package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
public final class n4 extends org.telegram.ui.web.c1 {
    public final u4 S0;

    public n4(u4 u4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = u4Var;
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.J.setWebView(y0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u4 u4Var = this.S0;
            if (!u4Var.P) {
                u4Var.P = true;
                u4Var.f6947n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
