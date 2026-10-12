package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yz;
public final class d2 implements View.OnTouchListener {
    public final int f15402a;
    public final Object f15403b;

    public d2(Object obj, int i10) {
        this.f15402a = i10;
        this.f15403b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15402a) {
            case 0:
                e2 e2Var = (e2) this.f15403b;
                b2 b2Var = e2Var.G;
                Handler handler = e2Var.K;
                x xVar = e2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y3 >= 0 && y3 < xVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                cz czVar = (cz) this.f15403b;
                if (motionEvent.getAction() == 0) {
                    czVar.F.f25089f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    czVar.F.f25089f = false;
                }
                return false;
            case 2:
                pz pzVar = (pz) this.f15403b;
                if (motionEvent.getAction() == 0) {
                    pzVar.G.f25089f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    pzVar.G.f25089f = false;
                }
                return false;
            default:
                yz yzVar = (yz) this.f15403b;
                if (motionEvent.getAction() == 0) {
                    yzVar.Q.f25089f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    yzVar.Q.f25089f = false;
                }
                return false;
        }
    }
}
