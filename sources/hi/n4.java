package hi;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f15099a;
    public final l5 f15100b;

    public n4(l5 l5Var, int i7) {
        this.f15099a = i7;
        this.f15100b = l5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15099a) {
            case 0:
                this.f15100b.w0(false);
                return;
            default:
                this.f15100b.w0(false);
                return;
        }
    }
}
