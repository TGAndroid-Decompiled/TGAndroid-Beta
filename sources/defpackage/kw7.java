package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kw7 implements Runnable {
    public final byte a;
    public final vx7 b;

    public kw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        int i = 0;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                ViewGroup[] viewGroupArr = vx7Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vx7Var.Z[0].requestFocus();
                    gl.E3(vx7Var.Z[0]);
                    return;
                }
                return;
            case 1:
                vx7Var.presentFragment(vx7Var.i1, true);
                vx7Var.i1 = null;
                return;
            case 2:
                EditTextBoldCursor[] editTextBoldCursorArr = vx7Var.b0;
                if (editTextBoldCursorArr != null) {
                    vx7Var.K1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                gl.E3(vx7Var.Z[2]);
                return;
            case 4:
                vx7Var.z1();
                return;
            case 5:
                break;
            default:
                vx7Var.finishFragment();
                return;
        }
        while (i < vx7Var.d0.getChildCount()) {
            View childAt = vx7Var.d0.getChildAt(i);
            if (childAt instanceof ux7) {
                vx7Var.d0.removeView(childAt);
                i--;
            }
            i++;
        }
        vx7Var.z1();
        vx7Var.r1.clear();
        vx7Var.q1.clear();
        vx7Var.E.values.clear();
        vx7Var.T1();
    }
}
