package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n implements View.OnFocusChangeListener {
    public final int f4380a;
    public final Object f4381b;

    public n(Object obj, int i7) {
        this.f4380a = i7;
        this.f4381b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        float f10;
        switch (this.f4380a) {
            case 0:
                u uVar = ((z) this.f4381b).V;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                uVar.b(f10, f10, true);
                return;
            case 1:
                a1 a1Var = (a1) this.f4381b;
                a1Var.V1.c(z9, !TextUtils.isEmpty(a1Var.W1.getText()));
                return;
            case 2:
                e1 e1Var = (e1) this.f4381b;
                e1Var.f3737m1.c(z9, !TextUtils.isEmpty(e1Var.n1.getText()));
                return;
            case 3:
                h1 h1Var = (h1) this.f4381b;
                h1Var.f3973i1.c(z9, !TextUtils.isEmpty(h1Var.f3974j1.getText()));
                return;
            case 4:
                ch.l lVar = (ch.l) this.f4381b;
                if (z9) {
                    lVar.J(true);
                    Runnable runnable = lVar.f6227a2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                lVar.I();
                return;
            case 5:
                li.a6.a((li.a6) this.f4381b, z9);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((org.telegram.ui.t4) this.f4381b).f49918f;
                if (!z9 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.f4381b).d;
                if (!z9 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
        }
    }
}
