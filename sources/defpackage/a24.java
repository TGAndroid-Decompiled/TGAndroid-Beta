package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
public final class a24 implements View.OnTouchListener {
    public final byte a;
    public final Object b;

    public a24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                e34 e34Var = ((e24) obj).G;
                if (motionEvent.getAction() == 0) {
                    e34Var.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    e34Var.f = false;
                }
                return false;
            case 1:
                e34 e34Var2 = ((s24) obj).H;
                if (motionEvent.getAction() == 0) {
                    e34Var2.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    e34Var2.f = false;
                }
                return false;
            case 2:
                e34 e34Var3 = ((z24) obj).R;
                if (motionEvent.getAction() == 0) {
                    e34Var3.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    e34Var3.f = false;
                }
                return false;
            default:
                o76 o76Var = (o76) obj;
                m76 m76Var = o76Var.H;
                Handler handler = o76Var.L;
                nq nqVar = o76Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && nqVar != null && nqVar.isShowing() && x >= 0 && x < nqVar.getWidth() && y >= 0 && y < nqVar.getHeight()) {
                    handler.postDelayed(m76Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(m76Var);
                }
                return false;
        }
    }
}
