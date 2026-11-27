package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class pw0 extends rv0 {
    public final byte U0;
    public final Object V0;

    public pw0(Object obj, Context context, vnb vnbVar, int i, byte b) {
        super(i, vnbVar, context, true);
        this.U0 = b;
        this.V0 = obj;
    }

    @Override
    public final void B(boolean z, String str) {
        String r;
        boolean z2;
        switch (this.U0) {
            case 0:
                xw0 xw0Var = (xw0) this.V0;
                Paint paint = xw0Var.R;
                if (z) {
                    xw0Var.j();
                    dw dwVar = xw0Var.Z0;
                    if (xw0Var.o()) {
                        r = xw0Var.x0.e;
                    } else {
                        r = lbc.r(uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J)));
                    }
                    dwVar.a(r, str);
                    dw dwVar2 = xw0Var.Z0;
                    if (hl.B(paint.getColor()) <= 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dwVar2.b(z2, false);
                    xw0Var.Z0.setBackgroundColor(paint.getColor());
                    xw0Var.Y0 = str;
                }
                dw dwVar3 = xw0Var.Z0;
                xw0Var.X0 = z;
                hl.T3(dwVar3, z, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void H(nv0 nv0Var) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                xw0 xw0Var = (xw0) obj;
                xw0Var.x.setWebView(nv0Var);
                wr0 wr0Var = xw0Var.D0;
                if (wr0Var != null) {
                    wr0Var.k = nv0Var;
                }
                xw0Var.o0.setWebView(nv0Var);
                xw0Var.K();
                return;
            default:
                ((j22) obj).K.setWebView(nv0Var);
                return;
        }
    }

    @Override
    public final void I(nv0 nv0Var) {
        switch (this.U0) {
            case 0:
                xw0 xw0Var = (xw0) this.V0;
                wr0 wr0Var = xw0Var.D0;
                if (wr0Var != null && wr0Var.k == nv0Var) {
                    wr0Var.k = null;
                    wr0Var.b();
                }
                xw0Var.o0.setWebView(null);
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    j22 j22Var = (j22) this.V0;
                    if (!j22Var.Q) {
                        j22Var.Q = true;
                        j22Var.n.O();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
