package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class b63 extends ImageView {
    public final byte a = 0;
    public Object b;
    public final ViewGroup c;

    public b63(d63 d63Var, Context context, lj4 lj4Var) {
        super(context);
        this.c = d63Var;
        this.b = lj4Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                d63 d63Var = (d63) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (d63Var.n || d63Var.f)) {
                    d63Var.n = false;
                    d63Var.f = false;
                    removeCallbacks(d63Var.r);
                    removeCallbacks(d63Var.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((lj4) this.b).a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public b63(v29 v29Var, Context context) {
        super(context);
        this.c = v29Var;
    }
}
