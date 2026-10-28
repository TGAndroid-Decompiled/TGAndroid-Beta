package bh;

import android.text.TextUtils;
import android.view.View;
import bi.g1;
import bi.k1;
import li.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j0 implements View.OnFocusChangeListener {
    public final int f4071a;
    public final Object f4072b;

    public j0(Object obj, int i10) {
        this.f4071a = i10;
        this.f4072b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f4071a) {
            case 0:
                q qVar = (q) this.f4072b;
                if (z10) {
                    qVar.n(true);
                    Runnable runnable = qVar.e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                qVar.m();
                return;
            case 1:
                bi.s sVar = ((bi.y) this.f4072b).V;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 2:
                bi.b1 b1Var = (bi.b1) this.f4072b;
                b1Var.f4309d0.c(z10, !TextUtils.isEmpty(b1Var.f4310e0.getText()));
                return;
            case 3:
                g1 g1Var = (g1) this.f4072b;
                g1Var.f4635f.c(z10, !TextUtils.isEmpty(g1Var.h.getText()));
                return;
            case 4:
                k1 k1Var = (k1) this.f4072b;
                k1Var.f4933b.c(z10, !TextUtils.isEmpty(k1Var.f4934c.getText()));
                return;
            case 5:
                d6.a((d6) this.f4072b, z10);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((rg.w) this.f4072b).f47618c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((rg.x) this.f4072b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
