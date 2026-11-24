package defpackage;

import android.view.View;
public final class zq9 implements View.OnClickListener {
    public final byte a;
    public final er9 b;

    public zq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
            default:
                er9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
        }
    }
}
