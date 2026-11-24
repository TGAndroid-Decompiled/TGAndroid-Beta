package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class q27 extends wec {
    public final l37 W;

    public q27(l37 l37Var, Context context, h37 h37Var) {
        super(context, h37Var);
        this.W = l37Var;
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
                    f37 f37Var = (f37) view;
                    if (f37Var.a == 0) {
                        z = f37Var.e.i;
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
    public final void u() {
        View view = this.e[0];
        if (view instanceof f37) {
            ((f37) view).e.U();
        }
    }

    @Override
    public final void w(boolean z) {
        l37 l37Var = this.W;
        l37Var.e.setSelectedTab(l37Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof f37) {
            ((f37) view).e.F();
        }
        View view2 = viewArr[1];
        if (view2 instanceof f37) {
            ((f37) view2).e.F();
        }
    }
}
