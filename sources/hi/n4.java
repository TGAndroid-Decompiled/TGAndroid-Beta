package hi;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f15069a;
    public final l5 f15070b;

    public n4(l5 l5Var, int i7) {
        this.f15069a = i7;
        this.f15070b = l5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15069a) {
            case 0:
                this.f15070b.w0(false);
                return;
            default:
                this.f15070b.w0(false);
                return;
        }
    }
}
