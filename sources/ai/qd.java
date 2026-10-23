package ai;

import android.content.Context;
import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f2095a;
    public final Context f2096b;
    public final org.telegram.ui.ActionBar.g6 f2097c;

    public qd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f2095a = i10;
        this.f2096b = context;
        this.f2097c = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2095a) {
            case 0:
                new ed(this.f2096b, this.f2097c).show();
                return;
            case 1:
                new ed(this.f2096b, this.f2097c).show();
                return;
            default:
                new ed(this.f2096b, this.f2097c).show();
                return;
        }
    }
}
