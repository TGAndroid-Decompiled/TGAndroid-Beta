package mh;

import android.view.View;
import lh.c6;
import org.telegram.ui.Components.fr0;
public final class e implements View.OnClickListener {
    public final int f17023a;
    public final r f17024b;

    public e(r rVar, int i10) {
        this.f17023a = i10;
        this.f17024b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f17023a) {
            case 0:
                r rVar = this.f17024b;
                fr0 fr0Var = rVar.S;
                c6 c6Var = rVar.f17041a;
                if (c6Var == null) {
                    str = "";
                } else {
                    str = c6Var.E;
                }
                fr0Var.a(str);
                return;
            default:
                r rVar2 = this.f17024b;
                rVar2.S.b(rVar2.f17041a.E);
                return;
        }
    }
}
