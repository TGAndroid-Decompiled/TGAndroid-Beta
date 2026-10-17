package di;

import android.view.View;
import ci.t6;
import org.telegram.ui.Components.hs0;
public final class e implements View.OnClickListener {
    public final int f8038a;
    public final r f8039b;

    public e(r rVar, int i10) {
        this.f8038a = i10;
        this.f8039b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f8038a) {
            case 0:
                r rVar = this.f8039b;
                hs0 hs0Var = rVar.W;
                t6 t6Var = rVar.f8056a;
                if (t6Var == null) {
                    str = "";
                } else {
                    str = t6Var.E;
                }
                hs0Var.a(str);
                return;
            default:
                r rVar2 = this.f8039b;
                rVar2.W.b(rVar2.f8056a.E);
                return;
        }
    }
}
