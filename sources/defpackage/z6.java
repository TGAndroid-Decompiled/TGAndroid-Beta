package defpackage;

import android.view.View;
public final class z6 implements View.OnClickListener {
    public final byte a;
    public final a8 b;

    public z6(a8 a8Var, byte b) {
        this.a = b;
        this.b = a8Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        a8 a8Var = this.b;
        switch (b) {
            case 0:
                a8Var.b();
                return;
            default:
                a8Var.b();
                return;
        }
    }
}
