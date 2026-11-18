package bi;

import android.content.Context;
import android.view.View;
import di.gb;
public final class p implements View.OnClickListener {
    public final int f3956a;
    public final Context f3957b;
    public final org.telegram.ui.ActionBar.i6 f3958c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3956a = i7;
        this.f3957b = context;
        this.f3958c = i6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3956a) {
            case 0:
                new gb(this.f3957b, this.f3958c).show();
                return;
            case 1:
                new gb(this.f3957b, this.f3958c).show();
                return;
            default:
                new gb(this.f3957b, this.f3958c).show();
                return;
        }
    }
}
