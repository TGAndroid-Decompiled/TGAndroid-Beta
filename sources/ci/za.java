package ci;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f5880a;
    public final oc f5881b;

    public za(oc ocVar, int i10) {
        this.f5880a = i10;
        this.f5881b = ocVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5880a) {
            case 0:
                oc ocVar = this.f5881b;
                ocVar.X0.x(3, false);
                ocVar.f5253q0 = null;
                return;
            default:
                cc ccVar = this.f5881b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
