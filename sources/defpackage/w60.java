package defpackage;

import android.view.View;
public final class w60 implements View.OnClickListener {
    public final byte a;
    public final rf8 b;

    public w60(rf8 rf8Var, byte b) {
        this.a = b;
        this.b = rf8Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rf8 rf8Var = this.b;
        switch (b) {
            case 0:
                rf8Var.b(true);
                return;
            case 1:
                rf8Var.b(true);
                return;
            case 2:
                rf8Var.b(true);
                return;
            default:
                rf8Var.b(true);
                return;
        }
    }
}
