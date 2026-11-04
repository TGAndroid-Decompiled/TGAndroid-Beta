package ci;

import android.view.View;
public final class t9 implements View.OnClickListener {
    public final int f6044a;
    public final org.telegram.ui.ActionBar.t2[] f6045b;

    public t9(org.telegram.ui.ActionBar.t2[] t2VarArr, int i3) {
        this.f6044a = i3;
        this.f6045b = t2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6044a) {
            case 0:
                this.f6045b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.t2 t2Var = this.f6045b[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    return;
                }
                return;
            default:
                this.f6045b[0].dismiss();
                return;
        }
    }
}
