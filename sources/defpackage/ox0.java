package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class ox0 extends qw0 {
    public final byte U0;
    public final Object V0;

    public ox0(Object obj, Context context, ylb ylbVar, int i, byte b) {
        super(i, ylbVar, context, true);
        this.U0 = b;
        this.V0 = obj;
    }

    @Override
    public final void B(boolean z, String str) {
        String r;
        boolean z2;
        switch (this.U0) {
            case 0:
                wx0 wx0Var = (wx0) this.V0;
                Paint paint = wx0Var.R;
                if (z) {
                    wx0Var.j();
                    cx cxVar = wx0Var.Z0;
                    if (wx0Var.o()) {
                        r = wx0Var.x0.e;
                    } else {
                        r = m9c.r(oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J)));
                    }
                    cxVar.a(r, str);
                    cx cxVar2 = wx0Var.Z0;
                    if (gm.B(paint.getColor()) <= 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cxVar2.b(z2, false);
                    wx0Var.Z0.setBackgroundColor(paint.getColor());
                    wx0Var.Y0 = str;
                }
                cx cxVar3 = wx0Var.Z0;
                wx0Var.X0 = z;
                gm.T3(cxVar3, z, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void H(mw0 mw0Var) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                wx0 wx0Var = (wx0) obj;
                wx0Var.x.setWebView(mw0Var);
                ws0 ws0Var = wx0Var.D0;
                if (ws0Var != null) {
                    ws0Var.k = mw0Var;
                }
                wx0Var.o0.setWebView(mw0Var);
                wx0Var.K();
                return;
            default:
                ((e32) obj).K.setWebView(mw0Var);
                return;
        }
    }

    @Override
    public final void I(mw0 mw0Var) {
        switch (this.U0) {
            case 0:
                wx0 wx0Var = (wx0) this.V0;
                ws0 ws0Var = wx0Var.D0;
                if (ws0Var != null && ws0Var.k == mw0Var) {
                    ws0Var.k = null;
                    ws0Var.b();
                }
                wx0Var.o0.setWebView(null);
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
                    e32 e32Var = (e32) this.V0;
                    if (!e32Var.Q) {
                        e32Var.Q = true;
                        e32Var.n.O();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
