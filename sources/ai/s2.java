package ai;

import android.view.View;
public final class s2 implements View.OnClickListener {
    public final int f1506a;
    public final org.telegram.ui.ActionBar.w2[] f1507b;

    public s2(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f1506a = i7;
        this.f1507b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1506a) {
            case 0:
                org.telegram.ui.ActionBar.w2 w2Var = this.f1507b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    return;
                }
                return;
            case 1:
                this.f1507b[0].dismiss();
                return;
            case 2:
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f1507b[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    return;
                }
                return;
            default:
                this.f1507b[0].dismiss();
                return;
        }
    }
}
