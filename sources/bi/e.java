package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.mr0;
public final class e implements View.OnClickListener {
    public final int f3564a;
    public final u f3565b;

    public e(u uVar, int i10) {
        this.f3564a = i10;
        this.f3565b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3564a) {
            case 0:
                u uVar = this.f3565b;
                mr0 mr0Var = uVar.W;
                t8 t8Var = uVar.f3588a;
                if (t8Var == null) {
                    str = "";
                } else {
                    str = t8Var.E;
                }
                mr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3565b;
                uVar2.W.b(uVar2.f3588a.E);
                return;
        }
    }
}
