package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.as0;
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
                as0 as0Var = uVar.W;
                u8 u8Var = uVar.f3590a;
                if (u8Var == null) {
                    str = "";
                } else {
                    str = u8Var.E;
                }
                as0Var.a(str);
                return;
            default:
                u uVar2 = this.f3567b;
                uVar2.W.b(uVar2.f3590a.E);
                return;
        }
    }
}
