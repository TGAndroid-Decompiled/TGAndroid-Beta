package jh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.de;
public final class l extends uc0 {
    public final int H;
    public final Object I;

    public l(Object obj, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 0:
                q qVar = (q) this.I;
                m mVar = qVar.M;
                if (mVar != null && !mVar.isFocusable()) {
                    qVar.M.setFocusable(true);
                    qVar.M.setFocusableInTouchMode(true);
                    int x12 = qVar.f12638e.x1(1);
                    if (x12 >= 0 && x12 < qVar.f12638e.U2.f29942x.size()) {
                        qVar.f12638e.B0();
                        qVar.f12638e.x0(x12);
                    }
                    qVar.M.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                de deVar = (de) this.I;
                u51 u51Var = deVar.W0;
                m mVar2 = deVar.U0;
                if (mVar2 != null && !mVar2.isFocusable()) {
                    mVar2.setFocusable(true);
                    mVar2.setFocusableInTouchMode(true);
                    int x13 = u51Var.x1(3);
                    if (x13 >= 0 && x13 < u51Var.U2.f29942x.size()) {
                        u51Var.B0();
                        u51Var.x0(x13);
                    }
                    mVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
