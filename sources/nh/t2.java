package nh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.c6;

public final class t2 extends org.telegram.ui.web.z0 {
    public final b3 L0;

    public t2(b3 b3Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = b3Var;
    }

    @Override
    public final void A(String str, boolean z10) {
        b3 b3Var = this.L0;
        Paint paint = b3Var.L;
        if (z10) {
            b3Var.i();
            b3Var.Q0.a(UserObject.getUserName(MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D))), str);
            b3Var.Q0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            b3Var.Q0.setBackgroundColor(paint.getColor());
            b3Var.P0 = str;
        }
        org.telegram.ui.h3 h3Var = b3Var.Q0;
        b3Var.O0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        b3 b3Var = this.L0;
        b3Var.v.setWebView(w0Var);
        x0 x0Var = b3Var.f18600x0;
        if (x0Var != null) {
            x0Var.f19034k = w0Var;
        }
        b3Var.f18581i0.setWebView(w0Var);
        b3Var.F();
    }

    @Override
    public final void H(org.telegram.ui.web.w0 w0Var) {
        b3 b3Var = this.L0;
        x0 x0Var = b3Var.f18600x0;
        if (x0Var != null && x0Var.f19034k == w0Var) {
            x0Var.f19034k = null;
            x0Var.b();
        }
        b3Var.f18581i0.setWebView(null);
    }
}
