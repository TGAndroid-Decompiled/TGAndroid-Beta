package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.ke;
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
                y yVar = (y) this.M;
                t tVar = yVar.Z;
                if (tVar != null && !tVar.isFocusable()) {
                    yVar.Z.setFocusable(true);
                    yVar.Z.setFocusableInTouchMode(true);
                    int D1 = yVar.e.D1(1);
                    if (D1 >= 0 && D1 < yVar.e.f32504g3.f29882y.size()) {
                        yVar.e.C0();
                        yVar.e.y0(D1);
                    }
                    yVar.Z.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                ke keVar = (ke) this.M;
                s71 s71Var = keVar.X0;
                t tVar2 = keVar.O0;
                if (tVar2 != null && !tVar2.isFocusable()) {
                    tVar2.setFocusable(true);
                    tVar2.setFocusableInTouchMode(true);
                    int D12 = s71Var.D1(3);
                    if (D12 >= 0 && D12 < s71Var.f32504g3.f29882y.size()) {
                        s71Var.C0();
                        s71Var.y0(D12);
                    }
                    tVar2.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
