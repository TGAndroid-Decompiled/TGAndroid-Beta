package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.yd;
public final class x5 implements View.OnFocusChangeListener {
    public final int f12839a;
    public final Object f12840b;

    public x5(Object obj, int i10) {
        this.f12839a = i10;
        this.f12840b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f12839a) {
            case 0:
                f6.a((f6) this.f12840b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f12840b).f45880c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f12840b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                yd ydVar = ((yh.g) this.f12840b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 4:
                yh.y yVar = (yh.y) this.f12840b;
                yVar.f53506c0.c(z10, !TextUtils.isEmpty(yVar.f53507d0.getText()));
                return;
            case 5:
                yh.c0 c0Var = (yh.c0) this.f12840b;
                c0Var.f52448f.c(z10, !TextUtils.isEmpty(c0Var.h.getText()));
                return;
            case 6:
                yh.h0 h0Var = (yh.h0) this.f12840b;
                h0Var.f52724b.c(z10, !TextUtils.isEmpty(h0Var.f52725c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f12840b;
                if (z10) {
                    oVar.n(true);
                    Runnable runnable = oVar.f54609e;
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
