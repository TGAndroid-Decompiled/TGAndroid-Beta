package defpackage;

import android.view.View;
public final class lu9 implements View.OnClickListener {
    public final byte a;
    public final qu9 b;

    public lu9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 0:
                if (qu9Var.Z == null) {
                    qu9Var.dismiss();
                    return;
                }
                return;
            default:
                qu9Var.dismiss();
                return;
        }
    }
}
