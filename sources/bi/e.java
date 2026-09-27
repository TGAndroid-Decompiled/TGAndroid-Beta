package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.zr0;
public final class e implements View.OnClickListener {
    public final int f3561a;
    public final u f3562b;

    public e(u uVar, int i10) {
        this.f3561a = i10;
        this.f3562b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3561a) {
            case 0:
                u uVar = this.f3562b;
                zr0 zr0Var = uVar.W;
                u8 u8Var = uVar.f3585a;
                if (u8Var == null) {
                    str = "";
                } else {
                    str = u8Var.E;
                }
                zr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3562b;
                uVar2.W.b(uVar2.f3585a.E);
                return;
        }
    }
}
