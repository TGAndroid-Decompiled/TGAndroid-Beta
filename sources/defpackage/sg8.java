package defpackage;

import android.view.View;
public final class sg8 implements View.OnClickListener {
    public final byte a;
    public final bu5 b;

    public sg8(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                u31.e();
                bu5Var.r();
                return;
            default:
                u31.e();
                bu5Var.r();
                return;
        }
    }
}
