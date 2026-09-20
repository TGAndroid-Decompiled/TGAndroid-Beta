package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.xr0;
public final class e implements View.OnClickListener {
    public final int f3567a;
    public final u f3568b;

    public e(u uVar, int i10) {
        this.f3567a = i10;
        this.f3568b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3567a) {
            case 0:
                u uVar = this.f3568b;
                xr0 xr0Var = uVar.W;
                t8 t8Var = uVar.f3591a;
                if (t8Var == null) {
                    str = "";
                } else {
                    str = t8Var.E;
                }
                xr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3568b;
                uVar2.W.b(uVar2.f3591a.E);
                return;
        }
    }
}
