package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;
public final class k2 extends org.telegram.ui.web.v0 {
    public final int U0;
    public final Object V0;

    public k2(Object obj, Context context, i6 i6Var, int i7, int i10) {
        super(i7, context, i6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override
    public void E(boolean z10, String str) {
        String q10;
        boolean z11;
        switch (this.U0) {
            case 0:
                t2 t2Var = (t2) this.V0;
                Paint paint = t2Var.R;
                if (z10) {
                    t2Var.m();
                    org.telegram.ui.b3 b3Var = t2Var.Z0;
                    if (t2Var.q()) {
                        q10 = t2Var.f19048x0.f18770e;
                    } else {
                        q10 = n10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                    }
                    b3Var.a(q10, str);
                    org.telegram.ui.b3 b3Var2 = t2Var.Z0;
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b3Var2.b(z11, false);
                    t2Var.Z0.setBackgroundColor(paint.getColor());
                    t2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var3 = t2Var.Z0;
                t2Var.X0 = z10;
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
                t2 t2Var = (t2) this.V0;
                t2Var.f19047x.setWebView(s0Var);
                v0 v0Var = t2Var.D0;
                if (v0Var != null) {
                    v0Var.f19087k = s0Var;
                }
                t2Var.f19035o0.setWebView(s0Var);
                t2Var.K();
                return;
            default:
                ((t3) this.V0).K.setWebView(s0Var);
                return;
        }
    }

    @Override
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                t2 t2Var = (t2) this.V0;
                v0 v0Var = t2Var.D0;
                if (v0Var != null && v0Var.f19087k == s0Var) {
                    v0Var.f19087k = null;
                    v0Var.b();
                }
                t2Var.f19035o0.setWebView(null);
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
                    t3 t3Var = (t3) this.V0;
                    if (!t3Var.Q) {
                        t3Var.Q = true;
                        t3Var.f19053n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
