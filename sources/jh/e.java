package jh;

import android.view.View;
import ih.f6;
import org.telegram.ui.Components.uq0;
public final class e implements View.OnClickListener {
    public final int f14347a;
    public final q f14348b;

    public e(q qVar, int i9) {
        this.f14347a = i9;
        this.f14348b = qVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f14347a) {
            case 0:
                q qVar = this.f14348b;
                uq0 uq0Var = qVar.S;
                f6 f6Var = qVar.f14363a;
                if (f6Var == null) {
                    str = "";
                } else {
                    str = f6Var.E;
                }
                uq0Var.a(str);
                return;
            default:
                q qVar2 = this.f14348b;
                qVar2.S.b(qVar2.f14363a.E);
                return;
        }
    }
}
