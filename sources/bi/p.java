package bi;

import android.content.Context;
import android.view.View;
import di.gb;
public final class p implements View.OnClickListener {
    public final int f3924a;
    public final Context f3925b;
    public final org.telegram.ui.ActionBar.h6 f3926c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3924a = i7;
        this.f3925b = context;
        this.f3926c = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3924a) {
            case 0:
                new gb(this.f3925b, this.f3926c).show();
                return;
            case 1:
                new gb(this.f3925b, this.f3926c).show();
                return;
            default:
                new gb(this.f3925b, this.f3926c).show();
                return;
        }
    }
}
