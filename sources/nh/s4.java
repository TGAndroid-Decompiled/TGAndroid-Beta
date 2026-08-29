package nh;

import android.content.DialogInterface;
public final class s4 implements DialogInterface.OnDismissListener {
    public final int f18546a;
    public final t5 f18547b;

    public s4(t5 t5Var, int i10) {
        this.f18546a = i10;
        this.f18547b = t5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18546a) {
            case 0:
                this.f18547b.z0(false);
                return;
            default:
                this.f18547b.z0(false);
                return;
        }
    }
}
