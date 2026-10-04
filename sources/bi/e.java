package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.ds0;
public final class e implements View.OnClickListener {
    public final int f3847a;
    public final u f3848b;

    public e(u uVar, int i10) {
        this.f3847a = i10;
        this.f3848b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3847a) {
            case 0:
                u uVar = this.f3848b;
                ds0 ds0Var = uVar.W;
                u8 u8Var = uVar.f3873a;
                if (u8Var == null) {
                    str = "";
                } else {
                    str = u8Var.E;
                }
                ds0Var.a(str);
                return;
            default:
                u uVar2 = this.f3848b;
                uVar2.W.b(uVar2.f3873a.E);
                return;
        }
    }
}
