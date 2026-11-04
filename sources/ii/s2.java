package ii;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.ui.ActionBar.e6;
public final class s2 extends org.telegram.ui.web.w0 {
    public final int U0;
    public final Object V0;

    public s2(Object obj, Context context, e6 e6Var, int i3, int i10) {
        super(i3, context, e6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override
    public void D(boolean z10, String str) {
        String p10;
        boolean z11;
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                Paint paint = a3Var.R;
                if (z10) {
                    a3Var.m();
                    org.telegram.ui.c3 c3Var = a3Var.Z0;
                    if (a3Var.q()) {
                        p10 = a3Var.f14825x0.f15167e;
                    } else {
                        p10 = l10.p(hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J)));
                    }
                    c3Var.a(p10, str);
                    org.telegram.ui.c3 c3Var2 = a3Var.Z0;
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c3Var2.b(z11, false);
                    a3Var.Z0.setBackgroundColor(paint.getColor());
                    a3Var.Y0 = str;
                }
                org.telegram.ui.c3 c3Var3 = a3Var.Z0;
                a3Var.X0 = z10;
                org.telegram.messenger.g0.Z3(c3Var3, z10, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void J(org.telegram.ui.web.t0 t0Var) {
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                a3Var.f14824x.setWebView(t0Var);
                w0 w0Var = a3Var.D0;
                if (w0Var != null) {
                    w0Var.f15292k = t0Var;
                }
                a3Var.f14812o0.setWebView(t0Var);
                a3Var.K();
                return;
            default:
                ((d4) this.V0).K.setWebView(t0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.t0 t0Var) {
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                w0 w0Var = a3Var.D0;
                if (w0Var != null && w0Var.f15292k == t0Var) {
                    w0Var.f15292k = null;
                    w0Var.b();
                }
                a3Var.f14812o0.setWebView(null);
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
                    d4 d4Var = (d4) this.V0;
                    if (!d4Var.Q) {
                        d4Var.Q = true;
                        d4Var.f14898n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
