package fi;

import android.content.DialogInterface;
public final class j9 implements DialogInterface.OnDismissListener {
    public final int f12242a;
    public final va f12243b;

    public j9(va vaVar, int i7) {
        this.f12242a = i7;
        this.f12243b = vaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12242a) {
            case 0:
                va vaVar = this.f12243b;
                vaVar.X0.x(3, false);
                vaVar.f12984q0 = null;
                return;
            default:
                ja jaVar = this.f12243b.X0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
