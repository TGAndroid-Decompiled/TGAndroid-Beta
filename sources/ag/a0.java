package ag;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import th.t5;
public final class a0 implements View.OnFocusChangeListener {
    public final int f409a;
    public final Object f410b;

    public a0(Object obj, int i10) {
        this.f409a = i10;
        this.f410b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f9;
        switch (this.f409a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((d0) this.f410b).f433c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((e0) this.f410b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 2:
                jh.l lVar = ((jh.q) this.f410b).I;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                lVar.b(f9, f9, true);
                return;
            case 3:
                jh.n0 n0Var = (jh.n0) this.f410b;
                n0Var.Y.c(z10, !TextUtils.isEmpty(n0Var.Z.getText()));
                return;
            case 4:
                jh.s0 s0Var = (jh.s0) this.f410b;
                s0Var.f12745f.c(z10, !TextUtils.isEmpty(s0Var.h.getText()));
                return;
            case 5:
                jh.w0 w0Var = (jh.w0) this.f410b;
                w0Var.f13002b.c(z10, !TextUtils.isEmpty(w0Var.f13003c.getText()));
                return;
            case 6:
                kg.p pVar = (kg.p) this.f410b;
                if (z10) {
                    pVar.n(true);
                    Runnable runnable = pVar.f13711e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                pVar.m();
                return;
            default:
                t5.a((t5) this.f410b, z10);
                return;
        }
    }
}
