package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.yx;
public final class c2 implements View.OnTouchListener {
    public final int f19661a;
    public final Object f19662b;

    public c2(Object obj, int i7) {
        this.f19661a = i7;
        this.f19662b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f19661a) {
            case 0:
                d2 d2Var = (d2) this.f19662b;
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
                lx lxVar = (lx) this.f19662b;
                if (motionEvent.getAction() == 0) {
                    lxVar.G.f36946f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    lxVar.G.f36946f = false;
                }
                return false;
            case 2:
                yx yxVar = (yx) this.f19662b;
                if (motionEvent.getAction() == 0) {
                    yxVar.H.f36946f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    yxVar.H.f36946f = false;
                }
                return false;
            default:
                gy gyVar = (gy) this.f19662b;
                if (motionEvent.getAction() == 0) {
                    gyVar.R.f36946f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gyVar.R.f36946f = false;
                }
                return false;
        }
    }
}
