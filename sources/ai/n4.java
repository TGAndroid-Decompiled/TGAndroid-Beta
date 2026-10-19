package ai;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f1874a;
    public final l7 f1875b;

    public n4(l7 l7Var, int i10) {
        this.f1874a = i10;
        this.f1875b = l7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1874a) {
            case 0:
                this.f1875b.f1738k0.setLoading(false);
                return;
            default:
                this.f1875b.f1738k0.setLoading(false);
                return;
        }
    }
}
