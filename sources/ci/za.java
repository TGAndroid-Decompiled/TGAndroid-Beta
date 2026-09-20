package ci;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f5882a;
    public final oc f5883b;

    public za(oc ocVar, int i10) {
        this.f5882a = i10;
        this.f5883b = ocVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5882a) {
            case 0:
                oc ocVar = this.f5883b;
                ocVar.X0.x(3, false);
                ocVar.f5255q0 = null;
                return;
            default:
                cc ccVar = this.f5883b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
