package ci;

import android.content.DialogInterface;
public final class l5 implements DialogInterface.OnDismissListener {
    public final int f5492a;
    public final q6 f5493b;

    public l5(q6 q6Var, int i10) {
        this.f5492a = i10;
        this.f5493b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5492a) {
            case 0:
                this.f5493b.z0(false);
                return;
            default:
                this.f5493b.z0(false);
                return;
        }
    }
}
