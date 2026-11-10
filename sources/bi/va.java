package bi;

import android.view.View;
public final class va implements View.OnClickListener {
    public final int f4920a;
    public final org.telegram.ui.ActionBar.w2[] f4921b;

    public va(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f4920a = i7;
        this.f4921b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4920a) {
            case 0:
                this.f4921b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.w2 w2Var = this.f4921b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    return;
                }
                return;
            default:
                this.f4921b[0].dismiss();
                return;
        }
    }
}
