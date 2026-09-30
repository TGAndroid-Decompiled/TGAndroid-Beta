package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ny;
public final class c2 implements View.OnTouchListener {
    public final int f14401a;
    public final Object f14402b;

    public c2(Object obj, int i10) {
        this.f14401a = i10;
        this.f14402b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f14401a) {
            case 0:
                d2 d2Var = (d2) this.f14402b;
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
                ny nyVar = (ny) this.f14402b;
                if (motionEvent.getAction() == 0) {
                    nyVar.F.f26826f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    nyVar.F.f26826f = false;
                }
                return false;
            case 2:
                az azVar = (az) this.f14402b;
                if (motionEvent.getAction() == 0) {
                    azVar.G.f26826f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    azVar.G.f26826f = false;
                }
                return false;
            default:
                iz izVar = (iz) this.f14402b;
                if (motionEvent.getAction() == 0) {
                    izVar.Q.f26826f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    izVar.Q.f26826f = false;
                }
                return false;
        }
    }
}
