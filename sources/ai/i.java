package ai;

import android.view.View;
import org.telegram.ui.Components.vr0;
import zh.s4;
public final class i implements View.OnClickListener {
    public final int f453a;
    public final a0 f454b;

    public i(a0 a0Var, int i10) {
        this.f453a = i10;
        this.f454b = a0Var;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f453a) {
            case 0:
                a0 a0Var = this.f454b;
                vr0 vr0Var = a0Var.W;
                s4 s4Var = a0Var.f411a;
                if (s4Var == null) {
                    str = "";
                } else {
                    str = s4Var.E;
                }
                vr0Var.a(str);
                return;
            default:
                a0 a0Var2 = this.f454b;
                a0Var2.W.b(a0Var2.f411a.E);
                return;
        }
    }
}
