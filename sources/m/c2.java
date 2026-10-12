package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vy;
public final class c2 implements View.OnTouchListener {
    public final int f15074a;
    public final Object f15075b;

    public c2(Object obj, int i10) {
        this.f15074a = i10;
        this.f15075b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15074a) {
            case 0:
                d2 d2Var = (d2) this.f15075b;
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
                vy vyVar = (vy) this.f15075b;
                if (motionEvent.getAction() == 0) {
                    vyVar.F.f31022f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    vyVar.F.f31022f = false;
                }
                return false;
            case 2:
                iz izVar = (iz) this.f15075b;
                if (motionEvent.getAction() == 0) {
                    izVar.G.f31022f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    izVar.G.f31022f = false;
                }
                return false;
            default:
                rz rzVar = (rz) this.f15075b;
                if (motionEvent.getAction() == 0) {
                    rzVar.Q.f31022f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    rzVar.Q.f31022f = false;
                }
                return false;
        }
    }
}
