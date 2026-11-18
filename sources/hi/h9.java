package hi;

import android.content.DialogInterface;
public final class h9 implements DialogInterface.OnDismissListener {
    public final int f14737a;
    public final ta f14738b;

    public h9(ta taVar, int i7) {
        this.f14737a = i7;
        this.f14738b = taVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14737a) {
            case 0:
                ta taVar = this.f14738b;
                taVar.Y0.x(3, false);
                taVar.f15477r0 = null;
                return;
            default:
                ha haVar = this.f14738b.Y0;
                if (haVar != null) {
                    haVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
