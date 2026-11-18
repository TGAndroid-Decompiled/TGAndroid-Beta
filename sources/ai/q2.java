package ai;

import android.view.View;
public final class q2 implements View.OnClickListener {
    public final int f1482a;
    public final org.telegram.ui.ActionBar.x2[] f1483b;

    public q2(org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.f1482a = i7;
        this.f1483b = x2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1482a) {
            case 0:
                org.telegram.ui.ActionBar.x2 x2Var = this.f1483b[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    return;
                }
                return;
            case 1:
                this.f1483b[0].dismiss();
                return;
            case 2:
                org.telegram.ui.ActionBar.x2 x2Var2 = this.f1483b[0];
                if (x2Var2 != null) {
                    x2Var2.dismiss();
                    return;
                }
                return;
            default:
                this.f1483b[0].dismiss();
                return;
        }
    }
}
