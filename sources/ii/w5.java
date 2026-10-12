package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.de;
public final class w5 implements View.OnFocusChangeListener {
    public final int f12786a;
    public final Object f12787b;

    public w5(Object obj, int i10) {
        this.f12786a = i10;
        this.f12787b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f12786a) {
            case 0:
                e6.a((e6) this.f12787b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f12787b).f45705c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f12787b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                de deVar = ((yh.g) this.f12787b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                deVar.b(f7, f7, true);
                return;
            case 4:
                yh.y yVar = (yh.y) this.f12787b;
                yVar.f53618c0.c(z10, !TextUtils.isEmpty(yVar.f53619d0.getText()));
                return;
            case 5:
                yh.c0 c0Var = (yh.c0) this.f12787b;
                c0Var.f52564f.c(z10, !TextUtils.isEmpty(c0Var.h.getText()));
                return;
            case 6:
                yh.h0 h0Var = (yh.h0) this.f12787b;
                h0Var.f52839b.c(z10, !TextUtils.isEmpty(h0Var.f52840c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f12787b;
                if (z10) {
                    oVar.n(true);
                    Runnable runnable = oVar.f54720e;
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
