package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.u6;
public final class e3 extends org.telegram.ui.web.a1 {
    public final int T0;
    public final Object U0;

    public e3(int i10, int i11, Context context, Object obj, u6 u6Var) {
        super(i10, context, u6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override
    public void D(boolean z10, String str) {
        String userName;
        boolean z11;
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                Paint paint = m3Var.Q;
                if (z10) {
                    m3Var.i();
                    org.telegram.ui.c3 c3Var = m3Var.Y0;
                    if (m3Var.m()) {
                        userName = m3Var.f13130w0.e;
                    } else {
                        userName = UserObject.getUserName(MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I)));
                    }
                    c3Var.a(userName, str);
                    org.telegram.ui.c3 c3Var2 = m3Var.Y0;
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c3Var2.b(z11, false);
                    m3Var.Y0.setBackgroundColor(paint.getColor());
                    m3Var.X0 = str;
                }
                org.telegram.ui.c3 c3Var3 = m3Var.Y0;
                m3Var.W0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(c3Var3, z10, 1.0f, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void J(org.telegram.ui.web.x0 x0Var) {
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                m3Var.f13129w.setWebView(x0Var);
                f1 f1Var = m3Var.C0;
                if (f1Var != null) {
                    f1Var.f12971k = x0Var;
                }
                m3Var.f13118n0.setWebView(x0Var);
                m3Var.G();
                return;
            default:
                ((o4) this.U0).J.setWebView(x0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.x0 x0Var) {
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                f1 f1Var = m3Var.C0;
                if (f1Var != null && f1Var.f12971k == x0Var) {
                    f1Var.f12971k = null;
                    f1Var.b();
                }
                m3Var.f13118n0.setWebView(null);
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
                    o4 o4Var = (o4) this.U0;
                    if (!o4Var.P) {
                        o4Var.P = true;
                        o4Var.f13180n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
