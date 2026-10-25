package fi;

import android.content.DialogInterface;
public final class da implements DialogInterface.OnDismissListener {
    public final int f10731a;
    public final sb f10732b;

    public da(sb sbVar, int i10) {
        this.f10731a = i10;
        this.f10732b = sbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10731a) {
            case 0:
                sb sbVar = this.f10732b;
                sbVar.X0.x(3, false);
                sbVar.f11655q0 = null;
                return;
            default:
                gb gbVar = this.f10732b.X0;
                if (gbVar != null) {
                    gbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
