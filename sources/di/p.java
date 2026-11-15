package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.xd;
public final class p extends mb0 {
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
                q qVar = tVar.f9412a0;
                if (qVar != null && !qVar.isFocusable()) {
                    tVar.f9412a0.setFocusable(true);
                    tVar.f9412a0.setFocusableInTouchMode(true);
                    int A1 = tVar.f9418e.A1(1);
                    if (A1 >= 0 && A1 < tVar.f9418e.f39895g3.E.size()) {
                        tVar.f9418e.C0();
                        tVar.f9418e.y0(A1);
                    }
                    tVar.f9412a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                xd xdVar = (xd) this.N;
                u41 u41Var = xdVar.Y0;
                q qVar2 = xdVar.P0;
                if (qVar2 != null && !qVar2.isFocusable()) {
                    qVar2.setFocusable(true);
                    qVar2.setFocusableInTouchMode(true);
                    int A12 = u41Var.A1(3);
                    if (A12 >= 0 && A12 < u41Var.f39895g3.E.size()) {
                        u41Var.C0();
                        u41Var.y0(A12);
                    }
                    qVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
