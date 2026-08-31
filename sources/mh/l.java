package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.i61;
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
                    int x12 = pVar.f14559e.x1(1);
                    if (x12 >= 0 && x12 < pVar.f14559e.V2.f32960x.size()) {
                        pVar.f14559e.B0();
                        pVar.f14559e.x0(x12);
                    }
                    pVar.N.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                ke keVar = (ke) this.J;
                i61 i61Var = keVar.X0;
                m mVar2 = keVar.V0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int x13 = i61Var.x1(3);
                    if (x13 >= 0 && x13 < i61Var.V2.f32960x.size()) {
                        i61Var.B0();
                        i61Var.x0(x13);
                    }
                    mVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
