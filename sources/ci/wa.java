package ci;

import android.content.DialogInterface;
public final class wa implements DialogInterface.OnDismissListener {
    public final int f5753a;
    public final lc f5754b;

    public wa(lc lcVar, int i10) {
        this.f5753a = i10;
        this.f5754b = lcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5753a) {
            case 0:
                lc lcVar = this.f5754b;
                lcVar.X0.x(3, false);
                lcVar.f5083q0 = null;
                return;
            default:
                zb zbVar = this.f5754b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
