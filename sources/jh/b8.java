package jh;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f11810a;
    public final org.telegram.ui.ActionBar.f3[] f11811b;

    public b8(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f11810a = i10;
        this.f11811b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11810a) {
            case 0:
                this.f11811b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f11811b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f11811b[0].dismiss();
                return;
        }
    }
}
