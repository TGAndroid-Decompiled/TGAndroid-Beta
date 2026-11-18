package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.qx;
public final class c2 implements View.OnTouchListener {
    public final int f20028a;
    public final Object f20029b;

    public c2(Object obj, int i7) {
        this.f20028a = i7;
        this.f20029b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f20028a) {
            case 0:
                d2 d2Var = (d2) this.f20029b;
                a2 a2Var = d2Var.H;
                Handler handler = d2Var.L;
                x xVar = d2Var.P;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y10 >= 0 && y10 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                qx qxVar = (qx) this.f20029b;
                if (motionEvent.getAction() == 0) {
                    qxVar.G.f39350f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    qxVar.G.f39350f = false;
                }
                return false;
            case 2:
                ey eyVar = (ey) this.f20029b;
                if (motionEvent.getAction() == 0) {
                    eyVar.H.f39350f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    eyVar.H.f39350f = false;
                }
                return false;
            default:
                my myVar = (my) this.f20029b;
                if (motionEvent.getAction() == 0) {
                    myVar.R.f39350f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    myVar.R.f39350f = false;
                }
                return false;
        }
    }
}
