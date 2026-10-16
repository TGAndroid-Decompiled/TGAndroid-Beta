package di;

import android.content.DialogInterface;
public final class k5 implements DialogInterface.OnDismissListener {
    public final int f7169a;
    public final o6 f7170b;

    public k5(o6 o6Var, int i10) {
        this.f7169a = i10;
        this.f7170b = o6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7169a) {
            case 0:
                this.f7170b.y0(false);
                return;
            default:
                this.f7170b.y0(false);
                return;
        }
    }
}
