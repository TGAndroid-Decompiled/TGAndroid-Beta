package gg;

import android.content.DialogInterface;
public final class w0 implements DialogInterface.OnShowListener {
    public final int f6802a;
    public final b1 f6803b;

    public w0(b1 b1Var, int i10) {
        this.f6802a = i10;
        this.f6803b = b1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f6802a) {
            case 0:
                ig.s sVar = this.f6803b.f6566d0.f7077r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    return;
                }
                return;
            default:
                ig.s sVar2 = this.f6803b.f6566d0.f7077r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
