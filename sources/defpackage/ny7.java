package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ny7 implements Runnable {
    public final byte a;
    public final xz7 b;

    public ny7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        int i = 0;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                ViewGroup[] viewGroupArr = xz7Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    xz7Var.Z[0].requestFocus();
                    gm.E3(xz7Var.Z[0]);
                    return;
                }
                return;
            case 1:
                xz7Var.presentFragment(xz7Var.i1, true);
                xz7Var.i1 = null;
                return;
            case 2:
                EditTextBoldCursor[] editTextBoldCursorArr = xz7Var.b0;
                if (editTextBoldCursorArr != null) {
                    xz7Var.L1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                gm.E3(xz7Var.Z[2]);
                return;
            case 4:
                xz7Var.A1();
                return;
            case 5:
                break;
            default:
                xz7Var.finishFragment();
                return;
        }
        while (i < xz7Var.d0.getChildCount()) {
            View childAt = xz7Var.d0.getChildAt(i);
            if (childAt instanceof wz7) {
                xz7Var.d0.removeView(childAt);
                i--;
            }
            i++;
        }
        xz7Var.A1();
        xz7Var.r1.clear();
        xz7Var.q1.clear();
        xz7Var.E.values.clear();
        xz7Var.U1();
    }
}
