package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class q43 extends ImageView {
    public final byte a = 0;
    public Object b;
    public final ViewGroup c;

    public q43(s43 s43Var, Context context, gi3 gi3Var) {
        super(context);
        this.c = s43Var;
        this.b = gi3Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                s43 s43Var = (s43) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (s43Var.n || s43Var.f)) {
                    s43Var.n = false;
                    s43Var.f = false;
                    removeCallbacks(s43Var.r);
                    removeCallbacks(s43Var.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((gi3) this.b).a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public q43(t09 t09Var, Context context) {
        super(context);
        this.c = t09Var;
    }
}
