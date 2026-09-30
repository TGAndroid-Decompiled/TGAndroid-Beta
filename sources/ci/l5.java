package ci;

import android.content.DialogInterface;
public final class l5 implements DialogInterface.OnDismissListener {
    public final int f4958a;
    public final q6 f4959b;

    public l5(q6 q6Var, int i10) {
        this.f4958a = i10;
        this.f4959b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4958a) {
            case 0:
                this.f4959b.z0(false);
                return;
            default:
                this.f4959b.z0(false);
                return;
        }
    }
}
