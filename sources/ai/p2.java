package ai;

import android.view.View;
public final class p2 implements View.OnClickListener {
    public final int f1482a;
    public final org.telegram.ui.ActionBar.u2[] f1483b;

    public p2(org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f1482a = i7;
        this.f1483b = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1482a) {
            case 0:
                org.telegram.ui.ActionBar.u2 u2Var = this.f1483b[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    return;
                }
                return;
            case 1:
                this.f1483b[0].dismiss();
                return;
            case 2:
                org.telegram.ui.ActionBar.u2 u2Var2 = this.f1483b[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    return;
                }
                return;
            default:
                this.f1483b[0].dismiss();
                return;
        }
    }
}
