package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
public final class i82 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final byte a;
    public final Object b;

    public i82(Object obj, byte b) {
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
                ((p82) obj).e0();
                return;
            case 1:
                j67 j67Var = (j67) obj;
                if (!j67Var.t0 && (view2 instanceof EditText)) {
                    gm.t1(j67Var.S);
                    gm.d3(new v57(j67Var, (EditText) view2, (byte) 0), 200L);
                    return;
                }
                return;
            case 2:
                ((jf9) obj).B0();
                return;
            case 3:
                ch9 ch9Var = (ch9) obj;
                if (view2 != null && ch9Var.F(view2) != null) {
                    z = true;
                }
                ch9Var.i3 = z;
                if (view2 instanceof ne9) {
                    ch9Var.T3 = (ne9) view2;
                    return;
                }
                return;
            default:
                kk9 kk9Var = (kk9) obj;
                kk9Var.z();
                mk9 mk9Var = kk9Var.w;
                if (mk9Var != null) {
                    mk9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
