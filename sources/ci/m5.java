package ci;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f5042a;
    public final r6 f5043b;

    public m5(r6 r6Var, int i10) {
        this.f5042a = i10;
        this.f5043b = r6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5042a) {
            case 0:
                this.f5043b.z0(false);
                return;
            default:
                this.f5043b.z0(false);
                return;
        }
    }
}
