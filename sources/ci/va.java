package ci;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnDismissListener {
    public final int f6133a;
    public final kc f6134b;

    public va(kc kcVar, int i10) {
        this.f6133a = i10;
        this.f6134b = kcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6133a) {
            case 0:
                kc kcVar = this.f6134b;
                kcVar.X0.x(3, false);
                kcVar.f5425q0 = null;
                return;
            default:
                yb ybVar = this.f6134b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
