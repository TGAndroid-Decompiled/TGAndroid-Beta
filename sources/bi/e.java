package bi;

import ai.v8;
import android.view.View;
import org.telegram.ui.Components.ws0;
public final class e implements View.OnClickListener {
    public final int f3896a;
    public final u f3897b;

    public e(u uVar, int i10) {
        this.f3896a = i10;
        this.f3897b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3896a) {
            case 0:
                u uVar = this.f3897b;
                ws0 ws0Var = uVar.W;
                v8 v8Var = uVar.f3922a;
                if (v8Var == null) {
                    str = "";
                } else {
                    str = v8Var.E;
                }
                ws0Var.a(str);
                return;
            default:
                u uVar2 = this.f3897b;
                uVar2.W.b(uVar2.f3922a.E);
                return;
        }
    }
}
