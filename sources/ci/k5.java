package ci;

import android.content.DialogInterface;
public final class k5 implements DialogInterface.OnDismissListener {
    public final int f5316a;
    public final q6 f5317b;

    public k5(q6 q6Var, int i10) {
        this.f5316a = i10;
        this.f5317b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5316a) {
            case 0:
                this.f5317b.y0(false);
                return;
            default:
                this.f5317b.y0(false);
                return;
        }
    }
}
