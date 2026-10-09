package bi;

import ai.v8;
import android.view.View;
import org.telegram.ui.Components.qs0;
public final class e implements View.OnClickListener {
    public final int f3897a;
    public final u f3898b;

    public e(u uVar, int i10) {
        this.f3897a = i10;
        this.f3898b = uVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f3897a) {
            case 0:
                u uVar = this.f3898b;
                qs0 qs0Var = uVar.W;
                v8 v8Var = uVar.f3923a;
                if (v8Var == null) {
                    str = "";
                } else {
                    str = v8Var.E;
                }
                qs0Var.a(str);
                return;
            default:
                u uVar2 = this.f3898b;
                uVar2.W.b(uVar2.f3923a.E);
                return;
        }
    }
}
