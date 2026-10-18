package ai;

import android.view.View;
public final class sa implements View.OnClickListener {
    public final int f2178a;
    public final org.telegram.ui.ActionBar.f3[] f2179b;

    public sa(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f2178a = i10;
        this.f2179b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2178a) {
            case 0:
                this.f2179b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f2179b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f2179b[0].dismiss();
                return;
        }
    }
}
