package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class gw0 extends hv0 {
    public final byte U0;
    public final Object V0;

    public gw0(Object obj, Context context, wjb wjbVar, int i, byte b) {
        super(i, wjbVar, context, true);
        this.U0 = b;
        this.V0 = obj;
    }

    @Override
    public final void B(boolean z, String str) {
        String r;
        boolean z2;
        switch (this.U0) {
            case 0:
                ow0 ow0Var = (ow0) this.V0;
                Paint paint = ow0Var.R;
                if (z) {
                    ow0Var.j();
                    cw cwVar = ow0Var.Z0;
                    if (ow0Var.o()) {
                        r = ow0Var.x0.e;
                    } else {
                        r = l7c.r(na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J)));
                    }
                    cwVar.a(r, str);
                    cw cwVar2 = ow0Var.Z0;
                    if (gl.B(paint.getColor()) <= 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cwVar2.b(z2, false);
                    ow0Var.Z0.setBackgroundColor(paint.getColor());
                    ow0Var.Y0 = str;
                }
                cw cwVar3 = ow0Var.Z0;
                ow0Var.X0 = z;
                gl.T3(cwVar3, z, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void H(cv0 cv0Var) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                ow0 ow0Var = (ow0) obj;
                ow0Var.x.setWebView(cv0Var);
                or0 or0Var = ow0Var.D0;
                if (or0Var != null) {
                    or0Var.k = cv0Var;
                }
                ow0Var.o0.setWebView(cv0Var);
                ow0Var.K();
                return;
            default:
                ((s12) obj).K.setWebView(cv0Var);
                return;
        }
    }

    @Override
    public final void I(cv0 cv0Var) {
        switch (this.U0) {
            case 0:
                ow0 ow0Var = (ow0) this.V0;
                or0 or0Var = ow0Var.D0;
                if (or0Var != null && or0Var.k == cv0Var) {
                    or0Var.k = null;
                    or0Var.b();
                }
                ow0Var.o0.setWebView(null);
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
                    s12 s12Var = (s12) this.V0;
                    if (!s12Var.Q) {
                        s12Var.Q = true;
                        s12Var.n.O();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
