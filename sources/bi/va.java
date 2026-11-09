package bi;

import android.view.View;
public final class va implements View.OnClickListener {
    public final int f4919a;
    public final org.telegram.ui.ActionBar.v2[] f4920b;

    public va(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f4919a = i7;
        this.f4920b = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4919a) {
            case 0:
                this.f4920b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.v2 v2Var = this.f4920b[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    return;
                }
                return;
            default:
                this.f4920b[0].dismiss();
                return;
        }
    }
}
