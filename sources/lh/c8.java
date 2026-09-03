package lh;

import android.view.View;
public final class c8 implements View.OnClickListener {
    public final int f12241a;
    public final org.telegram.ui.ActionBar.g3[] f12242b;

    public c8(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f12241a = i10;
        this.f12242b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12241a) {
            case 0:
                this.f12242b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = this.f12242b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f12242b[0].dismiss();
                return;
        }
    }
}
