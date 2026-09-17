package di;

import android.content.DialogInterface;
public final class za implements DialogInterface.OnDismissListener {
    public final int f8533a;
    public final pc f8534b;

    public za(pc pcVar, int i10) {
        this.f8533a = i10;
        this.f8534b = pcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8533a) {
            case 0:
                pc pcVar = this.f8534b;
                pcVar.X0.x(3, false);
                pcVar.f7892q0 = null;
                return;
            default:
                dc dcVar = this.f8534b.X0;
                if (dcVar != null) {
                    dcVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
