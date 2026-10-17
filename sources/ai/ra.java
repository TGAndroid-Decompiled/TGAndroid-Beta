package ai;

import android.view.View;
public final class ra implements View.OnClickListener {
    public final int f2119a;
    public final org.telegram.ui.ActionBar.f3[] f2120b;

    public ra(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f2119a = i10;
        this.f2120b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2119a) {
            case 0:
                this.f2120b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f2120b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f2120b[0].dismiss();
                return;
        }
    }
}
