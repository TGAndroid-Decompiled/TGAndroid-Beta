package cg;

import android.content.DialogInterface;

public final class w0 implements DialogInterface.OnDismissListener {

    public final int f2844a;

    public final d1 f2845b;

    public w0(d1 d1Var, int i10) {
        this.f2844a = i10;
        this.f2845b = d1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2844a) {
            case 0:
                eg.t tVar = this.f2845b.f2636c0.f4935r;
                if (tVar != null) {
                    tVar.setPaused(false);
                }
                break;
            default:
                eg.t tVar2 = this.f2845b.f2636c0.f4935r;
                if (tVar2 != null) {
                    tVar2.setPaused(false);
                }
                break;
        }
    }
}
