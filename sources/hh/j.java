package hh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class j implements View.OnFocusChangeListener {

    public final int f9504a;

    public final Object f9505b;

    public j(Object obj, int i10) {
        this.f9504a = i10;
        this.f9505b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9504a) {
            case 0:
                n nVar = ((r) this.f9505b).I;
                float f10 = z10 ? 1.0f : 0.0f;
                nVar.b(f10, f10, true);
                break;
            case 1:
                o0 o0Var = (o0) this.f9505b;
                o0Var.Y.c(z10, !TextUtils.isEmpty(o0Var.Z.getText()));
                break;
            case 2:
                t0 t0Var = (t0) this.f9505b;
                t0Var.f10040f.c(z10, !TextUtils.isEmpty(t0Var.h.getText()));
                break;
            case 3:
                x0 x0Var = (x0) this.f9505b;
                x0Var.f10315b.c(z10, !TextUtils.isEmpty(x0Var.f10316c.getText()));
                break;
            case 4:
                ig.p pVar = (ig.p) this.f9505b;
                if (!z10) {
                    pVar.m();
                } else {
                    pVar.n(true);
                    Runnable runnable = pVar.f11298e;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 5:
                rh.t5.a((rh.t5) this.f9505b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((yf.v) this.f9505b).f50099c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((yf.w) this.f9505b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
