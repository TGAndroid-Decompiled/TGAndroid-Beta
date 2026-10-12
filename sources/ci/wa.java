package ci;

import android.content.DialogInterface;
public final class wa implements DialogInterface.OnDismissListener {
    public final int f6223a;
    public final lc f6224b;

    public wa(lc lcVar, int i10) {
        this.f6223a = i10;
        this.f6224b = lcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6223a) {
            case 0:
                lc lcVar = this.f6224b;
                lcVar.X0.x(3, false);
                lcVar.f5507q0 = null;
                return;
            default:
                zb zbVar = this.f6224b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
