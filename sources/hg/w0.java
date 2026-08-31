package hg;

import android.content.DialogInterface;
public final class w0 implements DialogInterface.OnShowListener {
    public final int f7658a;
    public final b1 f7659b;

    public w0(b1 b1Var, int i10) {
        this.f7658a = i10;
        this.f7659b = b1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f7658a) {
            case 0:
                jg.s sVar = this.f7659b.f7405d0.f8072r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    return;
                }
                return;
            default:
                jg.s sVar2 = this.f7659b.f7405d0.f8072r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
