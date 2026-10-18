package di;

import android.view.View;
import ci.s6;
import org.telegram.ui.Components.hs0;
public final class e implements View.OnClickListener {
    public final int f8037a;
    public final r f8038b;

    public e(r rVar, int i10) {
        this.f8037a = i10;
        this.f8038b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f8037a) {
            case 0:
                r rVar = this.f8038b;
                hs0 hs0Var = rVar.W;
                s6 s6Var = rVar.f8055a;
                if (s6Var == null) {
                    str = "";
                } else {
                    str = s6Var.E;
                }
                hs0Var.a(str);
                return;
            default:
                r rVar2 = this.f8038b;
                rVar2.W.b(rVar2.f8055a.E);
                return;
        }
    }
}
