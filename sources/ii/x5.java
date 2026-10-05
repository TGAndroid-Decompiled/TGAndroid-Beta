package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;
public final class x5 implements View.OnFocusChangeListener {
    public final int f12794a;
    public final Object f12795b;

    public x5(Object obj, int i10) {
        this.f12794a = i10;
        this.f12795b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f12794a) {
            case 0:
                f6.a((f6) this.f12795b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f12795b).f44668c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f12795b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                ae aeVar = ((yh.h) this.f12795b).V;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 4:
                yh.b0 b0Var = (yh.b0) this.f12795b;
                b0Var.f51121c0.c(z10, !TextUtils.isEmpty(b0Var.f51122d0.getText()));
                return;
            case 5:
                yh.f0 f0Var = (yh.f0) this.f12795b;
                f0Var.f51277f.c(z10, !TextUtils.isEmpty(f0Var.h.getText()));
                return;
            case 6:
                yh.j0 j0Var = (yh.j0) this.f12795b;
                j0Var.f51471b.c(z10, !TextUtils.isEmpty(j0Var.f51472c.getText()));
                return;
            default:
                zg.l lVar = (zg.l) this.f12795b;
                if (z10) {
                    lVar.n(true);
                    Runnable runnable = lVar.f53335e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                lVar.m();
                return;
        }
    }
}
