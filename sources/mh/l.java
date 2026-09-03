package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.ke;
public final class l extends cd0 {
    public final int I;
    public final Object J;

    public l(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 0:
                p pVar = (p) this.J;
                m mVar = pVar.N;
                if (mVar != null && !mVar.isFocusable()) {
                    pVar.N.setFocusable(true);
                    pVar.N.setFocusableInTouchMode(true);
                    int w12 = pVar.f14561e.w1(1);
                    if (w12 >= 0 && w12 < pVar.f14561e.V2.f32654x.size()) {
                        pVar.f14561e.B0();
                        pVar.f14561e.x0(w12);
                    }
                    pVar.N.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                ke keVar = (ke) this.J;
                h61 h61Var = keVar.X0;
                m mVar2 = keVar.V0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int w13 = h61Var.w1(3);
                    if (w13 >= 0 && w13 < h61Var.V2.f32654x.size()) {
                        h61Var.B0();
                        h61Var.x0(w13);
                    }
                    mVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
