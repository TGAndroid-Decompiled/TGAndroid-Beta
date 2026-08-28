package bg;

import android.content.DialogInterface;
public final class a1 implements DialogInterface.OnDismissListener {
    public final int f1693a;
    public final h1 f1694b;

    public a1(h1 h1Var, int i9) {
        this.f1693a = i9;
        this.f1694b = h1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1693a) {
            case 0:
                dg.u uVar = this.f1694b.f1810c0.f2391r;
                if (uVar != null) {
                    uVar.setPaused(false);
                    return;
                }
                return;
            default:
                dg.u uVar2 = this.f1694b.f1810c0.f2391r;
                if (uVar2 != null) {
                    uVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
