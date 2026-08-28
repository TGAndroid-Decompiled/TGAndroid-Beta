package gh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.fe;
public final class n extends fc0 {
    public final int H;
    public final Object I;

    public n(Object obj, Context context, int i9) {
        super(context, null);
        this.H = i9;
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
                    int x12 = rVar.f8774e.x1(1);
                    if (x12 >= 0 && x12 < rVar.f8774e.U2.f35191x.size()) {
                        rVar.f8774e.B0();
                        rVar.f8774e.x0(x12);
                    }
                    rVar.M.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                fe feVar = (fe) this.I;
                i51 i51Var = feVar.W0;
                o oVar2 = feVar.U0;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    oVar2.setFocusable(true);
                    oVar2.setFocusableInTouchMode(true);
                    int x13 = i51Var.x1(3);
                    if (x13 >= 0 && x13 < i51Var.U2.f35191x.size()) {
                        i51Var.B0();
                        i51Var.x0(x13);
                    }
                    oVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
