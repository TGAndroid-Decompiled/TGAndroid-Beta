package oh;

import android.view.View;
import nh.d6;
import org.telegram.ui.Components.nr0;
public final class e implements View.OnClickListener {
    public final int f16585a;
    public final r f16586b;

    public e(r rVar, int i10) {
        this.f16585a = i10;
        this.f16586b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f16585a) {
            case 0:
                r rVar = this.f16586b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.f16601a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            default:
                r rVar2 = this.f16586b;
                rVar2.T.b(rVar2.f16601a.E);
                return;
        }
    }
}
