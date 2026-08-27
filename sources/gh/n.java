package gh;

import android.content.Context;
import android.view.View;
import hh.fa;

public final class n implements View.OnClickListener {

    public final int f7456a;

    public final Context f7457b;

    public final org.telegram.ui.ActionBar.c6 f7458c;

    public n(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f7456a = i10;
        this.f7457b = context;
        this.f7458c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7456a) {
            case 0:
                new fa(this.f7457b, this.f7458c).show();
                break;
            case 1:
                new fa(this.f7457b, this.f7458c).show();
                break;
            default:
                new fa(this.f7457b, this.f7458c).show();
                break;
        }
    }
}
