package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vy;
public final class e2 implements View.OnTouchListener {
    public final int f14824a;
    public final Object f14825b;

    public e2(Object obj, int i10) {
        this.f14824a = i10;
        this.f14825b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f14824a) {
            case 0:
                f2 f2Var = (f2) this.f14825b;
                c2 c2Var = f2Var.G;
                Handler handler = f2Var.K;
                z zVar = f2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && zVar != null && zVar.isShowing() && x10 >= 0 && x10 < zVar.getWidth() && y3 >= 0 && y3 < zVar.getHeight()) {
                    handler.postDelayed(c2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(c2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                vy vyVar = (vy) this.f14825b;
                if (motionEvent.getAction() == 0) {
                    vyVar.F.f30715f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    vyVar.F.f30715f = false;
                }
                return false;
            case 2:
                iz izVar = (iz) this.f14825b;
                if (motionEvent.getAction() == 0) {
                    izVar.G.f30715f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    izVar.G.f30715f = false;
                }
                return false;
            default:
                rz rzVar = (rz) this.f14825b;
                if (motionEvent.getAction() == 0) {
                    rzVar.Q.f30715f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    rzVar.Q.f30715f = false;
                }
                return false;
        }
    }
}
