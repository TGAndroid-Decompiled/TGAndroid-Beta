package bi;

import android.content.Context;
import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f4694a;
    public final Context f4695b;
    public final org.telegram.ui.ActionBar.u6 f4696c;

    public gd(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4694a = i10;
        this.f4695b = context;
        this.f4696c = u6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4694a) {
            case 0:
                new uc(this.f4695b, this.f4696c).show();
                return;
            case 1:
                new uc(this.f4695b, this.f4696c).show();
                return;
            default:
                new uc(this.f4695b, this.f4696c).show();
                return;
        }
    }
}
