package hi;

import android.content.DialogInterface;
public final class x4 implements DialogInterface.OnDismissListener {
    public final int f15718a;
    public final v5 f15719b;

    public x4(v5 v5Var, int i7) {
        this.f15718a = i7;
        this.f15719b = v5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15718a) {
            case 0:
                this.f15719b.y0(false);
                return;
            default:
                this.f15719b.y0(false);
                return;
        }
    }
}
