package gg;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f6762a;
    public final b1 f6763b;

    public u0(b1 b1Var, int i10) {
        this.f6762a = i10;
        this.f6763b = b1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6762a) {
            case 0:
                ig.s sVar = this.f6763b.f6566d0.f7077r;
                if (sVar != null) {
                    sVar.setPaused(false);
                    return;
                }
                return;
            default:
                ig.s sVar2 = this.f6763b.f6566d0.f7077r;
                if (sVar2 != null) {
                    sVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
