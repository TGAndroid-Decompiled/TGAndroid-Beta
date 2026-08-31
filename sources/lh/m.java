package lh;

import android.content.Context;
import android.view.View;
import mh.aa;
import org.telegram.ui.ActionBar.g6;
public final class m implements View.OnClickListener {
    public final int f12843a;
    public final Context f12844b;
    public final g6 f12845c;

    public m(Context context, int i10, g6 g6Var) {
        this.f12843a = i10;
        this.f12844b = context;
        this.f12845c = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12843a) {
            case 0:
                new aa(this.f12844b, this.f12845c).show();
                return;
            case 1:
                new aa(this.f12844b, this.f12845c).show();
                return;
            default:
                new aa(this.f12844b, this.f12845c).show();
                return;
        }
    }
}
