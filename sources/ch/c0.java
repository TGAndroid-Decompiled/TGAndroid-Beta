package ch;

import android.text.TextUtils;
import android.view.View;
import di.u0;
import oi.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.t4;
public final class c0 implements View.OnFocusChangeListener {
    public final int f5322a;
    public final Object f5323b;

    public c0(Object obj, int i7) {
        this.f5322a = i7;
        this.f5323b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        switch (this.f5322a) {
            case 0:
                m mVar = (m) this.f5323b;
                if (z10) {
                    mVar.K(true);
                    Runnable runnable = mVar.f5339g2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                mVar.J();
                return;
            case 1:
                di.p pVar = ((di.t) this.f5323b).W;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                pVar.b(f10, f10, true);
                return;
            case 2:
                di.r0 r0Var = (di.r0) this.f5323b;
                r0Var.f9604q1.c(z10, !TextUtils.isEmpty(r0Var.f9605r1.getText()));
                return;
            case 3:
                u0 u0Var = (u0) this.f5323b;
                u0Var.f9828m1.c(z10, !TextUtils.isEmpty(u0Var.n1.getText()));
                return;
            case 4:
                a6.a((a6) this.f5323b, z10);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((t4) this.f5323b).f52239f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.f5323b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
