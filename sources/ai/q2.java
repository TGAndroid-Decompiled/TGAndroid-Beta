package ai;

import android.view.View;
public final class q2 implements View.OnClickListener {
    public final int f1490a;
    public final org.telegram.ui.ActionBar.u2[] f1491b;

    public q2(org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f1490a = i7;
        this.f1491b = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1490a) {
            case 0:
                org.telegram.ui.ActionBar.u2 u2Var = this.f1491b[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    return;
                }
                return;
            case 1:
                this.f1491b[0].dismiss();
                return;
            case 2:
                org.telegram.ui.ActionBar.u2 u2Var2 = this.f1491b[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    return;
                }
                return;
            default:
                this.f1491b[0].dismiss();
                return;
        }
    }
}
