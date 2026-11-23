package bi;

import android.content.Context;
import android.view.View;
import di.gb;
public final class p implements View.OnClickListener {
    public final int f3989a;
    public final Context f3990b;
    public final org.telegram.ui.ActionBar.h6 f3991c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3989a = i7;
        this.f3990b = context;
        this.f3991c = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3989a) {
            case 0:
                new gb(this.f3990b, this.f3991c).show();
                return;
            case 1:
                new gb(this.f3990b, this.f3991c).show();
                return;
            default:
                new gb(this.f3990b, this.f3991c).show();
                return;
        }
    }
}
