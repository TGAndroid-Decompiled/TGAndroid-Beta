package defpackage;

import android.view.View;
public final class gy9 implements View.OnClickListener {
    public final byte a;
    public final ky9 b;

    public gy9(ky9 ky9Var, byte b) {
        this.a = b;
        this.b = ky9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ky9 ky9Var = this.b;
        switch (b) {
            case 0:
                if (ky9Var.Z == null) {
                    ky9Var.dismiss();
                    return;
                }
                return;
            default:
                ky9Var.dismiss();
                return;
        }
    }
}
