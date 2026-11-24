package defpackage;

import android.view.View;
public final class vl4 implements View.OnClickListener {
    public final byte a;
    public final fm4 b;

    public vl4(fm4 fm4Var, byte b) {
        this.a = b;
        this.b = fm4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        fm4 fm4Var = this.b;
        switch (b) {
            case 0:
                fm4Var.f();
                return;
            case 1:
                fm4Var.f();
                return;
            default:
                fm4Var.f();
                return;
        }
    }
}
