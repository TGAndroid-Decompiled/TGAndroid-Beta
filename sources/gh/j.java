package gh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements View.OnFocusChangeListener {
    public final int f8318a;
    public final Object f8319b;

    public j(Object obj, int i9) {
        this.f8318a = i9;
        this.f8319b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        switch (this.f8318a) {
            case 0:
                n nVar = ((r) this.f8319b).I;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                nVar.b(f10, f10, true);
                return;
            case 1:
                o0 o0Var = (o0) this.f8319b;
                o0Var.Y.c(z10, !TextUtils.isEmpty(o0Var.Z.getText()));
                return;
            case 2:
                t0 t0Var = (t0) this.f8319b;
                t0Var.f8898f.c(z10, !TextUtils.isEmpty(t0Var.h.getText()));
                return;
            case 3:
                x0 x0Var = (x0) this.f8319b;
                x0Var.f9128b.c(z10, !TextUtils.isEmpty(x0Var.f9129c.getText()));
                return;
            case 4:
                hg.p pVar = (hg.p) this.f8319b;
                if (z10) {
                    pVar.n(true);
                    Runnable runnable = pVar.f10604e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                pVar.m();
                return;
            case 5:
                qh.s5.a((qh.s5) this.f8319b, z10);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((xf.v) this.f8319b).f49389c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((xf.w) this.f8319b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
