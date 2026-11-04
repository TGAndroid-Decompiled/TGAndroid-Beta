package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.yx;
public final class c2 implements View.OnTouchListener {
    public final int f18549a;
    public final Object f18550b;

    public c2(Object obj, int i3) {
        this.f18549a = i3;
        this.f18550b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f18549a) {
            case 0:
                d2 d2Var = (d2) this.f18550b;
                a2 a2Var = d2Var.H;
                Handler handler = d2Var.L;
                x xVar = d2Var.P;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y9 >= 0 && y9 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                ex exVar = (ex) this.f18550b;
                if (motionEvent.getAction() == 0) {
                    exVar.G.f33535f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    exVar.G.f33535f = false;
                }
                return false;
            case 2:
                rx rxVar = (rx) this.f18550b;
                if (motionEvent.getAction() == 0) {
                    rxVar.H.f33535f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    rxVar.H.f33535f = false;
                }
                return false;
            default:
                yx yxVar = (yx) this.f18550b;
                if (motionEvent.getAction() == 0) {
                    yxVar.R.f33535f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    yxVar.R.f33535f = false;
                }
                return false;
        }
    }
}
