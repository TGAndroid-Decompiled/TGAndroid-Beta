package ai;

import android.view.View;
public final class ta implements View.OnClickListener {
    public final int f2224a;
    public final org.telegram.ui.ActionBar.h3[] f2225b;

    public ta(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f2224a = i10;
        this.f2225b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2224a) {
            case 0:
                this.f2225b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = this.f2225b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f2225b[0].dismiss();
                return;
        }
    }
}
