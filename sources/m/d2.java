package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.ux;
public final class d2 implements View.OnTouchListener {
    public final int f19079a;
    public final Object f19080b;

    public d2(Object obj, int i7) {
        this.f19079a = i7;
        this.f19080b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f19079a) {
            case 0:
                e2 e2Var = (e2) this.f19080b;
                b2 b2Var = e2Var.G;
                Handler handler = e2Var.K;
                y yVar = e2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x10 >= 0 && x10 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                hx hxVar = (hx) this.f19080b;
                if (motionEvent.getAction() == 0) {
                    hxVar.F.f34408f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hxVar.F.f34408f = false;
                }
                return false;
            case 2:
                ux uxVar = (ux) this.f19080b;
                if (motionEvent.getAction() == 0) {
                    uxVar.G.f34408f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    uxVar.G.f34408f = false;
                }
                return false;
            default:
                cy cyVar = (cy) this.f19080b;
                if (motionEvent.getAction() == 0) {
                    cyVar.Q.f34408f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    cyVar.Q.f34408f = false;
                }
                return false;
        }
    }
}
