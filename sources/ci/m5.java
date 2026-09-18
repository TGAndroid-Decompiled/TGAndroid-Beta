package ci;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f5041a;
    public final r6 f5042b;

    public m5(r6 r6Var, int i10) {
        this.f5041a = i10;
        this.f5042b = r6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5041a) {
            case 0:
                this.f5042b.z0(false);
                return;
            default:
                this.f5042b.z0(false);
                return;
        }
    }
}
