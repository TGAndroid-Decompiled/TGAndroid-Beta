package gh;

import android.view.View;
public final class e8 implements View.OnClickListener {
    public final int f8031a;
    public final org.telegram.ui.ActionBar.f3[] f8032b;

    public e8(org.telegram.ui.ActionBar.f3[] f3VarArr, int i9) {
        this.f8031a = i9;
        this.f8032b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8031a) {
            case 0:
                this.f8032b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f8032b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f8032b[0].dismiss();
                return;
        }
    }
}
