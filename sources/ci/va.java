package ci;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnDismissListener {
    public final int f6132a;
    public final kc f6133b;

    public va(kc kcVar, int i10) {
        this.f6132a = i10;
        this.f6133b = kcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6132a) {
            case 0:
                kc kcVar = this.f6133b;
                kcVar.X0.x(3, false);
                kcVar.f5424q0 = null;
                return;
            default:
                yb ybVar = this.f6133b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
