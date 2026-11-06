package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.p41;
public final class u extends lb0 {
    public final int L;
    public final Object M;

    public u(int i7, Context context, Object obj) {
        super(context, null);
        this.L = i7;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                z zVar = (z) this.M;
                v vVar = zVar.Z;
                if (vVar != null && !vVar.isFocusable()) {
                    zVar.Z.setFocusable(true);
                    zVar.Z.setFocusableInTouchMode(true);
                    int A1 = zVar.f5115e.A1(1);
                    if (A1 >= 0 && A1 < zVar.f5115e.f36781f3.D.size()) {
                        zVar.f5115e.C0();
                        zVar.f5115e.y0(A1);
                    }
                    zVar.Z.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) this.M;
                p41 p41Var = zdVar.X0;
                v vVar2 = zdVar.O0;
                if (vVar2 != null && !vVar2.isFocusable()) {
                    vVar2.setFocusable(true);
                    vVar2.setFocusableInTouchMode(true);
                    int A12 = p41Var.A1(3);
                    if (A12 >= 0 && A12 < p41Var.f36781f3.D.size()) {
                        p41Var.C0();
                        p41Var.y0(A12);
                    }
                    vVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
