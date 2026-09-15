package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.mr0;
public final class e implements View.OnClickListener {
    public final int f3562a;
    public final u f3563b;

    public e(u uVar, int i10) {
        this.f3562a = i10;
        this.f3563b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3562a) {
            case 0:
                u uVar = this.f3563b;
                mr0 mr0Var = uVar.W;
                t8 t8Var = uVar.f3586a;
                if (t8Var == null) {
                    str = "";
                } else {
                    str = t8Var.E;
                }
                mr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3563b;
                uVar2.W.b(uVar2.f3586a.E);
                return;
        }
    }
}
