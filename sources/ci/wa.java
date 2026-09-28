package ci;

import android.content.DialogInterface;
public final class wa implements DialogInterface.OnDismissListener {
    public final int f5741a;
    public final lc f5742b;

    public wa(lc lcVar, int i10) {
        this.f5741a = i10;
        this.f5742b = lcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5741a) {
            case 0:
                lc lcVar = this.f5742b;
                lcVar.X0.x(3, false);
                lcVar.f5076q0 = null;
                return;
            default:
                zb zbVar = this.f5742b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
