package ei;

import android.view.View;
import di.s6;
import org.telegram.ui.Components.vs0;
public final class e implements View.OnClickListener {
    public final int f9982a;
    public final r f9983b;

    public e(r rVar, int i10) {
        this.f9982a = i10;
        this.f9983b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f9982a) {
            case 0:
                r rVar = this.f9983b;
                vs0 vs0Var = rVar.W;
                s6 s6Var = rVar.f10000a;
                if (s6Var == null) {
                    str = "";
                } else {
                    str = s6Var.E;
                }
                vs0Var.a(str);
                return;
            default:
                r rVar2 = this.f9983b;
                rVar2.W.b(rVar2.f10000a.E);
                return;
        }
    }
}
