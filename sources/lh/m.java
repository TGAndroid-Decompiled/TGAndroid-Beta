package lh;

import android.content.Context;
import android.view.View;
import mh.aa;
import org.telegram.ui.ActionBar.g6;
public final class m implements View.OnClickListener {
    public final int f12845a;
    public final Context f12846b;
    public final g6 f12847c;

    public m(Context context, int i10, g6 g6Var) {
        this.f12845a = i10;
        this.f12846b = context;
        this.f12847c = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12845a) {
            case 0:
                new aa(this.f12846b, this.f12847c).show();
                return;
            case 1:
                new aa(this.f12846b, this.f12847c).show();
                return;
            default:
                new aa(this.f12846b, this.f12847c).show();
                return;
        }
    }
}
