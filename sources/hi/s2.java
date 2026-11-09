package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.g6;
public final class s2 extends org.telegram.ui.web.x0 {
    public final int T0;
    public final Object U0;

    public s2(Object obj, Context context, g6 g6Var, int i7, int i10) {
        super(i7, context, g6Var, true);
        this.T0 = i10;
        this.U0 = obj;
    }

    @Override
    public void E(boolean z9, String str) {
        String p10;
        boolean z10;
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                Paint paint = a3Var.Q;
                if (z9) {
                    a3Var.m();
                    org.telegram.ui.b3 b3Var = a3Var.Y0;
                    if (a3Var.q()) {
                        p10 = a3Var.f14540w0.f14892e;
                    } else {
                        p10 = t10.p(qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I)));
                    }
                    b3Var.a(p10, str);
                    org.telegram.ui.b3 b3Var2 = a3Var.Y0;
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b3Var2.b(z10, false);
                    a3Var.Y0.setBackgroundColor(paint.getColor());
                    a3Var.X0 = str;
                }
                org.telegram.ui.b3 b3Var3 = a3Var.Y0;
                a3Var.W0 = z9;
                org.telegram.messenger.g0.Z3(b3Var3, z9, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void K(org.telegram.ui.web.u0 u0Var) {
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                a3Var.f14541x.setWebView(u0Var);
                v0 v0Var = a3Var.C0;
                if (v0Var != null) {
                    v0Var.f14990k = u0Var;
                }
                a3Var.f14528n0.setWebView(u0Var);
                a3Var.K();
                return;
            default:
                ((c4) this.U0).J.setWebView(u0Var);
                return;
        }
    }

    @Override
    public void L(org.telegram.ui.web.u0 u0Var) {
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                v0 v0Var = a3Var.C0;
                if (v0Var != null && v0Var.f14990k == u0Var) {
                    v0Var.f14990k = null;
                    v0Var.b();
                }
                a3Var.f14528n0.setWebView(null);
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
                    c4 c4Var = (c4) this.U0;
                    if (!c4Var.P) {
                        c4Var.P = true;
                        c4Var.f14592n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
