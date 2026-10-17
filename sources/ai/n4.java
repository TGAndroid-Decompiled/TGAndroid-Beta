package ai;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f1890a;
    public final k7 f1891b;

    public n4(k7 k7Var, int i10) {
        this.f1890a = i10;
        this.f1891b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1890a) {
            case 0:
                this.f1891b.f1685k0.setLoading(false);
                return;
            default:
                this.f1891b.f1685k0.setLoading(false);
                return;
        }
    }
}
