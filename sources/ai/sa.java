package ai;

import android.view.View;
public final class sa implements View.OnClickListener {
    public final int f2176a;
    public final org.telegram.ui.ActionBar.f3[] f2177b;

    public sa(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f2176a = i10;
        this.f2177b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2176a) {
            case 0:
                this.f2177b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f2177b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f2177b[0].dismiss();
                return;
        }
    }
}
