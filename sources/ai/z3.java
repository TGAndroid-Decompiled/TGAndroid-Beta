package ai;

import android.content.DialogInterface;
public final class z3 implements DialogInterface.OnDismissListener {
    public final int f2526a;
    public final k7 f2527b;

    public z3(k7 k7Var, int i10) {
        this.f2526a = i10;
        this.f2527b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2526a) {
            case 0:
                this.f2527b.f1667k0.setLoading(false);
                return;
            default:
                this.f2527b.f1667k0.setLoading(false);
                return;
        }
    }
}
