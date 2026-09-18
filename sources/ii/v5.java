package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zd;
public final class v5 implements View.OnFocusChangeListener {
    public final int f11697a;
    public final Object f11698b;

    public v5(Object obj, int i10) {
        this.f11697a = i10;
        this.f11698b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f11697a) {
            case 0:
                d6.a((d6) this.f11698b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f11698b).f41273c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f11698b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                zd zdVar = ((yh.g) this.f11698b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 4:
                yh.a0 a0Var = (yh.a0) this.f11698b;
                a0Var.f47155c0.c(z10, !TextUtils.isEmpty(a0Var.f47156d0.getText()));
                return;
            case 5:
                yh.e0 e0Var = (yh.e0) this.f11698b;
                e0Var.f47312f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                yh.i0 i0Var = (yh.i0) this.f11698b;
                i0Var.f47495b.c(z10, !TextUtils.isEmpty(i0Var.f47496c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f11698b;
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
