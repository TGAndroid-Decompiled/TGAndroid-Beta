package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
public final class x62 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final byte a;
    public final Object b;

    public x62(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((e72) obj).e0();
                return;
            case 1:
                j47 j47Var = (j47) obj;
                if (!j47Var.t0 && (view2 instanceof EditText)) {
                    gl.t1(j47Var.S);
                    gl.d3(new v37(j47Var, (EditText) view2, (byte) 0), 200L);
                    return;
                }
                return;
            case 2:
                ((hd9) obj).A0();
                return;
            case 3:
                ye9 ye9Var = (ye9) obj;
                if (view2 != null && ye9Var.F(view2) != null) {
                    z = true;
                }
                ye9Var.i3 = z;
                if (view2 instanceof mc9) {
                    ye9Var.T3 = (mc9) view2;
                    return;
                }
                return;
            default:
                ii9 ii9Var = (ii9) obj;
                ii9Var.z();
                ki9 ki9Var = ii9Var.w;
                if (ki9Var != null) {
                    ki9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
