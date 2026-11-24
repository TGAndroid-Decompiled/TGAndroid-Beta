package defpackage;

import android.view.View;
public final class ht6 implements View.OnClickListener {
    public final byte a;
    public final rt6 b;

    public ht6(rt6 rt6Var, byte b) {
        this.a = b;
        this.b = rt6Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rt6 rt6Var = this.b;
        switch (b) {
            case 0:
                rt6Var.dismiss();
                return;
            default:
                if (rt6Var.r.g()) {
                    rt6Var.f.getClass();
                    gu6.j(2);
                }
                rt6Var.dismiss();
                return;
        }
    }
}
