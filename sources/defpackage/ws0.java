package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ws0 extends lu7 {
    public final byte M;
    public final Object N;

    public ws0(byte b, Context context, Object obj) {
        super(context, null);
        this.M = b;
        this.N = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.M;
        Object obj = this.N;
        switch (b) {
            case 0:
                at0 at0Var = (at0) obj;
                xs0 xs0Var = at0Var.a0;
                if (xs0Var != null && !xs0Var.isFocusable()) {
                    at0Var.a0.setFocusable(true);
                    at0Var.a0.setFocusableInTouchMode(true);
                    int B1 = at0Var.e.B1(1);
                    if (B1 >= 0 && B1 < at0Var.e.g3.E.size()) {
                        at0Var.e.E0();
                        at0Var.e.A0(B1);
                    }
                    at0Var.a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                ij1 ij1Var = (ij1) obj;
                q9c q9cVar = ij1Var.X0;
                xs0 xs0Var2 = ij1Var.O0;
                if (xs0Var2 != null && !xs0Var2.isFocusable()) {
                    xs0Var2.setFocusable(true);
                    xs0Var2.setFocusableInTouchMode(true);
                    int B12 = q9cVar.B1(3);
                    if (B12 >= 0 && B12 < q9cVar.g3.E.size()) {
                        q9cVar.E0();
                        q9cVar.A0(B12);
                    }
                    xs0Var2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
