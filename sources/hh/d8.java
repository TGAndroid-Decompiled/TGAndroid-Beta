package hh;

import android.view.View;

public final class d8 implements View.OnClickListener {

    public final int f9137a;

    public final org.telegram.ui.ActionBar.e3[] f9138b;

    public d8(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f9137a = i10;
        this.f9138b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9137a) {
            case 0:
                this.f9138b[0].dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f9138b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                break;
            default:
                this.f9138b[0].dismiss();
                break;
        }
    }
}
