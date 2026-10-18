package gi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.d6;
public final class v2 extends org.telegram.ui.web.b1 {
    public final int S0;
    public final Object T0;

    public v2(int i10, int i11, Context context, Object obj, d6 d6Var) {
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
                d3 d3Var = (d3) this.T0;
                Paint paint = d3Var.P;
                if (z10) {
                    d3Var.i();
                    org.telegram.ui.f3 f3Var = d3Var.U0;
                    if (d3Var.m()) {
                        userName = d3Var.f11162v0.e;
                    } else {
                        userName = UserObject.getUserName(MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H)));
                    }
                    f3Var.a(userName, str);
                    org.telegram.ui.f3 f3Var2 = d3Var.U0;
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f3Var2.b(z11, false);
                    d3Var.U0.setBackgroundColor(paint.getColor());
                    d3Var.T0 = str;
                }
                org.telegram.ui.f3 f3Var3 = d3Var.U0;
                d3Var.S0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(f3Var3, z10, 1.0f, false);
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
                d3 d3Var = (d3) this.T0;
                d3Var.v.setWebView(y0Var);
                y0 y0Var2 = d3Var.B0;
                if (y0Var2 != null) {
                    y0Var2.f11556k = y0Var;
                }
                d3Var.m0.setWebView(y0Var);
                d3Var.G();
                return;
            default:
                ((f4) this.T0).J.setWebView(y0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.y0 y0Var) {
        switch (this.S0) {
            case 0:
                d3 d3Var = (d3) this.T0;
                y0 y0Var2 = d3Var.B0;
                if (y0Var2 != null && y0Var2.f11556k == y0Var) {
                    y0Var2.f11556k = null;
                    y0Var2.b();
                }
                d3Var.m0.setWebView(null);
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
                    f4 f4Var = (f4) this.T0;
                    if (!f4Var.P) {
                        f4Var.P = true;
                        f4Var.f11209n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
