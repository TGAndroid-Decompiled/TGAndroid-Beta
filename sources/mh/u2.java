package mh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.b6;
public final class u2 extends org.telegram.ui.web.y0 {
    public final c3 L0;

    public u2(c3 c3Var, Context context, b6 b6Var, int i9) {
        super(i9, context, b6Var, true);
        this.L0 = c3Var;
    }

    @Override
    public final void A(String str, boolean z10) {
        boolean z11;
        c3 c3Var = this.L0;
        Paint paint = c3Var.L;
        if (z10) {
            c3Var.i();
            c3Var.Q0.a(UserObject.getUserName(MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D))), str);
            org.telegram.ui.g3 g3Var = c3Var.Q0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            g3Var.b(z11, false);
            c3Var.Q0.setBackgroundColor(paint.getColor());
            c3Var.P0 = str;
        }
        org.telegram.ui.g3 g3Var2 = c3Var.Q0;
        c3Var.O0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(g3Var2, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void G(org.telegram.ui.web.v0 v0Var) {
        c3 c3Var = this.L0;
        c3Var.v.setWebView(v0Var);
        y0 y0Var = c3Var.f17779x0;
        if (y0Var != null) {
            y0Var.f18219k = v0Var;
        }
        c3Var.f17760i0.setWebView(v0Var);
        c3Var.F();
    }

    @Override
    public final void H(org.telegram.ui.web.v0 v0Var) {
        c3 c3Var = this.L0;
        y0 y0Var = c3Var.f17779x0;
        if (y0Var != null && y0Var.f18219k == v0Var) {
            y0Var.f18219k = null;
            y0Var.b();
        }
        c3Var.f17760i0.setWebView(null);
    }
}
