package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;
public final class w5 implements View.OnFocusChangeListener {
    public final int f11708a;
    public final Object f11709b;

    public w5(Object obj, int i10) {
        this.f11708a = i10;
        this.f11709b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f11708a) {
            case 0:
                e6.a((e6) this.f11709b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f11709b).f41285c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f11709b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                ae aeVar = ((yh.g) this.f11709b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 4:
                yh.a0 a0Var = (yh.a0) this.f11709b;
                a0Var.f47223c0.c(z10, !TextUtils.isEmpty(a0Var.f47224d0.getText()));
                return;
            case 5:
                yh.e0 e0Var = (yh.e0) this.f11709b;
                e0Var.f47365f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                yh.i0 i0Var = (yh.i0) this.f11709b;
                i0Var.f47551b.c(z10, !TextUtils.isEmpty(i0Var.f47552c.getText()));
                return;
            default:
                zg.p pVar = (zg.p) this.f11709b;
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
