package ai;

import android.content.Context;
import android.view.View;
import ci.nb;
public final class u implements View.OnClickListener {
    public final int f994a;
    public final Context f995b;
    public final org.telegram.ui.ActionBar.e6 f996c;

    public u(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f994a = i3;
        this.f995b = context;
        this.f996c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f994a) {
            case 0:
                new nb(this.f995b, this.f996c).show();
                return;
            case 1:
                new nb(this.f995b, this.f996c).show();
                return;
            default:
                new nb(this.f995b, this.f996c).show();
                return;
        }
    }
}
