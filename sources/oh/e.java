package oh;

import android.view.View;
import nh.d6;
import org.telegram.ui.Components.nr0;
public final class e implements View.OnClickListener {
    public final int f16565a;
    public final r f16566b;

    public e(r rVar, int i10) {
        this.f16565a = i10;
        this.f16566b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f16565a) {
            case 0:
                r rVar = this.f16566b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.f16581a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            default:
                r rVar2 = this.f16566b;
                rVar2.T.b(rVar2.f16581a.E);
                return;
        }
    }
}
