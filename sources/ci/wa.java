package ci;

import android.content.DialogInterface;
public final class wa implements DialogInterface.OnDismissListener {
    public final int f6225a;
    public final lc f6226b;

    public wa(lc lcVar, int i10) {
        this.f6225a = i10;
        this.f6226b = lcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6225a) {
            case 0:
                lc lcVar = this.f6226b;
                lcVar.X0.x(3, false);
                lcVar.f5509q0 = null;
                return;
            default:
                zb zbVar = this.f6226b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
