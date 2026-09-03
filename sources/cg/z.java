package cg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import vh.w5;
public final class z implements View.OnFocusChangeListener {
    public final int f2563a;
    public final Object f2564b;

    public z(Object obj, int i10) {
        this.f2563a = i10;
        this.f2564b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        float f10;
        switch (this.f2563a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((c0) this.f2564b).f2306c;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((d0) this.f2564b).d;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 2:
                lh.m mVar = ((lh.q) this.f2564b).J;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.b(f10, f10, true);
                return;
            case 3:
                lh.n0 n0Var = (lh.n0) this.f2564b;
                n0Var.Z.c(z4, !TextUtils.isEmpty(n0Var.f12795a0.getText()));
                return;
            case 4:
                lh.s0 s0Var = (lh.s0) this.f2564b;
                s0Var.f13035f.c(z4, !TextUtils.isEmpty(s0Var.h.getText()));
                return;
            case 5:
                lh.w0 w0Var = (lh.w0) this.f2564b;
                w0Var.f13253b.c(z4, !TextUtils.isEmpty(w0Var.f13254c.getText()));
                return;
            case 6:
                mg.p pVar = (mg.p) this.f2564b;
                if (z4) {
                    pVar.n(true);
                    Runnable runnable = pVar.e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                pVar.m();
                return;
            default:
                w5.a((w5) this.f2564b, z4);
                return;
        }
    }
}
