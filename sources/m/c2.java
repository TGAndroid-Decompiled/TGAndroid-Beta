package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.px;
public final class c2 implements View.OnTouchListener {
    public final int f20119a;
    public final Object f20120b;

    public c2(Object obj, int i7) {
        this.f20119a = i7;
        this.f20120b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f20119a) {
            case 0:
                d2 d2Var = (d2) this.f20120b;
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
                px pxVar = (px) this.f20120b;
                if (motionEvent.getAction() == 0) {
                    pxVar.G.f39052f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    pxVar.G.f39052f = false;
                }
                return false;
            case 2:
                dy dyVar = (dy) this.f20120b;
                if (motionEvent.getAction() == 0) {
                    dyVar.H.f39052f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    dyVar.H.f39052f = false;
                }
                return false;
            default:
                ly lyVar = (ly) this.f20120b;
                if (motionEvent.getAction() == 0) {
                    lyVar.R.f39052f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    lyVar.R.f39052f = false;
                }
                return false;
        }
    }
}
