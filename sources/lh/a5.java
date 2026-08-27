package lh;

import android.content.DialogInterface;

public final class a5 implements DialogInterface.OnDismissListener {

    public final int f15643a;

    public final f6 f15644b;

    public a5(f6 f6Var, int i10) {
        this.f15643a = i10;
        this.f15644b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15643a) {
            case 0:
                this.f15644b.z0(false);
                break;
            default:
                this.f15644b.z0(false);
                break;
        }
    }
}
