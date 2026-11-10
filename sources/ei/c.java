package ei;

import android.view.View;
import di.k6;
import org.telegram.ui.Components.sp0;
public final class c implements View.OnClickListener {
    public final int f10816a;
    public final n f10817b;

    public c(n nVar, int i7) {
        this.f10816a = i7;
        this.f10817b = nVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f10816a) {
            case 0:
                n nVar = this.f10817b;
                sp0 sp0Var = nVar.W;
                k6 k6Var = nVar.f10834a;
                if (k6Var == null) {
                    str = "";
                } else {
                    str = k6Var.E;
                }
                sp0Var.a(str);
                return;
            default:
                n nVar2 = this.f10817b;
                nVar2.W.b(nVar2.f10834a.E);
                return;
        }
    }
}
