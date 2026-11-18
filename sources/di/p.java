package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.xd;
public final class p extends xb0 {
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
                q qVar = tVar.f9751a0;
                if (qVar != null && !qVar.isFocusable()) {
                    tVar.f9751a0.setFocusable(true);
                    tVar.f9751a0.setFocusableInTouchMode(true);
                    int A1 = tVar.f9757e.A1(1);
                    if (A1 >= 0 && A1 < tVar.f9757e.f34607g3.E.size()) {
                        tVar.f9757e.C0();
                        tVar.f9757e.y0(A1);
                    }
                    tVar.f9751a0.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                xd xdVar = (xd) this.N;
                e51 e51Var = xdVar.Y0;
                q qVar2 = xdVar.P0;
                if (qVar2 != null && !qVar2.isFocusable()) {
                    qVar2.setFocusable(true);
                    qVar2.setFocusableInTouchMode(true);
                    int A12 = e51Var.A1(3);
                    if (A12 >= 0 && A12 < e51Var.f34607g3.E.size()) {
                        e51Var.C0();
                        e51Var.y0(A12);
                    }
                    qVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
