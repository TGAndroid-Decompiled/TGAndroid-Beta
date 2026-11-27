package defpackage;

import android.view.View;
public final class zl4 implements View.OnClickListener {
    public final byte a;
    public final jm4 b;

    public zl4(jm4 jm4Var, byte b) {
        this.a = b;
        this.b = jm4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        jm4 jm4Var = this.b;
        switch (b) {
            case 0:
                jm4Var.f();
                return;
            case 1:
                jm4Var.f();
                return;
            default:
                jm4Var.f();
                return;
        }
    }
}
