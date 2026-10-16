package ah;

import android.text.TextUtils;
import android.view.View;
import ji.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.fe;
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
                i6.a((i6) this.f892b, z10);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((qg.v) this.f892b).f43335c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.w) this.f892b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                fe feVar = ((zh.g) this.f892b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                feVar.b(f7, f7, true);
                return;
            case 5:
                zh.z zVar = (zh.z) this.f892b;
                zVar.f51346c0.c(z10, !TextUtils.isEmpty(zVar.f51347d0.getText()));
                return;
            case 6:
                zh.d0 d0Var = (zh.d0) this.f892b;
                d0Var.f50365f.c(z10, !TextUtils.isEmpty(d0Var.h.getText()));
                return;
            default:
                zh.h0 h0Var = (zh.h0) this.f892b;
                h0Var.f50596b.c(z10, !TextUtils.isEmpty(h0Var.f50597c.getText()));
                return;
        }
    }
}
