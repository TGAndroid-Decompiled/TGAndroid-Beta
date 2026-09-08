package di;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f7668a;
    public final q6 f7669b;

    public m5(q6 q6Var, int i10) {
        this.f7668a = i10;
        this.f7669b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7668a) {
            case 0:
                this.f7669b.z0(false);
                return;
            default:
                this.f7669b.z0(false);
                return;
        }
    }
}
