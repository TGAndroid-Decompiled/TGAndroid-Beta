package di;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f8561a;
    public final pc f8562b;

    public za(pc pcVar, int i10) {
        this.f8561a = i10;
        this.f8562b = pcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8561a) {
            case 0:
                pc pcVar = this.f8562b;
                pcVar.X0.x(3, false);
                pcVar.f7920q0 = null;
                return;
            default:
                dc dcVar = this.f8562b.X0;
                if (dcVar != null) {
                    dcVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
