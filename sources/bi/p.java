package bi;

import android.content.Context;
import android.view.View;
import di.db;
public final class p implements View.OnClickListener {
    public final int f3773a;
    public final Context f3774b;
    public final org.telegram.ui.ActionBar.e6 f3775c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f3773a = i7;
        this.f3774b = context;
        this.f3775c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3773a) {
            case 0:
                new db(this.f3774b, this.f3775c).show();
                return;
            case 1:
                new db(this.f3774b, this.f3775c).show();
                return;
            default:
                new db(this.f3774b, this.f3775c).show();
                return;
        }
    }
}
