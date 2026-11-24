package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class nj3 extends UndoView {
    public final nk3 k0;

    public nj3(nk3 nk3Var, Activity activity) {
        super(activity);
        this.k0 = nk3Var;
    }

    @Override
    public final boolean a() {
        int i = 0;
        while (true) {
            mk3[] mk3VarArr = this.k0.f0;
            if (i < mk3VarArr.length) {
                if (mk3VarArr[i].y.k()) {
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
        nk3 nk3Var = this.k0;
        nk3Var.U4(true, true);
        if (nk3Var.T1 != null) {
            int i2 = 0;
            while (true) {
                if (i2 < nk3Var.T1.size()) {
                    if (((TLRPC.Dialog) nk3Var.T1.get(i2)).id == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                nk3Var.f0[0].d.f();
                gm.c3(new wc7(this, i2, (TLRPC.Dialog) nk3Var.T1.remove(i2), (byte) 18));
            } else {
                nk3Var.U4(false, true);
            }
        }
        nk3Var.I2();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        nk3 nk3Var = this.k0;
        UndoView[] undoViewArr = nk3Var.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                nk3Var.w1 = Math.max(0.0f, (gm.L(8.0f) + getMeasuredHeight()) - f);
                nk3Var.u5();
            }
        }
    }
}
