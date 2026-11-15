package bi;

import android.content.Context;
import android.view.View;
import di.cb;
public final class p implements View.OnClickListener {
    public final int f3776a;
    public final Context f3777b;
    public final org.telegram.ui.ActionBar.e6 f3778c;

    public p(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f3776a = i7;
        this.f3777b = context;
        this.f3778c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3776a) {
            case 0:
                new cb(this.f3777b, this.f3778c).show();
                return;
            case 1:
                new cb(this.f3777b, this.f3778c).show();
                return;
            default:
                new cb(this.f3777b, this.f3778c).show();
                return;
        }
    }
}
