package mh;

import android.content.DialogInterface;
public final class y2 implements DialogInterface.OnDismissListener {
    public final int f15081a;
    public final g5 f15082b;

    public y2(g5 g5Var, int i10) {
        this.f15081a = i10;
        this.f15082b = g5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15081a) {
            case 0:
                this.f15082b.f14095g0.setLoading(false);
                return;
            default:
                this.f15082b.f14095g0.setLoading(false);
                return;
        }
    }
}
