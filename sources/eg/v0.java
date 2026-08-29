package eg;

import android.content.DialogInterface;
public final class v0 implements DialogInterface.OnDismissListener {
    public final int f6147a;
    public final c1 f6148b;

    public v0(c1 c1Var, int i10) {
        this.f6147a = i10;
        this.f6148b = c1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6147a) {
            case 0:
                gg.s sVar = this.f6148b.f5937c0.f6730r;
                if (sVar != null) {
                    sVar.setPaused(false);
                    return;
                }
                return;
            default:
                gg.s sVar2 = this.f6148b.f5937c0.f6730r;
                if (sVar2 != null) {
                    sVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
