package dg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import wh.v5;
public final class z implements View.OnFocusChangeListener {
    public final int f4737a;
    public final Object f4738b;

    public z(Object obj, int i10) {
        this.f4737a = i10;
        this.f4738b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        float f10;
        switch (this.f4737a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((c0) this.f4738b).f4448c;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((d0) this.f4738b).d;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 2:
                mh.l lVar = ((mh.p) this.f4738b).J;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                lVar.b(f10, f10, true);
                return;
            case 3:
                mh.m0 m0Var = (mh.m0) this.f4738b;
                m0Var.Z.c(z4, !TextUtils.isEmpty(m0Var.f14422a0.getText()));
                return;
            case 4:
                mh.r0 r0Var = (mh.r0) this.f4738b;
                r0Var.f14656f.c(z4, !TextUtils.isEmpty(r0Var.h.getText()));
                return;
            case 5:
                mh.v0 v0Var = (mh.v0) this.f4738b;
                v0Var.f14913b.c(z4, !TextUtils.isEmpty(v0Var.f14914c.getText()));
                return;
            case 6:
                ng.p pVar = (ng.p) this.f4738b;
                if (z4) {
                    pVar.n(true);
                    Runnable runnable = pVar.f16063e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                pVar.m();
                return;
            default:
                v5.a((v5) this.f4738b, z4);
                return;
        }
    }
}
