package mh;

import android.content.DialogInterface;
public final class y2 implements DialogInterface.OnDismissListener {
    public final int f15083a;
    public final g5 f15084b;

    public y2(g5 g5Var, int i10) {
        this.f15083a = i10;
        this.f15084b = g5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15083a) {
            case 0:
                this.f15084b.f14097g0.setLoading(false);
                return;
            default:
                this.f15084b.f14097g0.setLoading(false);
                return;
        }
    }
}
