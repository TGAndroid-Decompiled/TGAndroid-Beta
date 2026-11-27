package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.e;
public final class d21 extends i49 {
    public final byte n1 = 0;
    public final Object o1;

    public d21(rw2 rw2Var, Context context, int i, vnb vnbVar) {
        super(4, i, vnbVar, context, null);
        this.o1 = rw2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v21 v21Var;
        switch (this.n1) {
            case 0:
                g21 g21Var = (g21) this.o1;
                if (motionEvent.getAction() == 0) {
                    v21 v21Var2 = g21Var.n;
                    if (v21Var2 != null) {
                        v21Var2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (v21Var = g21Var.n) != null) {
                    v21Var.i(true);
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
                rw2 rw2Var = (rw2) this.o1;
                if (getReactionsWindow() != null) {
                    z = true;
                } else {
                    z = false;
                }
                WindowManager.LayoutParams layoutParams = rw2Var.x;
                if (z) {
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    layoutParams.flags |= 131072;
                }
                try {
                    ((WindowManager) rw2Var.w.getSystemService("window")).updateViewLayout(rw2Var.y, rw2Var.x);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
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
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    v21Var.i(false);
                }
                ((g21) this.o1).d.getReactionsWindow().c.setOnClickListener(new k1(this, (byte) 23));
                return;
            default:
                return;
        }
    }

    public d21(g21 g21Var, e eVar, Context context, int i, vnb vnbVar) {
        super(3, i, vnbVar, context, eVar);
        this.o1 = g21Var;
    }
}
