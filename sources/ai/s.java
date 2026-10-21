package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.sd0;
public final class s extends sd0 {
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
                    int y12 = xVar.e.y1(1);
                    if (y12 >= 0 && y12 < xVar.e.W2.f30864x.size()) {
                        xVar.e.B0();
                        xVar.e.x0(y12);
                    }
                    xVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) this.M;
                c71 c71Var = ieVar.f37931a1;
                t tVar2 = ieVar.Y0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int y13 = c71Var.y1(3);
                    if (y13 >= 0 && y13 < c71Var.W2.f30864x.size()) {
                        c71Var.B0();
                        c71Var.x0(y13);
                    }
                    tVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
