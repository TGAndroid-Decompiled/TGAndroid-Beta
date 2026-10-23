package ah;

import android.text.TextUtils;
import android.view.View;
import ki.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u0 implements View.OnFocusChangeListener {
    public final int f891a;
    public final Object f892b;

    public u0(Object obj, int i10) {
        this.f891a = i10;
        this.f892b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f891a) {
            case 0:
                w wVar = (w) this.f892b;
                if (z10) {
                    wVar.n(true);
                    Runnable runnable = wVar.e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                wVar.m();
                return;
            case 1:
                ai.s sVar = ((ai.x) this.f892b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 2:
                ai.b1 b1Var = (ai.b1) this.f892b;
                b1Var.f1005c0.c(z10, !TextUtils.isEmpty(b1Var.f1006d0.getText()));
                return;
            case 3:
                ai.h1 h1Var = (ai.h1) this.f892b;
                h1Var.f1405f.c(z10, !TextUtils.isEmpty(h1Var.h.getText()));
                return;
            case 4:
                ai.l1 l1Var = (ai.l1) this.f892b;
                l1Var.f1675b.c(z10, !TextUtils.isEmpty(l1Var.f1676c.getText()));
                return;
            case 5:
                c6.a((c6) this.f892b, z10);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((qg.w) this.f892b).f44692c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.x) this.f892b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
