package ci;

import android.content.DialogInterface;
public final class l5 implements DialogInterface.OnDismissListener {
    public final int f4965a;
    public final q6 f4966b;

    public l5(q6 q6Var, int i10) {
        this.f4965a = i10;
        this.f4966b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4965a) {
            case 0:
                this.f4966b.z0(false);
                return;
            default:
                this.f4966b.z0(false);
                return;
        }
    }
}
