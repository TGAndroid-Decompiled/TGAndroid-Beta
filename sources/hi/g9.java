package hi;

import android.content.DialogInterface;
public final class g9 implements DialogInterface.OnDismissListener {
    public final int f14719a;
    public final sa f14720b;

    public g9(sa saVar, int i7) {
        this.f14719a = i7;
        this.f14720b = saVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14719a) {
            case 0:
                sa saVar = this.f14720b;
                saVar.Y0.x(3, false);
                saVar.f15435r0 = null;
                return;
            default:
                ga gaVar = this.f14720b.Y0;
                if (gaVar != null) {
                    gaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
