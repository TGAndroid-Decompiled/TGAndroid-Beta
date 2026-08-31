package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.yy;
public final class c2 implements View.OnTouchListener {
    public final int f13153a;
    public final Object f13154b;

    public c2(Object obj, int i10) {
        this.f13153a = i10;
        this.f13154b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13153a) {
            case 0:
                d2 d2Var = (d2) this.f13154b;
                a2 a2Var = d2Var.D;
                Handler handler = d2Var.H;
                x xVar = d2Var.L;
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
                ly lyVar = (ly) this.f13154b;
                if (motionEvent.getAction() == 0) {
                    lyVar.C.f29281f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    lyVar.C.f29281f = false;
                }
                return false;
            case 2:
                yy yyVar = (yy) this.f13154b;
                if (motionEvent.getAction() == 0) {
                    yyVar.D.f29281f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    yyVar.D.f29281f = false;
                }
                return false;
            default:
                hz hzVar = (hz) this.f13154b;
                if (motionEvent.getAction() == 0) {
                    hzVar.N.f29281f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hzVar.N.f29281f = false;
                }
                return false;
        }
    }
}
