package di;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f7640a;
    public final q6 f7641b;

    public m5(q6 q6Var, int i10) {
        this.f7640a = i10;
        this.f7641b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7640a) {
            case 0:
                this.f7641b.z0(false);
                return;
            default:
                this.f7641b.z0(false);
                return;
        }
    }
}
