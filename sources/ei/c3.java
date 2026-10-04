package ei;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.d6;
public final class c3 extends org.telegram.ui.web.c1 {
    public final l3 S0;

    public c3(l3 l3Var, Context context, d6 d6Var, int i10) {
        super(i10, context, d6Var, true);
        this.S0 = l3Var;
    }

    @Override
    public final void E(String str, boolean z10) {
        boolean z11;
        l3 l3Var = this.S0;
        Paint paint = l3Var.P;
        if (z10) {
            l3Var.i();
            l3Var.U0.a(UserObject.getUserName(MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H))), str);
            org.telegram.ui.d3 d3Var = l3Var.U0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            d3Var.b(z11, false);
            l3Var.U0.setBackgroundColor(paint.getColor());
            l3Var.T0 = str;
        }
        org.telegram.ui.d3 d3Var2 = l3Var.U0;
        l3Var.S0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(d3Var2, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void K(org.telegram.ui.web.z0 z0Var) {
        l3 l3Var = this.S0;
        l3Var.v.setWebView(z0Var);
        b1 b1Var = l3Var.B0;
        if (b1Var != null) {
            b1Var.f8931k = z0Var;
        }
        l3Var.m0.setWebView(z0Var);
        l3Var.F();
    }

    @Override
    public final void L(org.telegram.ui.web.z0 z0Var) {
        l3 l3Var = this.S0;
        b1 b1Var = l3Var.B0;
        if (b1Var != null && b1Var.f8931k == z0Var) {
            b1Var.f8931k = null;
            b1Var.b();
        }
        l3Var.m0.setWebView(null);
    }
}
