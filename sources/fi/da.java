package fi;

import android.content.DialogInterface;
public final class da implements DialogInterface.OnDismissListener {
    public final int f10730a;
    public final sb f10731b;

    public da(sb sbVar, int i10) {
        this.f10730a = i10;
        this.f10731b = sbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10730a) {
            case 0:
                sb sbVar = this.f10731b;
                sbVar.X0.x(3, false);
                sbVar.f11654q0 = null;
                return;
            default:
                gb gbVar = this.f10731b.X0;
                if (gbVar != null) {
                    gbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
