package ci;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m implements View.OnFocusChangeListener {
    public final int f5526a;
    public final Object f5527b;

    public m(Object obj, int i3) {
        this.f5526a = i3;
        this.f5527b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        switch (this.f5526a) {
            case 0:
                r rVar = ((v) this.f5527b).W;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar.b(f10, f10, true);
                return;
            case 1:
                t0 t0Var = (t0) this.f5527b;
                t0Var.W1.c(z10, !TextUtils.isEmpty(t0Var.X1.getText()));
                return;
            case 2:
                x0 x0Var = (x0) this.f5527b;
                x0Var.f6312n1.c(z10, !TextUtils.isEmpty(x0Var.f6313o1.getText()));
                return;
            case 3:
                a1 a1Var = (a1) this.f5527b;
                a1Var.f4791j1.c(z10, !TextUtils.isEmpty(a1Var.k1.getText()));
                return;
            case 4:
                dh.l lVar = (dh.l) this.f5527b;
                if (z10) {
                    lVar.J(true);
                    Runnable runnable = lVar.f8970b2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                lVar.I();
                return;
            case 5:
                mi.b6.a((mi.b6) this.f5527b, z10);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((org.telegram.ui.v4) this.f5527b).f50378f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((tg.p) this.f5527b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
