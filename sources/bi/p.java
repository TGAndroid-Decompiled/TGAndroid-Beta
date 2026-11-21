package bi;

import android.content.Context;
import android.view.View;
import di.gb;
public final class p implements View.OnClickListener {
    public final int f3984a;
    public final Context f3985b;
    public final org.telegram.ui.ActionBar.h6 f3986c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3984a = i7;
        this.f3985b = context;
        this.f3986c = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3984a) {
            case 0:
                new gb(this.f3985b, this.f3986c).show();
                return;
            case 1:
                new gb(this.f3985b, this.f3986c).show();
                return;
            default:
                new gb(this.f3985b, this.f3986c).show();
                return;
        }
    }
}
