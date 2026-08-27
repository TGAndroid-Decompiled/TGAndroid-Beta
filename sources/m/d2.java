package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.wx;

public final class d2 implements View.OnTouchListener {

    public final int f17290a;

    public final Object f17291b;

    public d2(Object obj, int i10) {
        this.f17290a = i10;
        this.f17291b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f17290a) {
            case 0:
                e2 e2Var = (e2) this.f17291b;
                b2 b2Var = e2Var.C;
                Handler handler = e2Var.G;
                y yVar = e2Var.K;
                int action = motionEvent.getAction();
                int x8 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x8 >= 0 && x8 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                }
                break;
            case 1:
                wx wxVar = (wx) this.f17291b;
                if (motionEvent.getAction() == 0) {
                    wxVar.B.f34994f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    wxVar.B.f34994f = false;
                }
                break;
            case 2:
                ky kyVar = (ky) this.f17291b;
                if (motionEvent.getAction() == 0) {
                    kyVar.C.f34994f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    kyVar.C.f34994f = false;
                }
                break;
            default:
                ty tyVar = (ty) this.f17291b;
                if (motionEvent.getAction() == 0) {
                    tyVar.M.f34994f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    tyVar.M.f34994f = false;
                }
                break;
        }
        return false;
    }
}
