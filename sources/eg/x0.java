package eg;

import android.content.DialogInterface;
public final class x0 implements DialogInterface.OnShowListener {
    public final int f6188a;
    public final c1 f6189b;

    public x0(c1 c1Var, int i10) {
        this.f6188a = i10;
        this.f6189b = c1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f6188a) {
            case 0:
                gg.s sVar = this.f6189b.f5937c0.f6730r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    return;
                }
                return;
            default:
                gg.s sVar2 = this.f6189b.f5937c0.f6730r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
