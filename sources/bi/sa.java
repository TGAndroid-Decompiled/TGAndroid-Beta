package bi;

import android.view.View;
public final class sa implements View.OnClickListener {
    public final int f5416a;
    public final org.telegram.ui.ActionBar.k3[] f5417b;

    public sa(org.telegram.ui.ActionBar.k3[] k3VarArr, int i10) {
        this.f5416a = i10;
        this.f5417b = k3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5416a) {
            case 0:
                this.f5417b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = this.f5417b[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f5417b[0].dismiss();
                return;
        }
    }
}
