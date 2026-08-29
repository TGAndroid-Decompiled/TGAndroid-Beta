package ih;

import android.content.Context;
import android.view.View;
import jh.z9;
public final class n implements View.OnClickListener {
    public final int f9285a;
    public final Context f9286b;
    public final org.telegram.ui.ActionBar.c6 f9287c;

    public n(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f9285a = i10;
        this.f9286b = context;
        this.f9287c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9285a) {
            case 0:
                new z9(this.f9286b, this.f9287c).show();
                return;
            case 1:
                new z9(this.f9286b, this.f9287c).show();
                return;
            default:
                new z9(this.f9286b, this.f9287c).show();
                return;
        }
    }
}
