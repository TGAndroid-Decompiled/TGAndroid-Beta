package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.vd0;
public final class s extends vd0 {
    public final int L;
    public final Object M;

    public s(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                x xVar = (x) this.M;
                t tVar = xVar.Q;
                if (tVar != null && !tVar.isFocusable()) {
                    xVar.Q.setFocusable(true);
                    xVar.Q.setFocusableInTouchMode(true);
                    int D1 = xVar.e.D1(1);
                    if (D1 >= 0 && D1 < xVar.e.Z2.f24976y.size()) {
                        xVar.e.B0();
                        xVar.e.x0(D1);
                    }
                    xVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) this.M;
                j71 j71Var = ieVar.f38154a1;
                t tVar2 = ieVar.Y0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int D12 = j71Var.D1(3);
                    if (D12 >= 0 && D12 < j71Var.Z2.f24976y.size()) {
                        j71Var.B0();
                        j71Var.x0(D12);
                    }
                    tVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
