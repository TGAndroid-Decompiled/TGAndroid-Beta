package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.yd;
public final class w5 implements View.OnFocusChangeListener {
    public final int f11719a;
    public final Object f11720b;

    public w5(Object obj, int i10) {
        this.f11719a = i10;
        this.f11720b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f11719a) {
            case 0:
                e6.a((e6) this.f11720b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f11720b).f41386c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f11720b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                yd ydVar = ((yh.g) this.f11720b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 4:
                yh.a0 a0Var = (yh.a0) this.f11720b;
                a0Var.f47283c0.c(z10, !TextUtils.isEmpty(a0Var.f47284d0.getText()));
                return;
            case 5:
                yh.e0 e0Var = (yh.e0) this.f11720b;
                e0Var.f47425f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                yh.i0 i0Var = (yh.i0) this.f11720b;
                i0Var.f47601b.c(z10, !TextUtils.isEmpty(i0Var.f47602c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f11720b;
                if (z10) {
                    oVar.n(true);
                    Runnable runnable = oVar.e;
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
