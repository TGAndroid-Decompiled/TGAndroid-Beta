package defpackage;

import android.view.View;
public final class j25 implements View.OnClickListener {
    public final byte a;
    public final cj7 b;

    public j25(cj7 cj7Var, byte b) {
        this.a = b;
        this.b = cj7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        cj7 cj7Var = this.b;
        switch (b) {
            case 0:
                cj7Var.dismiss();
                return;
            default:
                cj7Var.dismiss();
                return;
        }
    }
}
