package di;

import android.view.View;
import ci.s6;
import org.telegram.ui.Components.ms0;
public final class e implements View.OnClickListener {
    public final int f8043a;
    public final r f8044b;

    public e(r rVar, int i10) {
        this.f8043a = i10;
        this.f8044b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f8043a) {
            case 0:
                r rVar = this.f8044b;
                ms0 ms0Var = rVar.W;
                s6 s6Var = rVar.f8061a;
                if (s6Var == null) {
                    str = "";
                } else {
                    str = s6Var.E;
                }
                ms0Var.a(str);
                return;
            default:
                r rVar2 = this.f8044b;
                rVar2.W.b(rVar2.f8061a.E);
                return;
        }
    }
}
