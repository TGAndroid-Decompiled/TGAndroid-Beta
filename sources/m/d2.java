package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ry;
public final class d2 implements View.OnTouchListener {
    public final int f16514a;
    public final Object f16515b;

    public d2(Object obj, int i10) {
        this.f16514a = i10;
        this.f16515b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f16514a) {
            case 0:
                e2 e2Var = (e2) this.f16515b;
                b2 b2Var = e2Var.C;
                Handler handler = e2Var.G;
                y yVar = e2Var.K;
                int action = motionEvent.getAction();
                int x4 = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x4 >= 0 && x4 < yVar.getWidth() && y8 >= 0 && y8 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                ey eyVar = (ey) this.f16515b;
                if (motionEvent.getAction() == 0) {
                    eyVar.B.f28592f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    eyVar.B.f28592f = false;
                }
                return false;
            case 2:
                ry ryVar = (ry) this.f16515b;
                if (motionEvent.getAction() == 0) {
                    ryVar.C.f28592f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ryVar.C.f28592f = false;
                }
                return false;
            default:
                az azVar = (az) this.f16515b;
                if (motionEvent.getAction() == 0) {
                    azVar.M.f28592f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    azVar.M.f28592f = false;
                }
                return false;
        }
    }
}
