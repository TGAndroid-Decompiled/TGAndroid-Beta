package ai;

import android.view.View;
import org.telegram.ui.ActionBar.w2;
public final class j2 implements View.OnClickListener {
    public final int f1308a;
    public final w2[] f1309b;

    public j2(w2[] w2VarArr, int i7) {
        this.f1308a = i7;
        this.f1309b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1308a) {
            case 0:
                w2 w2Var = this.f1309b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    return;
                }
                return;
            case 1:
                this.f1309b[0].dismiss();
                return;
            case 2:
                w2 w2Var2 = this.f1309b[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    return;
                }
                return;
            default:
                this.f1309b[0].dismiss();
                return;
        }
    }
}
