package lh;

import android.content.DialogInterface;
public final class z2 implements DialogInterface.OnDismissListener {
    public final int f13427a;
    public final g5 f13428b;

    public z2(g5 g5Var, int i10) {
        this.f13427a = i10;
        this.f13428b = g5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13427a) {
            case 0:
                this.f13428b.f12478g0.setLoading(false);
                return;
            default:
                this.f13428b.f12478g0.setLoading(false);
                return;
        }
    }
}
