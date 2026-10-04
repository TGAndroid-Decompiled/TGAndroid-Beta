package ci;

import android.content.DialogInterface;
public final class l5 implements DialogInterface.OnDismissListener {
    public final int f5491a;
    public final q6 f5492b;

    public l5(q6 q6Var, int i10) {
        this.f5491a = i10;
        this.f5492b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5491a) {
            case 0:
                this.f5492b.z0(false);
                return;
            default:
                this.f5492b.z0(false);
                return;
        }
    }
}
