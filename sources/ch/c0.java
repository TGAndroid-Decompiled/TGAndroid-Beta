package ch;

import android.text.TextUtils;
import android.view.View;
import di.v0;
import oi.y5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.t4;
public final class c0 implements View.OnFocusChangeListener {
    public final int f5041a;
    public final Object f5042b;

    public c0(Object obj, int i7) {
        this.f5041a = i7;
        this.f5042b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        switch (this.f5041a) {
            case 0:
                l lVar = (l) this.f5042b;
                if (z10) {
                    lVar.K(true);
                    Runnable runnable = lVar.f5058g2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                lVar.J();
                return;
            case 1:
                di.p pVar = ((di.t) this.f5042b).W;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                pVar.b(f10, f10, true);
                return;
            case 2:
                di.p0 p0Var = (di.p0) this.f5042b;
                p0Var.Z1.c(z10, !TextUtils.isEmpty(p0Var.f9196a2.getText()));
                return;
            case 3:
                di.s0 s0Var = (di.s0) this.f5042b;
                s0Var.f9367q1.c(z10, !TextUtils.isEmpty(s0Var.f9368r1.getText()));
                return;
            case 4:
                v0 v0Var = (v0) this.f5042b;
                v0Var.f9553m1.c(z10, !TextUtils.isEmpty(v0Var.n1.getText()));
                return;
            case 5:
                y5.a((y5) this.f5042b, z10);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((t4) this.f5042b).f51351f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.f5042b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
