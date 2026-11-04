package gi;

import android.content.DialogInterface;
public final class j9 implements DialogInterface.OnDismissListener {
    public final int f13019a;
    public final va f13020b;

    public j9(va vaVar, int i3) {
        this.f13019a = i3;
        this.f13020b = vaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13019a) {
            case 0:
                va vaVar = this.f13020b;
                vaVar.Y0.x(3, false);
                vaVar.f13752r0 = null;
                return;
            default:
                ja jaVar = this.f13020b.Y0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
