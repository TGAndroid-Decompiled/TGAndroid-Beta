package ci;

import android.view.View;
import bi.f8;
import org.telegram.ui.Components.ms0;
public final class e implements View.OnClickListener {
    public final int f4759a;
    public final t f4760b;

    public e(t tVar, int i10) {
        this.f4759a = i10;
        this.f4760b = tVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f4759a) {
            case 0:
                t tVar = this.f4760b;
                ms0 ms0Var = tVar.W;
                f8 f8Var = tVar.f4780a;
                if (f8Var == null) {
                    str = "";
                } else {
                    str = f8Var.E;
                }
                ms0Var.a(str);
                return;
            default:
                t tVar2 = this.f4760b;
                tVar2.W.b(tVar2.f4780a.E);
                return;
        }
    }
}
