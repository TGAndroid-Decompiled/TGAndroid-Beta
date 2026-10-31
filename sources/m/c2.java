package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ux;
public final class c2 implements View.OnTouchListener {
    public final int f12379a;
    public final Object f12380b;

    public c2(Object obj, int i10) {
        this.f12379a = i10;
        this.f12380b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f12379a) {
            case 0:
                d2 d2Var = (d2) this.f12380b;
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
                ux uxVar = (ux) this.f12380b;
                if (motionEvent.getAction() == 0) {
                    uxVar.F.f31873f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    uxVar.F.f31873f = false;
                }
                return false;
            case 2:
                iy iyVar = (iy) this.f12380b;
                if (motionEvent.getAction() == 0) {
                    iyVar.G.f31873f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    iyVar.G.f31873f = false;
                }
                return false;
            default:
                qy qyVar = (qy) this.f12380b;
                if (motionEvent.getAction() == 0) {
                    qyVar.Q.f31873f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    qyVar.Q.f31873f = false;
                }
                return false;
        }
    }
}
