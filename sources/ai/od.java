package ai;

import android.content.Context;
import android.view.View;
public final class od implements View.OnClickListener {
    public final int f1986a;
    public final Context f1987b;
    public final org.telegram.ui.ActionBar.d6 f1988c;

    public od(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1986a = i10;
        this.f1987b = context;
        this.f1988c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1986a) {
            case 0:
                new cd(this.f1987b, this.f1988c).show();
                return;
            case 1:
                new cd(this.f1987b, this.f1988c).show();
                return;
            default:
                new cd(this.f1987b, this.f1988c).show();
                return;
        }
    }
}
