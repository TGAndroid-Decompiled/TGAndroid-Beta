package hg;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f7617a;
    public final b1 f7618b;

    public u0(b1 b1Var, int i10) {
        this.f7617a = i10;
        this.f7618b = b1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7617a) {
            case 0:
                jg.s sVar = this.f7618b.f7405d0.f8072r;
                if (sVar != null) {
                    sVar.setPaused(false);
                    return;
                }
                return;
            default:
                jg.s sVar2 = this.f7618b.f7405d0.f8072r;
                if (sVar2 != null) {
                    sVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
