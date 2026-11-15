package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.ui.ActionBar.e6;
public final class p2 extends org.telegram.ui.web.v0 {
    public final int U0;
    public final Object V0;

    public p2(Object obj, Context context, e6 e6Var, int i7, int i10) {
        super(i7, context, e6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override
    public void E(boolean z10, String str) {
        String p10;
        boolean z11;
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                Paint paint = x2Var.R;
                if (z10) {
                    x2Var.m();
                    org.telegram.ui.b3 b3Var = x2Var.Z0;
                    if (x2Var.q()) {
                        p10 = x2Var.f18684x0.f18407e;
                    } else {
                        p10 = q10.p(np.s1(x2Var.I).a2(Long.valueOf(x2Var.J)));
                    }
                    b3Var.a(p10, str);
                    org.telegram.ui.b3 b3Var2 = x2Var.Z0;
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b3Var2.b(z11, false);
                    x2Var.Z0.setBackgroundColor(paint.getColor());
                    x2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var3 = x2Var.Z0;
                x2Var.X0 = z10;
                org.telegram.messenger.g0.Y3(b3Var3, z10, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void K(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                x2Var.f18683x.setWebView(s0Var);
                w0 w0Var = x2Var.D0;
                if (w0Var != null) {
                    w0Var.f18622k = s0Var;
                }
                x2Var.f18671o0.setWebView(s0Var);
                x2Var.K();
                return;
            default:
                ((y3) this.V0).K.setWebView(s0Var);
                return;
        }
    }

    @Override
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                w0 w0Var = x2Var.D0;
                if (w0Var != null && w0Var.f18622k == s0Var) {
                    w0Var.f18622k = null;
                    w0Var.b();
                }
                x2Var.f18671o0.setWebView(null);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    y3 y3Var = (y3) this.V0;
                    if (!y3Var.Q) {
                        y3Var.Q = true;
                        y3Var.f18715n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
