package defpackage;

import android.view.View;
public final class vy9 implements View.OnClickListener {
    public final byte a;
    public final zy9 b;

    public vy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                zy9Var.Z1.clear();
                zy9Var.T1.d.b(true);
                zy9Var.i1(true, false);
                return;
            default:
                zy9Var.d1(false);
                return;
        }
    }
}
