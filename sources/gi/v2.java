package gi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;
public final class v2 extends org.telegram.ui.web.b1 {
    public final int T0;
    public final Object U0;

    public v2(int i10, int i11, Context context, Object obj, g6 g6Var) {
        super(i10, context, g6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override
    public void D(boolean z10, String str) {
        String userName;
        boolean z11;
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                Paint paint = d3Var.Q;
                if (z10) {
                    d3Var.i();
                    org.telegram.ui.e3 e3Var = d3Var.Y0;
                    if (d3Var.m()) {
                        userName = d3Var.f11185w0.e;
                    } else {
                        userName = UserObject.getUserName(MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I)));
                    }
                    e3Var.a(userName, str);
                    org.telegram.ui.e3 e3Var2 = d3Var.Y0;
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e3Var2.b(z11, false);
                    d3Var.Y0.setBackgroundColor(paint.getColor());
                    d3Var.X0 = str;
                }
                org.telegram.ui.e3 e3Var3 = d3Var.Y0;
                d3Var.W0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(e3Var3, z10, 1.0f, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                d3Var.f11184w.setWebView(y0Var);
                y0 y0Var2 = d3Var.C0;
                if (y0Var2 != null) {
                    y0Var2.f11582k = y0Var;
                }
                d3Var.f11173n0.setWebView(y0Var);
                d3Var.G();
                return;
            default:
                ((f4) this.U0).J.setWebView(y0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.y0 y0Var) {
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                y0 y0Var2 = d3Var.C0;
                if (y0Var2 != null && y0Var2.f11582k == y0Var) {
                    y0Var2.f11582k = null;
                    y0Var2.b();
                }
                d3Var.f11173n0.setWebView(null);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    f4 f4Var = (f4) this.U0;
                    if (!f4Var.P) {
                        f4Var.P = true;
                        f4Var.f11230n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
