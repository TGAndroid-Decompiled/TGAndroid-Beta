package defpackage;

import android.view.View;
public final class a7 implements View.OnClickListener {
    public final byte a;
    public final b8 b;

    public a7(b8 b8Var, byte b) {
        this.a = b;
        this.b = b8Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        b8 b8Var = this.b;
        switch (b) {
            case 0:
                b8Var.b();
                return;
            default:
                b8Var.b();
                return;
        }
    }
}
