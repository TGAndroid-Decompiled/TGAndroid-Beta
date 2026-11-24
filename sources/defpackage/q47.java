package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class q47 extends wgc {
    public final l57 W;

    public q47(l57 l57Var, Context context, h57 h57Var) {
        super(context, h57Var);
        this.W = l57Var;
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
                    f57 f57Var = (f57) view;
                    if (f57Var.a == 0) {
                        z = f57Var.e.i;
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
        return B(motionEvent);
    }

    @Override
    public final void t() {
        View view = this.e[0];
        if (view instanceof f57) {
            ((f57) view).e.U();
        }
    }

    @Override
    public final void w(boolean z) {
        l57 l57Var = this.W;
        l57Var.e.setSelectedTab(l57Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof f57) {
            ((f57) view).e.F();
        }
        View view2 = viewArr[1];
        if (view2 instanceof f57) {
            ((f57) view2).e.F();
        }
    }
}
