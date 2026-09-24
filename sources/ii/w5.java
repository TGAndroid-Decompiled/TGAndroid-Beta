package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.yd;
public final class w5 implements View.OnFocusChangeListener {
    public final int f11705a;
    public final Object f11706b;

    public w5(Object obj, int i10) {
        this.f11705a = i10;
        this.f11706b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f11705a) {
            case 0:
                e6.a((e6) this.f11706b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.f11706b).f41273c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.f11706b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                yd ydVar = ((yh.g) this.f11706b).M;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 4:
                yh.a0 a0Var = (yh.a0) this.f11706b;
                a0Var.f47164c0.c(z10, !TextUtils.isEmpty(a0Var.f47165d0.getText()));
                return;
            case 5:
                yh.e0 e0Var = (yh.e0) this.f11706b;
                e0Var.f47306f.c(z10, !TextUtils.isEmpty(e0Var.h.getText()));
                return;
            case 6:
                yh.i0 i0Var = (yh.i0) this.f11706b;
                i0Var.f47482b.c(z10, !TextUtils.isEmpty(i0Var.f47483c.getText()));
                return;
            default:
                zg.o oVar = (zg.o) this.f11706b;
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
