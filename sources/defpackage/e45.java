package defpackage;

import android.view.View;
public final class e45 implements View.OnClickListener {
    public final byte a;
    public final kl7 b;

    public e45(kl7 kl7Var, byte b) {
        this.a = b;
        this.b = kl7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        kl7 kl7Var = this.b;
        switch (b) {
            case 0:
                kl7Var.dismiss();
                return;
            default:
                kl7Var.dismiss();
                return;
        }
    }
}
