package bi;

import android.content.Context;
import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f3964a;
    public final Context f3965b;
    public final org.telegram.ui.ActionBar.g6 f3966c;

    public gd(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f3964a = i7;
        this.f3965b = context;
        this.f3966c = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3964a) {
            case 0:
                new uc(this.f3965b, this.f3966c).show();
                return;
            case 1:
                new uc(this.f3965b, this.f3966c).show();
                return;
            default:
                new uc(this.f3965b, this.f3966c).show();
                return;
        }
    }
}
