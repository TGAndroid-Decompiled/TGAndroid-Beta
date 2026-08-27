package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.c6;

public final class x3 extends org.telegram.ui.web.z0 {
    public final e4 L0;

    public x3(e4 e4Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = e4Var;
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.F.setWebView(w0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e4 e4Var = this.L0;
            if (!e4Var.L) {
                e4Var.L = true;
                e4Var.f18669n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
