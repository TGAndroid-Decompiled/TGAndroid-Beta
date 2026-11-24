package defpackage;

import android.view.View;
public final class bt9 implements View.OnClickListener {
    public final byte a;
    public final gt9 b;

    public bt9(gt9 gt9Var, byte b) {
        this.a = b;
        this.b = gt9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        gt9 gt9Var = this.b;
        switch (b) {
            case 0:
                gt9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
            default:
                gt9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
        }
    }
}
