package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
public final class p04 implements View.OnTouchListener {
    public final byte a;
    public final Object b;

    public p04(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t14 t14Var = ((t04) obj).G;
                if (motionEvent.getAction() == 0) {
                    t14Var.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    t14Var.f = false;
                }
                return false;
            case 1:
                t14 t14Var2 = ((h14) obj).H;
                if (motionEvent.getAction() == 0) {
                    t14Var2.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    t14Var2.f = false;
                }
                return false;
            case 2:
                t14 t14Var3 = ((o14) obj).R;
                if (motionEvent.getAction() == 0) {
                    t14Var3.f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    t14Var3.f = false;
                }
                return false;
            default:
                o56 o56Var = (o56) obj;
                m56 m56Var = o56Var.H;
                Handler handler = o56Var.L;
                np npVar = o56Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && npVar != null && npVar.isShowing() && x >= 0 && x < npVar.getWidth() && y >= 0 && y < npVar.getHeight()) {
                    handler.postDelayed(m56Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(m56Var);
                }
                return false;
        }
    }
}
