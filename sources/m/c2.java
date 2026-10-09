package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.zy;
public final class c2 implements View.OnTouchListener {
    public final int f15638a;
    public final Object f15639b;

    public c2(Object obj, int i10) {
        this.f15638a = i10;
        this.f15639b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15638a) {
            case 0:
                d2 d2Var = (d2) this.f15639b;
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
                zy zyVar = (zy) this.f15639b;
                if (motionEvent.getAction() == 0) {
                    zyVar.F.f24410f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    zyVar.F.f24410f = false;
                }
                return false;
            case 2:
                mz mzVar = (mz) this.f15639b;
                if (motionEvent.getAction() == 0) {
                    mzVar.G.f24410f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    mzVar.G.f24410f = false;
                }
                return false;
            default:
                vz vzVar = (vz) this.f15639b;
                if (motionEvent.getAction() == 0) {
                    vzVar.Q.f24410f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    vzVar.Q.f24410f = false;
                }
                return false;
        }
    }
}
