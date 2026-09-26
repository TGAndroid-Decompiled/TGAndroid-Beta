package bi;

import ai.u8;
import android.view.View;
import org.telegram.ui.Components.yr0;
public final class e implements View.OnClickListener {
    public final int f3559a;
    public final u f3560b;

    public e(u uVar, int i10) {
        this.f3559a = i10;
        this.f3560b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3559a) {
            case 0:
                u uVar = this.f3560b;
                yr0 yr0Var = uVar.W;
                u8 u8Var = uVar.f3583a;
                if (u8Var == null) {
                    str = "";
                } else {
                    str = u8Var.E;
                }
                yr0Var.a(str);
                return;
            default:
                u uVar2 = this.f3560b;
                uVar2.W.b(uVar2.f3583a.E);
                return;
        }
    }
}
