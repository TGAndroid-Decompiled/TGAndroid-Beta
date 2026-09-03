package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.me;
public final class m extends bd0 {
    public final int I;
    public final Object J;

    public m(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 0:
                q qVar = (q) this.J;
                n nVar = qVar.N;
                if (nVar != null && !nVar.isFocusable()) {
                    qVar.N.setFocusable(true);
                    qVar.N.setFocusableInTouchMode(true);
                    int w12 = qVar.e.w1(1);
                    if (w12 >= 0 && w12 < qVar.e.V2.f30151x.size()) {
                        qVar.e.B0();
                        qVar.e.x0(w12);
                    }
                    qVar.N.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                me meVar = (me) this.J;
                g61 g61Var = meVar.X0;
                n nVar2 = meVar.V0;
                if (nVar2 != null && !nVar2.isFocusable()) {
                    nVar2.setFocusable(true);
                    nVar2.setFocusableInTouchMode(true);
                    int w13 = g61Var.w1(3);
                    if (w13 >= 0 && w13 < g61Var.V2.f30151x.size()) {
                        g61Var.B0();
                        g61Var.x0(w13);
                    }
                    nVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
