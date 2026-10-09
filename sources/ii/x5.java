package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zd;
public final class x5 implements View.OnFocusChangeListener {
    public final int f12840a;
    public final Object f12841b;

    public x5(Object obj, int i10) {
        this.f12840a = i10;
        this.f12841b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f12840a) {
            case 0:
                f6.a((f6) this.f12841b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f12841b).f45810c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f12841b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                zd zdVar = ((yh.g) this.f12841b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 4:
                yh.y yVar = (yh.y) this.f12841b;
                yVar.f53383c0.c(z10, !TextUtils.isEmpty(yVar.f53384d0.getText()));
                return;
            case 5:
                yh.c0 c0Var = (yh.c0) this.f12841b;
                c0Var.f52325f.c(z10, !TextUtils.isEmpty(c0Var.h.getText()));
                return;
            case 6:
                yh.h0 h0Var = (yh.h0) this.f12841b;
                h0Var.f52600b.c(z10, !TextUtils.isEmpty(h0Var.f52601c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f12841b;
                if (z10) {
                    oVar.n(true);
                    Runnable runnable = oVar.f54486e;
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
