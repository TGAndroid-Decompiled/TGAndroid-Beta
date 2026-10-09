package ci;

import android.content.DialogInterface;
public final class k5 implements DialogInterface.OnDismissListener {
    public final int f5318a;
    public final q6 f5319b;

    public k5(q6 q6Var, int i10) {
        this.f5318a = i10;
        this.f5319b = q6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5318a) {
            case 0:
                this.f5319b.y0(false);
                return;
            default:
                this.f5319b.y0(false);
                return;
        }
    }
}
