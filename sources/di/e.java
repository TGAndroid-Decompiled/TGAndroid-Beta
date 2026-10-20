package di;

import android.view.View;
import ci.t6;
import org.telegram.ui.Components.js0;
public final class e implements View.OnClickListener {
    public final int f8036a;
    public final r f8037b;

    public e(r rVar, int i10) {
        this.f8036a = i10;
        this.f8037b = rVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f8036a) {
            case 0:
                r rVar = this.f8037b;
                js0 js0Var = rVar.W;
                t6 t6Var = rVar.f8054a;
                if (t6Var == null) {
                    str = "";
                } else {
                    str = t6Var.E;
                }
                js0Var.a(str);
                return;
            default:
                r rVar2 = this.f8037b;
                rVar2.W.b(rVar2.f8054a.E);
                return;
        }
    }
}
