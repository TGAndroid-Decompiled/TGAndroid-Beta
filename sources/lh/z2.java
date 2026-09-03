package lh;

import android.content.DialogInterface;
public final class z2 implements DialogInterface.OnDismissListener {
    public final int f13411a;
    public final g5 f13412b;

    public z2(g5 g5Var, int i10) {
        this.f13411a = i10;
        this.f13412b = g5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13411a) {
            case 0:
                this.f13412b.f12462g0.setLoading(false);
                return;
            default:
                this.f13412b.f12462g0.setLoading(false);
                return;
        }
    }
}
