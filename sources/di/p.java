package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.xd;
public final class p extends vb0 {
    public final int M;
    public final Object N;

    public p(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 0:
                t tVar = (t) this.N;
                q qVar = tVar.f9731a0;
                if (qVar != null && !qVar.isFocusable()) {
                    tVar.f9731a0.setFocusable(true);
                    tVar.f9731a0.setFocusableInTouchMode(true);
                    int A1 = tVar.f9737e.A1(1);
                    if (A1 >= 0 && A1 < tVar.f9737e.f35323g3.E.size()) {
                        tVar.f9737e.C0();
                        tVar.f9737e.y0(A1);
                    }
                    tVar.f9731a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                xd xdVar = (xd) this.N;
                g51 g51Var = xdVar.Y0;
                q qVar2 = xdVar.P0;
                if (qVar2 != null && !qVar2.isFocusable()) {
                    qVar2.setFocusable(true);
                    qVar2.setFocusableInTouchMode(true);
                    int A12 = g51Var.A1(3);
                    if (A12 >= 0 && A12 < g51Var.f35323g3.E.size()) {
                        g51Var.C0();
                        g51Var.y0(A12);
                    }
                    qVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
