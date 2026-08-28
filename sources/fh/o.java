package fh;

import android.content.Context;
import android.view.View;
import gh.fa;
public final class o implements View.OnClickListener {
    public final int f6646a;
    public final Context f6647b;
    public final org.telegram.ui.ActionBar.b6 f6648c;

    public o(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f6646a = i9;
        this.f6647b = context;
        this.f6648c = b6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6646a) {
            case 0:
                new fa(this.f6647b, this.f6648c).show();
                return;
            case 1:
                new fa(this.f6647b, this.f6648c).show();
                return;
            default:
                new fa(this.f6647b, this.f6648c).show();
                return;
        }
    }
}
