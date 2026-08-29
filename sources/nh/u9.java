package nh;

import android.content.DialogInterface;
public final class u9 implements DialogInterface.OnDismissListener {
    public final int f18727a;
    public final gb f18728b;

    public u9(gb gbVar, int i10) {
        this.f18727a = i10;
        this.f18728b = gbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18727a) {
            case 0:
                gb gbVar = this.f18728b;
                gbVar.T0.x(3, false);
                gbVar.m0 = null;
                return;
            default:
                va vaVar = this.f18728b.T0;
                if (vaVar != null) {
                    vaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
