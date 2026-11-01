package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.yd;
public final class g6 implements View.OnFocusChangeListener {
    public final int f3044a;
    public final Object f3045b;

    public g6(Object obj, int i10) {
        this.f3044a = i10;
        this.f3045b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        switch (this.f3044a) {
            case 0:
                q6.a((q6) this.f3045b, z10);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((ig.s) this.f3045b).f8445f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((ig.t) this.f3045b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 3:
                yd ydVar = ((rh.i) this.f3045b).V;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 4:
                rh.b0 b0Var = (rh.b0) this.f3045b;
                b0Var.V1.c(z10, !TextUtils.isEmpty(b0Var.W1.getText()));
                return;
            case 5:
                rh.e0 e0Var = (rh.e0) this.f3045b;
                e0Var.f46789m1.c(z10, !TextUtils.isEmpty(e0Var.f46790n1.getText()));
                return;
            case 6:
                rh.i0 i0Var = (rh.i0) this.f3045b;
                i0Var.f47076i1.c(z10, !TextUtils.isEmpty(i0Var.f47077j1.getText()));
                return;
            default:
                sg.l lVar = (sg.l) this.f3045b;
                if (z10) {
                    lVar.J(true);
                    Runnable runnable = lVar.a2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                lVar.I();
                return;
        }
    }
}
