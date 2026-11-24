package defpackage;

import android.view.View;
public final class j45 implements View.OnClickListener {
    public final byte a;
    public final el7 b;

    public j45(el7 el7Var, byte b) {
        this.a = b;
        this.b = el7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        el7 el7Var = this.b;
        switch (b) {
            case 0:
                el7Var.dismiss();
                return;
            default:
                el7Var.dismiss();
                return;
        }
    }
}
