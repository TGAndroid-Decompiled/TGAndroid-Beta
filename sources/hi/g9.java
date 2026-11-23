package hi;

import android.content.DialogInterface;
public final class g9 implements DialogInterface.OnDismissListener {
    public final int f14722a;
    public final sa f14723b;

    public g9(sa saVar, int i7) {
        this.f14722a = i7;
        this.f14723b = saVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14722a) {
            case 0:
                sa saVar = this.f14723b;
                saVar.Y0.x(3, false);
                saVar.f15438r0 = null;
                return;
            default:
                ga gaVar = this.f14723b.Y0;
                if (gaVar != null) {
                    gaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
