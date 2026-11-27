package defpackage;

import android.view.View;
public final class e45 implements View.OnClickListener {
    public final byte a;
    public final jl7 b;

    public e45(jl7 jl7Var, byte b) {
        this.a = b;
        this.b = jl7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        jl7 jl7Var = this.b;
        switch (b) {
            case 0:
                jl7Var.dismiss();
                return;
            default:
                jl7Var.dismiss();
                return;
        }
    }
}
