package defpackage;

import android.view.View;
public final class mv6 implements View.OnClickListener {
    public final byte a;
    public final wv6 b;

    public mv6(wv6 wv6Var, byte b) {
        this.a = b;
        this.b = wv6Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        wv6 wv6Var = this.b;
        switch (b) {
            case 0:
                wv6Var.dismiss();
                return;
            default:
                if (wv6Var.r.g()) {
                    wv6Var.f.getClass();
                    lw6.j(2);
                }
                wv6Var.dismiss();
                return;
        }
    }
}
