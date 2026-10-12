package di;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnDismissListener {
    public final int f8015a;
    public final kc f8016b;

    public va(kc kcVar, int i10) {
        this.f8015a = i10;
        this.f8016b = kcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8015a) {
            case 0:
                kc kcVar = this.f8016b;
                kcVar.X0.x(3, false);
                kcVar.f7284q0 = null;
                return;
            default:
                yb ybVar = this.f8016b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
