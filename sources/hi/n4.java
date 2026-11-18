package hi;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f15096a;
    public final l5 f15097b;

    public n4(l5 l5Var, int i7) {
        this.f15096a = i7;
        this.f15097b = l5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15096a) {
            case 0:
                this.f15097b.w0(false);
                return;
            default:
                this.f15097b.w0(false);
                return;
        }
    }
}
