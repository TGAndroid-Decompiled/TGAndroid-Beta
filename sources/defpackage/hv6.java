package defpackage;

import android.view.View;
public final class hv6 implements View.OnClickListener {
    public final byte a;
    public final rv6 b;

    public hv6(rv6 rv6Var, byte b) {
        this.a = b;
        this.b = rv6Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rv6 rv6Var = this.b;
        switch (b) {
            case 0:
                rv6Var.dismiss();
                return;
            default:
                if (rv6Var.r.g()) {
                    rv6Var.f.getClass();
                    gw6.j(2);
                }
                rv6Var.dismiss();
                return;
        }
    }
}
