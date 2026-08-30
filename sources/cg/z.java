package cg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import vh.v5;
public final class z implements View.OnFocusChangeListener {
    public final int f2580a;
    public final Object f2581b;

    public z(Object obj, int i10) {
        this.f2580a = i10;
        this.f2581b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        float f10;
        switch (this.f2580a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((c0) this.f2581b).f2323c;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((d0) this.f2581b).d;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 2:
                lh.m mVar = ((lh.q) this.f2581b).J;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.b(f10, f10, true);
                return;
            case 3:
                lh.n0 n0Var = (lh.n0) this.f2581b;
                n0Var.Z.c(z4, !TextUtils.isEmpty(n0Var.f12811a0.getText()));
                return;
            case 4:
                lh.s0 s0Var = (lh.s0) this.f2581b;
                s0Var.f13051f.c(z4, !TextUtils.isEmpty(s0Var.h.getText()));
                return;
            case 5:
                lh.w0 w0Var = (lh.w0) this.f2581b;
                w0Var.f13269b.c(z4, !TextUtils.isEmpty(w0Var.f13270c.getText()));
                return;
            case 6:
                mg.p pVar = (mg.p) this.f2581b;
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
                v5.a((v5) this.f2581b, z4);
                return;
        }
    }
}
