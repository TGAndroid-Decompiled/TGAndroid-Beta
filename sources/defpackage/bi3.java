package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bi3 extends UndoView {
    public final cj3 k0;

    public bi3(cj3 cj3Var, Activity activity) {
        super(activity);
        this.k0 = cj3Var;
    }

    @Override
    public final boolean a() {
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.k0.f0;
            if (i < bj3VarArr.length) {
                if (bj3VarArr[i].y.k()) {
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
        cj3 cj3Var = this.k0;
        cj3Var.Q4(true, true);
        if (cj3Var.T1 != null) {
            int i2 = 0;
            while (true) {
                if (i2 < cj3Var.T1.size()) {
                    if (((TLRPC.Dialog) cj3Var.T1.get(i2)).id == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                cj3Var.f0[0].d.f();
                gl.d3(new va7(this, i2, (TLRPC.Dialog) cj3Var.T1.remove(i2), (byte) 18));
            } else {
                cj3Var.Q4(false, true);
            }
        }
        cj3Var.G2();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        cj3 cj3Var = this.k0;
        UndoView[] undoViewArr = cj3Var.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cj3Var.w1 = Math.max(0.0f, (gl.L(8.0f) + getMeasuredHeight()) - f);
                cj3Var.q5();
            }
        }
    }
}
