package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vx;
public final class d2 implements View.OnTouchListener {
    public final int f16915a;
    public final Object f16916b;

    public d2(Object obj, int i9) {
        this.f16915a = i9;
        this.f16916b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f16915a) {
            case 0:
                e2 e2Var = (e2) this.f16916b;
                b2 b2Var = e2Var.C;
                Handler handler = e2Var.G;
                y yVar = e2Var.K;
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
                vx vxVar = (vx) this.f16916b;
                if (motionEvent.getAction() == 0) {
                    vxVar.B.f34401f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    vxVar.B.f34401f = false;
                }
                return false;
            case 2:
                jy jyVar = (jy) this.f16916b;
                if (motionEvent.getAction() == 0) {
                    jyVar.C.f34401f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    jyVar.C.f34401f = false;
                }
                return false;
            default:
                ry ryVar = (ry) this.f16916b;
                if (motionEvent.getAction() == 0) {
                    ryVar.M.f34401f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ryVar.M.f34401f = false;
                }
                return false;
        }
    }
}
