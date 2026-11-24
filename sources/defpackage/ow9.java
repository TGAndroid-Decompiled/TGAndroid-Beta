package defpackage;

import android.view.View;
public final class ow9 implements View.OnClickListener {
    public final byte a;
    public final tw9 b;

    public ow9(tw9 tw9Var, byte b) {
        this.a = b;
        this.b = tw9Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        tw9 tw9Var = this.b;
        switch (b) {
            case 0:
                if (tw9Var.Z == null) {
                    tw9Var.dismiss();
                    return;
                }
                return;
            default:
                tw9Var.dismiss();
                return;
        }
    }
}
