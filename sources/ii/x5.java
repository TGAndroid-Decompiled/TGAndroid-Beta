package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;
public final class x5 implements View.OnFocusChangeListener {
    public final int f12793a;
    public final Object f12794b;

    public x5(Object obj, int i10) {
        this.f12793a = i10;
        this.f12794b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f12793a) {
            case 0:
                f6.a((f6) this.f12794b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f12794b).f44654c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f12794b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                ae aeVar = ((yh.g) this.f12794b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 4:
                yh.a0 a0Var = (yh.a0) this.f12794b;
                a0Var.f51059c0.c(z10, !TextUtils.isEmpty(a0Var.f51060d0.getText()));
                return;
            case 5:
                yh.e0 e0Var = (yh.e0) this.f12794b;
                e0Var.f51212f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                yh.i0 i0Var = (yh.i0) this.f12794b;
                i0Var.f51400b.c(z10, !TextUtils.isEmpty(i0Var.f51401c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f12794b;
                if (z10) {
                    oVar.n(true);
                    Runnable runnable = oVar.f53362e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                oVar.m();
                return;
        }
    }
}
