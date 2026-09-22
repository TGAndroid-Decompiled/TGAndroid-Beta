package bi;

import ai.t8;
import android.view.View;
import org.telegram.ui.Components.zr0;
public final class e implements View.OnClickListener {
    public final int f3566a;
    public final u f3567b;

    public e(u uVar, int i10) {
        this.f3566a = i10;
        this.f3567b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3566a) {
            case 0:
                u uVar = this.f3567b;
                zr0 zr0Var = uVar.W;
                t8 t8Var = uVar.f3590a;
                if (t8Var == null) {
                    str = "";
                } else {
                    str = t8Var.E;
                }
                zr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3567b;
                uVar2.W.b(uVar2.f3590a.E);
                return;
        }
    }
}
