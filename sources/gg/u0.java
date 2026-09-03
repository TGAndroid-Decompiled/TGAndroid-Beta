package gg;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f6749a;
    public final b1 f6750b;

    public u0(b1 b1Var, int i10) {
        this.f6749a = i10;
        this.f6750b = b1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6749a) {
            case 0:
                ig.s sVar = this.f6750b.f6553d0.f7060r;
                if (sVar != null) {
                    sVar.setPaused(false);
                    return;
                }
                return;
            default:
                ig.s sVar2 = this.f6750b.f6553d0.f7060r;
                if (sVar2 != null) {
                    sVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
