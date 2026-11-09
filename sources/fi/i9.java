package fi;

import android.content.DialogInterface;
public final class i9 implements DialogInterface.OnDismissListener {
    public final int f12187a;
    public final va f12188b;

    public i9(va vaVar, int i7) {
        this.f12187a = i7;
        this.f12188b = vaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12187a) {
            case 0:
                va vaVar = this.f12188b;
                vaVar.X0.x(3, false);
                vaVar.f12984q0 = null;
                return;
            default:
                ja jaVar = this.f12188b.X0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
