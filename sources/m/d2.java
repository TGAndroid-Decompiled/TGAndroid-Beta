package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.wy;
public final class d2 implements View.OnTouchListener {
    public final int f13465a;
    public final Object f13466b;

    public d2(Object obj, int i10) {
        this.f13465a = i10;
        this.f13466b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13465a) {
            case 0:
                e2 e2Var = (e2) this.f13466b;
                b2 b2Var = e2Var.D;
                Handler handler = e2Var.H;
                x xVar = e2Var.L;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y10 >= 0 && y10 < xVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                jy jyVar = (jy) this.f13466b;
                if (motionEvent.getAction() == 0) {
                    jyVar.C.f26438f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    jyVar.C.f26438f = false;
                }
                return false;
            case 2:
                wy wyVar = (wy) this.f13466b;
                if (motionEvent.getAction() == 0) {
                    wyVar.D.f26438f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    wyVar.D.f26438f = false;
                }
                return false;
            default:
                fz fzVar = (fz) this.f13466b;
                if (motionEvent.getAction() == 0) {
                    fzVar.N.f26438f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    fzVar.N.f26438f = false;
                }
                return false;
        }
    }
}
