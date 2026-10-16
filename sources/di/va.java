package di;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnDismissListener {
    public final int f8018a;
    public final kc f8019b;

    public va(kc kcVar, int i10) {
        this.f8018a = i10;
        this.f8019b = kcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8018a) {
            case 0:
                kc kcVar = this.f8019b;
                kcVar.X0.x(3, false);
                kcVar.f7287q0 = null;
                return;
            default:
                yb ybVar = this.f8019b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
