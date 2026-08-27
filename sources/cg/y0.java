package cg;

import android.content.DialogInterface;

public final class y0 implements DialogInterface.OnShowListener {

    public final int f2862a;

    public final d1 f2863b;

    public y0(d1 d1Var, int i10) {
        this.f2862a = i10;
        this.f2863b = d1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f2862a) {
            case 0:
                eg.t tVar = this.f2863b.f2636c0.f4935r;
                if (tVar != null) {
                    tVar.setPaused(true);
                }
                break;
            default:
                eg.t tVar2 = this.f2863b.f2636c0.f4935r;
                if (tVar2 != null) {
                    tVar2.setPaused(true);
                }
                break;
        }
    }
}
