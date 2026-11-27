package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class x47 extends vic {
    public final s57 W;

    public x47(s57 s57Var, Context context, o57 o57Var) {
        super(context, o57Var);
        this.W = s57Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        while (true) {
            View[] viewArr = this.W.f.e;
            if (i < viewArr.length) {
                View view = viewArr[i];
                if (view != null) {
                    m57 m57Var = (m57) view;
                    if (m57Var.a == 0) {
                        z = m57Var.e.i;
                        break;
                    }
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return false;
        }
        return C(motionEvent);
    }

    @Override
    public final void v() {
        View view = this.e[0];
        if (view instanceof m57) {
            ((m57) view).e.U();
        }
    }

    @Override
    public final void x(boolean z) {
        s57 s57Var = this.W;
        s57Var.e.setSelectedTab(s57Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof m57) {
            ((m57) view).e.F();
        }
        View view2 = viewArr[1];
        if (view2 instanceof m57) {
            ((m57) view2).e.F();
        }
    }
}
