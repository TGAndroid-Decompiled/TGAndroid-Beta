package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.tx;
public final class d2 implements View.OnTouchListener {
    public final int f19076a;
    public final Object f19077b;

    public d2(Object obj, int i7) {
        this.f19076a = i7;
        this.f19077b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f19076a) {
            case 0:
                e2 e2Var = (e2) this.f19077b;
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
                gx gxVar = (gx) this.f19077b;
                if (motionEvent.getAction() == 0) {
                    gxVar.F.f34084f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gxVar.F.f34084f = false;
                }
                return false;
            case 2:
                tx txVar = (tx) this.f19077b;
                if (motionEvent.getAction() == 0) {
                    txVar.G.f34084f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    txVar.G.f34084f = false;
                }
                return false;
            default:
                ay ayVar = (ay) this.f19077b;
                if (motionEvent.getAction() == 0) {
                    ayVar.Q.f34084f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ayVar.Q.f34084f = false;
                }
                return false;
        }
    }
}
