package ai;

import android.view.View;
public final class sa implements View.OnClickListener {
    public final int f2166a;
    public final org.telegram.ui.ActionBar.f3[] f2167b;

    public sa(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f2166a = i10;
        this.f2167b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2166a) {
            case 0:
                this.f2167b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f2167b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f2167b[0].dismiss();
                return;
        }
    }
}
