package ci;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f5881a;
    public final oc f5882b;

    public za(oc ocVar, int i10) {
        this.f5881a = i10;
        this.f5882b = ocVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5881a) {
            case 0:
                oc ocVar = this.f5882b;
                ocVar.X0.x(3, false);
                ocVar.f5254q0 = null;
                return;
            default:
                cc ccVar = this.f5882b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
