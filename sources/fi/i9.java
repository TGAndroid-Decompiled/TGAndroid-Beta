package fi;

import android.content.DialogInterface;
public final class i9 implements DialogInterface.OnDismissListener {
    public final int f12191a;
    public final va f12192b;

    public i9(va vaVar, int i7) {
        this.f12191a = i7;
        this.f12192b = vaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12191a) {
            case 0:
                va vaVar = this.f12192b;
                vaVar.X0.x(3, false);
                vaVar.f12986q0 = null;
                return;
            default:
                ja jaVar = this.f12192b.X0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
