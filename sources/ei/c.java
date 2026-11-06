package ei;

import android.view.View;
import di.j6;
import org.telegram.ui.Components.sp0;
public final class c implements View.OnClickListener {
    public final int f10811a;
    public final n f10812b;

    public c(n nVar, int i7) {
        this.f10811a = i7;
        this.f10812b = nVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f10811a) {
            case 0:
                n nVar = this.f10812b;
                sp0 sp0Var = nVar.W;
                j6 j6Var = nVar.f10829a;
                if (j6Var == null) {
                    str = "";
                } else {
                    str = j6Var.E;
                }
                sp0Var.a(str);
                return;
            default:
                n nVar2 = this.f10812b;
                nVar2.W.b(nVar2.f10829a.E);
                return;
        }
    }
}
