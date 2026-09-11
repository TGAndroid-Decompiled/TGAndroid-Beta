package ah;

import android.text.TextUtils;
import android.view.View;
import ji.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zd;
public final class v0 implements View.OnFocusChangeListener {
    public final int f709a;
    public final Object f710b;

    public v0(Object obj, int i10) {
        this.f709a = i10;
        this.f710b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f709a) {
            case 0:
                x xVar = (x) this.f710b;
                if (z10) {
                    xVar.n(true);
                    Runnable runnable = xVar.f715e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                xVar.m();
                return;
            case 1:
                g6.a((g6) this.f710b, z10);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((qg.v) this.f710b).f44597c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.w) this.f710b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                zd zdVar = ((zh.g) this.f710b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 5:
                zh.a0 a0Var = (zh.a0) this.f710b;
                a0Var.f51648c0.c(z10, !TextUtils.isEmpty(a0Var.f51649d0.getText()));
                return;
            case 6:
                zh.e0 e0Var = (zh.e0) this.f710b;
                e0Var.f51809f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            default:
                zh.i0 i0Var = (zh.i0) this.f710b;
                i0Var.f52006b.c(z10, !TextUtils.isEmpty(i0Var.f52007c.getText()));
                return;
        }
    }
}
