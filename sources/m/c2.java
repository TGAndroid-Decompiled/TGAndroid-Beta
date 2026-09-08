package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.xy;
public final class c2 implements View.OnTouchListener {
    public final int f15512a;
    public final Object f15513b;

    public c2(Object obj, int i10) {
        this.f15512a = i10;
        this.f15513b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15512a) {
            case 0:
                d2 d2Var = (d2) this.f15513b;
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
                ky kyVar = (ky) this.f15513b;
                if (motionEvent.getAction() == 0) {
                    kyVar.F.f27968f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    kyVar.F.f27968f = false;
                }
                return false;
            case 2:
                xy xyVar = (xy) this.f15513b;
                if (motionEvent.getAction() == 0) {
                    xyVar.G.f27968f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    xyVar.G.f27968f = false;
                }
                return false;
            default:
                fz fzVar = (fz) this.f15513b;
                if (motionEvent.getAction() == 0) {
                    fzVar.Q.f27968f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    fzVar.Q.f27968f = false;
                }
                return false;
        }
    }
}
