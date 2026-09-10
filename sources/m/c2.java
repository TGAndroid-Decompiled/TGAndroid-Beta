package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ry;
public final class c2 implements View.OnTouchListener {
    public final int f12977a;
    public final Object f12978b;

    public c2(Object obj, int i10) {
        this.f12977a = i10;
        this.f12978b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f12977a) {
            case 0:
                d2 d2Var = (d2) this.f12978b;
                a2 a2Var = d2Var.G;
                Handler handler = d2Var.K;
                x xVar = d2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y3 >= 0 && y3 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                ry ryVar = (ry) this.f12978b;
                if (motionEvent.getAction() == 0) {
                    ryVar.F.f26813f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ryVar.F.f26813f = false;
                }
                return false;
            case 2:
                ez ezVar = (ez) this.f12978b;
                if (motionEvent.getAction() == 0) {
                    ezVar.G.f26813f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ezVar.G.f26813f = false;
                }
                return false;
            default:
                mz mzVar = (mz) this.f12978b;
                if (motionEvent.getAction() == 0) {
                    mzVar.Q.f26813f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    mzVar.Q.f26813f = false;
                }
                return false;
        }
    }
}
