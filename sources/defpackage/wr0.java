package defpackage;

import android.view.View;
public final class wr0 implements View.OnClickListener {
    public final byte a;
    public final gs0 b;

    public wr0(gs0 gs0Var, byte b) {
        this.a = b;
        this.b = gs0Var;
    }

    @Override
    public final void onClick(View view) {
        String str;
        byte b = this.a;
        gs0 gs0Var = this.b;
        switch (b) {
            case 0:
                kea keaVar = gs0Var.a0;
                t3b t3bVar = gs0Var.a;
                if (t3bVar == null) {
                    str = "";
                } else {
                    str = t3bVar.E;
                }
                keaVar.a(str);
                return;
            default:
                gs0Var.a0.b(gs0Var.a.E);
                return;
        }
    }
}
