package jh;

import android.content.DialogInterface;
public final class z2 implements DialogInterface.OnDismissListener {
    public final int f13156a;
    public final h5 f13157b;

    public z2(h5 h5Var, int i10) {
        this.f13156a = i10;
        this.f13157b = h5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13156a) {
            case 0:
                this.f13157b.f12173f0.setLoading(false);
                return;
            default:
                this.f13157b.f12173f0.setLoading(false);
                return;
        }
    }
}
