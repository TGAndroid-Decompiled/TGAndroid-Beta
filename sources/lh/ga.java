package lh;

import android.content.DialogInterface;

public final class ga implements DialogInterface.OnDismissListener {

    public final int f16043a;

    public final sb f16044b;

    public ga(sb sbVar, int i10) {
        this.f16043a = i10;
        this.f16044b = sbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f16043a) {
            case 0:
                sb sbVar = this.f16044b;
                sbVar.T0.x(3, false);
                sbVar.m0 = null;
                break;
            default:
                hb hbVar = this.f16044b.T0;
                if (hbVar != null) {
                    hbVar.x(4, false);
                }
                break;
        }
    }
}
