package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.wz;
public final class c2 implements View.OnTouchListener {
    public final int f15642a;
    public final Object f15643b;

    public c2(Object obj, int i10) {
        this.f15642a = i10;
        this.f15643b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15642a) {
            case 0:
                d2 d2Var = (d2) this.f15643b;
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
                az azVar = (az) this.f15643b;
                if (motionEvent.getAction() == 0) {
                    azVar.F.f24698f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    azVar.F.f24698f = false;
                }
                return false;
            case 2:
                nz nzVar = (nz) this.f15643b;
                if (motionEvent.getAction() == 0) {
                    nzVar.G.f24698f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    nzVar.G.f24698f = false;
                }
                return false;
            default:
                wz wzVar = (wz) this.f15643b;
                if (motionEvent.getAction() == 0) {
                    wzVar.Q.f24698f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    wzVar.Q.f24698f = false;
                }
                return false;
        }
    }
}
