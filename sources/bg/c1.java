package bg;

import android.content.DialogInterface;
public final class c1 implements DialogInterface.OnShowListener {
    public final int f1717a;
    public final h1 f1718b;

    public c1(h1 h1Var, int i9) {
        this.f1717a = i9;
        this.f1718b = h1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f1717a) {
            case 0:
                dg.u uVar = this.f1718b.f1810c0.f2391r;
                if (uVar != null) {
                    uVar.setPaused(true);
                    return;
                }
                return;
            default:
                dg.u uVar2 = this.f1718b.f1810c0.f2391r;
                if (uVar2 != null) {
                    uVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
