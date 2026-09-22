package ci;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f5878a;
    public final oc f5879b;

    public za(oc ocVar, int i10) {
        this.f5878a = i10;
        this.f5879b = ocVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5878a) {
            case 0:
                oc ocVar = this.f5879b;
                ocVar.X0.x(3, false);
                ocVar.f5251q0 = null;
                return;
            default:
                cc ccVar = this.f5879b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
