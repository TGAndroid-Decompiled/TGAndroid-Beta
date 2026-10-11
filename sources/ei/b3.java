package ei;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.d6;
public final class b3 extends org.telegram.ui.web.b1 {
    public final int S0;
    public final Object T0;

    public b3(int i10, int i11, Context context, Object obj, d6 d6Var) {
        super(i10, context, d6Var, true);
        this.S0 = i11;
        this.T0 = obj;
    }

    @Override
    public void D(boolean z10, String str) {
        String userName;
        boolean z11;
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                Paint paint = k3Var.P;
                if (z10) {
                    k3Var.i();
                    org.telegram.ui.c3 c3Var = k3Var.U0;
                    if (k3Var.m()) {
                        userName = k3Var.f9179v0.f9038e;
                    } else {
                        userName = UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                    }
                    c3Var.a(userName, str);
                    org.telegram.ui.c3 c3Var2 = k3Var.U0;
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c3Var2.b(z11, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                    k3Var.T0 = str;
                }
                org.telegram.ui.c3 c3Var3 = k3Var.U0;
                k3Var.S0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(c3Var3, z10, 1.0f, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                k3Var.v.setWebView(y0Var);
                a1 a1Var = k3Var.B0;
                if (a1Var != null) {
                    a1Var.f8929k = y0Var;
                }
                k3Var.m0.setWebView(y0Var);
                k3Var.G();
                return;
            default:
                ((p4) this.T0).J.setWebView(y0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.y0 y0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                a1 a1Var = k3Var.B0;
                if (a1Var != null && a1Var.f8929k == y0Var) {
                    a1Var.f8929k = null;
                    a1Var.b();
                }
                k3Var.m0.setWebView(null);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.S0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    p4 p4Var = (p4) this.T0;
                    if (!p4Var.P) {
                        p4Var.P = true;
                        p4Var.f9291n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
