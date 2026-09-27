package ci;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnDismissListener {
    public final int f5691a;
    public final kc f5692b;

    public va(kc kcVar, int i10) {
        this.f5691a = i10;
        this.f5692b = kcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5691a) {
            case 0:
                kc kcVar = this.f5692b;
                kcVar.X0.x(3, false);
                kcVar.f5032q0 = null;
                return;
            default:
                yb ybVar = this.f5692b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
