package kh;

import android.content.DialogInterface;
public final class c5 implements DialogInterface.OnDismissListener {
    public final int f15035a;
    public final g6 f15036b;

    public c5(g6 g6Var, int i9) {
        this.f15035a = i9;
        this.f15036b = g6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15035a) {
            case 0:
                this.f15036b.z0(false);
                return;
            default:
                this.f15036b.z0(false);
                return;
        }
    }
}
