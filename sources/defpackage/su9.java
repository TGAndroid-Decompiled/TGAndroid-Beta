package defpackage;

import android.view.View;
public final class su9 implements View.OnClickListener {
    public final byte a;
    public final xu9 b;

    public su9(xu9 xu9Var, byte b) {
        this.a = b;
        this.b = xu9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xu9 xu9Var = this.b;
        switch (b) {
            case 0:
                xu9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
            default:
                xu9Var.f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
        }
    }
}
