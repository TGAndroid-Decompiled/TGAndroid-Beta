package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.d;
public final class c31 extends v29 {
    public final byte n1 = 0;
    public final Object o1;

    public c31(hx2 hx2Var, Context context, int i, ylb ylbVar) {
        super(4, i, ylbVar, context, null);
        this.o1 = hx2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        u31 u31Var;
        switch (this.n1) {
            case 0:
                f31 f31Var = (f31) this.o1;
                if (motionEvent.getAction() == 0) {
                    u31 u31Var2 = f31Var.n;
                    if (u31Var2 != null) {
                        u31Var2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (u31Var = f31Var.n) != null) {
                    u31Var.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void g() {
        boolean z;
        switch (this.n1) {
            case 1:
                super.g();
                hx2 hx2Var = (hx2) this.o1;
                if (getReactionsWindow() != null) {
                    z = true;
                } else {
                    z = false;
                }
                WindowManager.LayoutParams layoutParams = hx2Var.x;
                if (z) {
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    layoutParams.flags |= 131072;
                }
                try {
                    ((WindowManager) hx2Var.w.getSystemService("window")).updateViewLayout(hx2Var.y, hx2Var.x);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                super.g();
                return;
        }
    }

    @Override
    public final void j() {
        switch (this.n1) {
            case 0:
                u31 u31Var = u31.x;
                if (u31Var != null) {
                    u31Var.i(false);
                }
                ((f31) this.o1).d.getReactionsWindow().c.setOnClickListener(new j1(this, (byte) 24));
                return;
            default:
                return;
        }
    }

    public c31(f31 f31Var, d dVar, Context context, int i, ylb ylbVar) {
        super(3, i, ylbVar, context, dVar);
        this.o1 = f31Var;
    }
}
