package hi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;
public final class y5 implements View.OnFocusChangeListener {
    public final int f9986a;
    public final Object f9987b;

    public y5(Object obj, int i10) {
        this.f9986a = i10;
        this.f9987b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f9986a) {
            case 0:
                g6.a((g6) this.f9987b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((og.y) this.f9987b).f14563c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((og.z) this.f9987b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                ae aeVar = ((xh.h) this.f9987b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 4:
                xh.a0 a0Var = (xh.a0) this.f9987b;
                a0Var.f45214c0.c(z10, !TextUtils.isEmpty(a0Var.f45215d0.getText()));
                return;
            case 5:
                xh.e0 e0Var = (xh.e0) this.f9987b;
                e0Var.f45356f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                xh.i0 i0Var = (xh.i0) this.f9987b;
                i0Var.f45524b.c(z10, !TextUtils.isEmpty(i0Var.f45525c.getText()));
                return;
            default:
                yg.p pVar = (yg.p) this.f9987b;
                if (z10) {
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
        }
    }
}
