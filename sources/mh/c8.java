package mh;

import android.view.View;
public final class c8 implements View.OnClickListener {
    public final int f13841a;
    public final org.telegram.ui.ActionBar.h3[] f13842b;

    public c8(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f13841a = i10;
        this.f13842b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13841a) {
            case 0:
                this.f13842b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = this.f13842b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f13842b[0].dismiss();
                return;
        }
    }
}
