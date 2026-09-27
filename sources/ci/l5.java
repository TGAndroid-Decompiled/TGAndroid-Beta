package ci;

import android.content.DialogInterface;
public final class l5 implements DialogInterface.OnDismissListener {
    public final int f5097a;
    public final q6 f5098b;

    public l5(q6 q6Var, int i10) {
        this.f5097a = i10;
        this.f5098b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5097a) {
            case 0:
                this.f5098b.z0(false);
                return;
            default:
                this.f5098b.z0(false);
                return;
        }
    }
}
