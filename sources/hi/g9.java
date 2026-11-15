package hi;

import android.content.DialogInterface;
public final class g9 implements DialogInterface.OnDismissListener {
    public final int f14347a;
    public final sa f14348b;

    public g9(sa saVar, int i7) {
        this.f14347a = i7;
        this.f14348b = saVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14347a) {
            case 0:
                sa saVar = this.f14348b;
                saVar.Y0.x(3, false);
                saVar.f15089r0 = null;
                return;
            default:
                ga gaVar = this.f14348b.Y0;
                if (gaVar != null) {
                    gaVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
