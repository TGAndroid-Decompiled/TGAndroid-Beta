package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.zy;
public final class c2 implements View.OnTouchListener {
    public final int f14385a;
    public final Object f14386b;

    public c2(Object obj, int i10) {
        this.f14385a = i10;
        this.f14386b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f14385a) {
            case 0:
                d2 d2Var = (d2) this.f14386b;
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
                my myVar = (my) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    myVar.F.f26556f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    myVar.F.f26556f = false;
                }
                return false;
            case 2:
                zy zyVar = (zy) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    zyVar.G.f26556f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    zyVar.G.f26556f = false;
                }
                return false;
            default:
                hz hzVar = (hz) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    hzVar.Q.f26556f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hzVar.Q.f26556f = false;
                }
                return false;
        }
    }
}
