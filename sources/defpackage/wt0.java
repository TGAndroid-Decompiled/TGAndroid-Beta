package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class wt0 extends gt7 {
    public final byte M;
    public final Object N;

    public wt0(byte b, Context context, Object obj) {
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
                au0 au0Var = (au0) obj;
                vc vcVar = au0Var.a0;
                if (vcVar != null && !vcVar.isFocusable()) {
                    au0Var.a0.setFocusable(true);
                    au0Var.a0.setFocusableInTouchMode(true);
                    int A1 = au0Var.e.A1(1);
                    if (A1 >= 0 && A1 < au0Var.e.g3.E.size()) {
                        au0Var.e.D0();
                        au0Var.e.z0(A1);
                    }
                    au0Var.a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                ik1 ik1Var = (ik1) obj;
                q7c q7cVar = ik1Var.X0;
                vc vcVar2 = ik1Var.O0;
                if (vcVar2 != null && !vcVar2.isFocusable()) {
                    vcVar2.setFocusable(true);
                    vcVar2.setFocusableInTouchMode(true);
                    int A12 = q7cVar.A1(3);
                    if (A12 >= 0 && A12 < q7cVar.g3.E.size()) {
                        q7cVar.D0();
                        q7cVar.z0(A12);
                    }
                    vcVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
