package bi;

import android.content.Context;
import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f3961a;
    public final Context f3962b;
    public final org.telegram.ui.ActionBar.h6 f3963c;

    public gd(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3961a = i7;
        this.f3962b = context;
        this.f3963c = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3961a) {
            case 0:
                new uc(this.f3962b, this.f3963c).show();
                return;
            case 1:
                new uc(this.f3962b, this.f3963c).show();
                return;
            default:
                new uc(this.f3962b, this.f3963c).show();
                return;
        }
    }
}
