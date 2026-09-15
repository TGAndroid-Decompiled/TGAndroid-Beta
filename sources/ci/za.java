package ci;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f5876a;
    public final oc f5877b;

    public za(oc ocVar, int i10) {
        this.f5876a = i10;
        this.f5877b = ocVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5876a) {
            case 0:
                oc ocVar = this.f5877b;
                ocVar.X0.x(3, false);
                ocVar.f5249q0 = null;
                return;
            default:
                cc ccVar = this.f5877b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
