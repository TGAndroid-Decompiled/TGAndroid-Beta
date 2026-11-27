package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class vi3 extends UndoView {
    public final uj3 k0;

    public vi3(uj3 uj3Var, Activity activity) {
        super(activity);
        this.k0 = uj3Var;
    }

    @Override
    public final boolean a() {
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.k0.f0;
            if (i < tj3VarArr.length) {
                if (tj3VarArr[i].y.k()) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void g(int i, long j) {
        if (i != 1 && i != 27) {
            return;
        }
        uj3 uj3Var = this.k0;
        uj3Var.U4(true, true);
        if (uj3Var.T1 != null) {
            int i2 = 0;
            while (true) {
                if (i2 < uj3Var.T1.size()) {
                    if (((TLRPC.Dialog) uj3Var.T1.get(i2)).id == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                uj3Var.f0[0].d.f();
                hl.c3(new ze7(this, i2, (TLRPC.Dialog) uj3Var.T1.remove(i2), (byte) 18));
            } else {
                uj3Var.U4(false, true);
            }
        }
        uj3Var.I2();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        uj3 uj3Var = this.k0;
        UndoView[] undoViewArr = uj3Var.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uj3Var.w1 = Math.max(0.0f, (hl.L(8.0f) + getMeasuredHeight()) - f);
                uj3Var.u5();
            }
        }
    }
}
