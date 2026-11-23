package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.h6;
public final class k2 extends org.telegram.ui.web.v0 {
    public final int U0;
    public final Object V0;

    public k2(Object obj, Context context, h6 h6Var, int i7, int i10) {
        super(i7, context, h6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override
    public void E(boolean z10, String str) {
        String q10;
        boolean z11;
        switch (this.U0) {
            case 0:
                s2 s2Var = (s2) this.V0;
                Paint paint = s2Var.R;
                if (z10) {
                    s2Var.m();
                    org.telegram.ui.b3 b3Var = s2Var.Z0;
                    if (s2Var.q()) {
                        q10 = s2Var.f18929x0.f18645e;
                    } else {
                        q10 = p10.q(np.u1(s2Var.I).c2(Long.valueOf(s2Var.J)));
                    }
                    b3Var.a(q10, str);
                    org.telegram.ui.b3 b3Var2 = s2Var.Z0;
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b3Var2.b(z11, false);
                    s2Var.Z0.setBackgroundColor(paint.getColor());
                    s2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var3 = s2Var.Z0;
                s2Var.X0 = z10;
                org.telegram.messenger.g0.X3(b3Var3, z10, 1.0f, true, false);
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
                s2 s2Var = (s2) this.V0;
                s2Var.f18928x.setWebView(s0Var);
                v0 v0Var = s2Var.D0;
                if (v0Var != null) {
                    v0Var.f18990k = s0Var;
                }
                s2Var.f18916o0.setWebView(s0Var);
                s2Var.K();
                return;
            default:
                ((s3) this.V0).K.setWebView(s0Var);
                return;
        }
    }

    @Override
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                s2 s2Var = (s2) this.V0;
                v0 v0Var = s2Var.D0;
                if (v0Var != null && v0Var.f18990k == s0Var) {
                    v0Var.f18990k = null;
                    v0Var.b();
                }
                s2Var.f18916o0.setWebView(null);
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
                    s3 s3Var = (s3) this.V0;
                    if (!s3Var.Q) {
                        s3Var.Q = true;
                        s3Var.f18934n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
