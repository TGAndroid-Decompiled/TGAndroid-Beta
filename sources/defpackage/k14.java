package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
public final class k14 implements View.OnTouchListener {
    public final byte a;
    public final Object b;

    public k14(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o24 o24Var = ((o14) obj).G;
                if (motionEvent.getAction() == 0) {
                    o24Var.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    o24Var.f = false;
                }
                return false;
            case 1:
                o24 o24Var2 = ((c24) obj).H;
                if (motionEvent.getAction() == 0) {
                    o24Var2.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    o24Var2.f = false;
                }
                return false;
            case 2:
                o24 o24Var3 = ((j24) obj).R;
                if (motionEvent.getAction() == 0) {
                    o24Var3.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    o24Var3.f = false;
                }
                return false;
            default:
                s76 s76Var = (s76) obj;
                q76 q76Var = s76Var.H;
                Handler handler = s76Var.L;
                op opVar = s76Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && opVar != null && opVar.isShowing() && x >= 0 && x < opVar.getWidth() && y >= 0 && y < opVar.getHeight()) {
                    handler.postDelayed(q76Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(q76Var);
                }
                return false;
        }
    }
}
