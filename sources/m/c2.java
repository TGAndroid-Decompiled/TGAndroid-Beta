package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.yy;
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
                ly lyVar = (ly) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    lyVar.F.f26244f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    lyVar.F.f26244f = false;
                }
                return false;
            case 2:
                yy yyVar = (yy) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    yyVar.G.f26244f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    yyVar.G.f26244f = false;
                }
                return false;
            default:
                gz gzVar = (gz) this.f14386b;
                if (motionEvent.getAction() == 0) {
                    gzVar.Q.f26244f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gzVar.Q.f26244f = false;
                }
                return false;
        }
    }
}
