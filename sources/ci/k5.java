package ci;

import android.content.DialogInterface;
public final class k5 implements DialogInterface.OnDismissListener {
    public final int f5317a;
    public final q6 f5318b;

    public k5(q6 q6Var, int i10) {
        this.f5317a = i10;
        this.f5318b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5317a) {
            case 0:
                this.f5318b.y0(false);
                return;
            default:
                this.f5318b.y0(false);
                return;
        }
    }
}
