package ai;

import android.content.DialogInterface;
public final class a4 implements DialogInterface.OnDismissListener {
    public final int f955a;
    public final k7 f956b;

    public a4(k7 k7Var, int i10) {
        this.f955a = i10;
        this.f956b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f955a) {
            case 0:
                this.f956b.f1671k0.setLoading(false);
                return;
            default:
                this.f956b.f1671k0.setLoading(false);
                return;
        }
    }
}
