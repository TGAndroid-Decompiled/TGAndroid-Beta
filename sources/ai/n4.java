package ai;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f1864a;
    public final l7 f1865b;

    public n4(l7 l7Var, int i10) {
        this.f1864a = i10;
        this.f1865b = l7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1864a) {
            case 0:
                this.f1865b.f1730k0.setLoading(false);
                return;
            default:
                this.f1865b.f1730k0.setLoading(false);
                return;
        }
    }
}
