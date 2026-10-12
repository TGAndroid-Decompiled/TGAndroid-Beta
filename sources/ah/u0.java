package ah;

import android.text.TextUtils;
import android.view.View;
import ji.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.fe;
public final class u0 implements View.OnFocusChangeListener {
    public final int f887a;
    public final Object f888b;

    public u0(Object obj, int i10) {
        this.f887a = i10;
        this.f888b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f887a) {
            case 0:
                w wVar = (w) this.f888b;
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
                i6.a((i6) this.f888b, z10);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((qg.v) this.f888b).f43593c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.w) this.f888b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                fe feVar = ((zh.g) this.f888b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                feVar.b(f7, f7, true);
                return;
            case 5:
                zh.z zVar = (zh.z) this.f888b;
                zVar.f51345c0.c(z10, !TextUtils.isEmpty(zVar.f51346d0.getText()));
                return;
            case 6:
                zh.d0 d0Var = (zh.d0) this.f888b;
                d0Var.f50364f.c(z10, !TextUtils.isEmpty(d0Var.h.getText()));
                return;
            default:
                zh.h0 h0Var = (zh.h0) this.f888b;
                h0Var.f50595b.c(z10, !TextUtils.isEmpty(h0Var.f50596c.getText()));
                return;
        }
    }
}
