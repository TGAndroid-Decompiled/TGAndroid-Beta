package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.sx;
public final class c2 implements View.OnTouchListener {
    public final int f20053a;
    public final Object f20054b;

    public c2(Object obj, int i7) {
        this.f20053a = i7;
        this.f20054b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f20053a) {
            case 0:
                d2 d2Var = (d2) this.f20054b;
                a2 a2Var = d2Var.H;
                Handler handler = d2Var.L;
                x xVar = d2Var.P;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y10 >= 0 && y10 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                sx sxVar = (sx) this.f20054b;
                if (motionEvent.getAction() == 0) {
                    sxVar.G.f40104f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    sxVar.G.f40104f = false;
                }
                return false;
            case 2:
                gy gyVar = (gy) this.f20054b;
                if (motionEvent.getAction() == 0) {
                    gyVar.H.f40104f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gyVar.H.f40104f = false;
                }
                return false;
            default:
                oy oyVar = (oy) this.f20054b;
                if (motionEvent.getAction() == 0) {
                    oyVar.R.f40104f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    oyVar.R.f40104f = false;
                }
                return false;
        }
    }
}
