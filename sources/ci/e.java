package ci;

import android.view.View;
import bi.f8;
import org.telegram.ui.Components.ms0;
public final class e implements View.OnClickListener {
    public final int f4762a;
    public final t f4763b;

    public e(t tVar, int i10) {
        this.f4762a = i10;
        this.f4763b = tVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f4762a) {
            case 0:
                t tVar = this.f4763b;
                ms0 ms0Var = tVar.W;
                f8 f8Var = tVar.f4783a;
                if (f8Var == null) {
                    str = "";
                } else {
                    str = f8Var.E;
                }
                ms0Var.a(str);
                return;
            default:
                t tVar2 = this.f4763b;
                tVar2.W.b(tVar2.f4783a.E);
                return;
        }
    }
}
