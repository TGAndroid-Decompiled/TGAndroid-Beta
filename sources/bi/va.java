package bi;

import android.view.View;
public final class va implements View.OnClickListener {
    public final int f4921a;
    public final org.telegram.ui.ActionBar.v2[] f4922b;

    public va(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f4921a = i7;
        this.f4922b = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4921a) {
            case 0:
                this.f4922b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.v2 v2Var = this.f4922b[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    return;
                }
                return;
            default:
                this.f4922b[0].dismiss();
                return;
        }
    }
}
