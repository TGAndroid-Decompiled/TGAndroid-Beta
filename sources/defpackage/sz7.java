package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz7 implements Runnable {
    public final byte a;
    public final b18 b;

    public sz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        int i = 0;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                ViewGroup[] viewGroupArr = b18Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    b18Var.Z[0].requestFocus();
                    hl.E3(b18Var.Z[0]);
                    return;
                }
                return;
            case 1:
                b18Var.presentFragment(b18Var.i1, true);
                b18Var.i1 = null;
                return;
            case 2:
                EditTextBoldCursor[] editTextBoldCursorArr = b18Var.b0;
                if (editTextBoldCursorArr != null) {
                    b18Var.L1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                hl.E3(b18Var.Z[2]);
                return;
            case 4:
                b18Var.A1();
                return;
            case 5:
                break;
            default:
                b18Var.finishFragment();
                return;
        }
        while (i < b18Var.d0.getChildCount()) {
            View childAt = b18Var.d0.getChildAt(i);
            if (childAt instanceof a18) {
                b18Var.d0.removeView(childAt);
                i--;
            }
            i++;
        }
        b18Var.A1();
        b18Var.r1.clear();
        b18Var.q1.clear();
        b18Var.E.values.clear();
        b18Var.U1();
    }
}
