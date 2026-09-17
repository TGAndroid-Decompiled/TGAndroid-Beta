package fi;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;
public final class b3 extends org.telegram.ui.web.d1 {
    public final k3 S0;

    public b3(k3 k3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = k3Var;
    }

    @Override
    public final void E(String str, boolean z10) {
        boolean z11;
        k3 k3Var = this.S0;
        Paint paint = k3Var.P;
        if (z10) {
            k3Var.i();
            k3Var.U0.a(UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H))), str);
            org.telegram.ui.d3 d3Var = k3Var.U0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            d3Var.b(z11, false);
            k3Var.U0.setBackgroundColor(paint.getColor());
            k3Var.T0 = str;
        }
        org.telegram.ui.d3 d3Var2 = k3Var.U0;
        k3Var.S0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(d3Var2, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void K(org.telegram.ui.web.z0 z0Var) {
        k3 k3Var = this.S0;
        k3Var.v.setWebView(z0Var);
        a1 a1Var = k3Var.B0;
        if (a1Var != null) {
            a1Var.f9537k = z0Var;
        }
        k3Var.m0.setWebView(z0Var);
        k3Var.F();
    }

    @Override
    public final void L(org.telegram.ui.web.z0 z0Var) {
        k3 k3Var = this.S0;
        a1 a1Var = k3Var.B0;
        if (a1Var != null && a1Var.f9537k == z0Var) {
            a1Var.f9537k = null;
            a1Var.b();
        }
        k3Var.m0.setWebView(null);
    }
}
