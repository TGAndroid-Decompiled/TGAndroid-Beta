package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class os0 extends er7 {
    public final byte M;
    public final Object N;

    public os0(byte b, Context context, Object obj) {
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
                ss0 ss0Var = (ss0) obj;
                ps0 ps0Var = ss0Var.a0;
                if (ps0Var != null && !ps0Var.isFocusable()) {
                    ss0Var.a0.setFocusable(true);
                    ss0Var.a0.setFocusableInTouchMode(true);
                    int A1 = ss0Var.e.A1(1);
                    if (A1 >= 0 && A1 < ss0Var.e.g3.E.size()) {
                        ss0Var.e.D0();
                        ss0Var.e.z0(A1);
                    }
                    ss0Var.a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                zi1 zi1Var = (zi1) obj;
                q5c q5cVar = zi1Var.X0;
                ps0 ps0Var2 = zi1Var.O0;
                if (ps0Var2 != null && !ps0Var2.isFocusable()) {
                    ps0Var2.setFocusable(true);
                    ps0Var2.setFocusableInTouchMode(true);
                    int A12 = q5cVar.A1(3);
                    if (A12 >= 0 && A12 < q5cVar.g3.E.size()) {
                        q5cVar.D0();
                        q5cVar.z0(A12);
                    }
                    ps0Var2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
