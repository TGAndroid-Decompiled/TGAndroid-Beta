package ci;

import android.content.DialogInterface;
public final class wa implements DialogInterface.OnDismissListener {
    public final int f6224a;
    public final lc f6225b;

    public wa(lc lcVar, int i10) {
        this.f6224a = i10;
        this.f6225b = lcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6224a) {
            case 0:
                lc lcVar = this.f6225b;
                lcVar.X0.x(3, false);
                lcVar.f5508q0 = null;
                return;
            default:
                zb zbVar = this.f6225b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
