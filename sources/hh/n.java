package hh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.fe;

public final class n extends jc0 {
    public final int H;
    public final Object I;

    public n(Object obj, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 0:
                r rVar = (r) this.I;
                o oVar = rVar.M;
                if (oVar != null && !oVar.isFocusable()) {
                    rVar.M.setFocusable(true);
                    rVar.M.setFocusableInTouchMode(true);
                    int iX1 = rVar.f9956e.x1(1);
                    if (iX1 >= 0 && iX1 < rVar.f9956e.U2.f26945x.size()) {
                        rVar.f9956e.B0();
                        rVar.f9956e.x0(iX1);
                    }
                    rVar.M.requestFocus();
                }
                break;
            default:
                fe feVar = (fe) this.I;
                k51 k51Var = feVar.W0;
                o oVar2 = feVar.U0;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    oVar2.setFocusable(true);
                    oVar2.setFocusableInTouchMode(true);
                    int iX2 = k51Var.x1(3);
                    if (iX2 >= 0 && iX2 < k51Var.U2.f26945x.size()) {
                        k51Var.B0();
                        k51Var.x0(iX2);
                    }
                    oVar2.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
