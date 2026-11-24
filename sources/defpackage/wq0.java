package defpackage;

import android.view.View;
public final class wq0 implements View.OnClickListener {
    public final byte a;
    public final gr0 b;

    public wq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override
    public final void onClick(View view) {
        String str;
        byte b = this.a;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                kca kcaVar = gr0Var.a0;
                s1b s1bVar = gr0Var.a;
                if (s1bVar == null) {
                    str = "";
                } else {
                    str = s1bVar.E;
                }
                kcaVar.a(str);
                return;
            default:
                gr0Var.a0.b(gr0Var.a.E);
                return;
        }
    }
}
