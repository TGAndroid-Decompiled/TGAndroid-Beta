package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.xd;
public final class r extends gb0 {
    public final int M;
    public final Object N;

    public r(int i3, Context context, Object obj) {
        super(context, null);
        this.M = i3;
        this.N = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 0:
                v vVar = (v) this.N;
                s sVar = vVar.f6131a0;
                if (sVar != null && !sVar.isFocusable()) {
                    vVar.f6131a0.setFocusable(true);
                    vVar.f6131a0.setFocusableInTouchMode(true);
                    int A1 = vVar.f6137e.A1(1);
                    if (A1 >= 0 && A1 < vVar.f6137e.f35594g3.E.size()) {
                        vVar.f6137e.C0();
                        vVar.f6137e.y0(A1);
                    }
                    vVar.f6131a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                xd xdVar = (xd) this.N;
                l41 l41Var = xdVar.Y0;
                s sVar2 = xdVar.P0;
                if (sVar2 != null && !sVar2.isFocusable()) {
                    sVar2.setFocusable(true);
                    sVar2.setFocusableInTouchMode(true);
                    int A12 = l41Var.A1(3);
                    if (A12 >= 0 && A12 < l41Var.f35594g3.E.size()) {
                        l41Var.C0();
                        l41Var.y0(A12);
                    }
                    sVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
