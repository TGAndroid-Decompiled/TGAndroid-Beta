package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
public final class o72 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final byte a;
    public final Object b;

    public o72(Object obj, byte b) {
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
                ((v72) obj).d0();
                return;
            case 1:
                q67 q67Var = (q67) obj;
                if (!q67Var.t0 && (view2 instanceof EditText)) {
                    hl.t1(q67Var.S);
                    hl.d3(new c67(q67Var, (EditText) view2, (byte) 0), 200L);
                    return;
                }
                return;
            case 2:
                ((yg9) obj).B0();
                return;
            case 3:
                pi9 pi9Var = (pi9) obj;
                if (view2 != null && pi9Var.G(view2) != null) {
                    z = true;
                }
                pi9Var.i3 = z;
                if (view2 instanceof dg9) {
                    pi9Var.T3 = (dg9) view2;
                    return;
                }
                return;
            default:
                xl9 xl9Var = (xl9) obj;
                xl9Var.z();
                zl9 zl9Var = xl9Var.w;
                if (zl9Var != null) {
                    zl9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
