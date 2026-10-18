package ei;

import android.content.DialogInterface;
public final class b5 implements DialogInterface.OnDismissListener {
    public final int f8788a;
    public final f6 f8789b;

    public b5(f6 f6Var, int i10) {
        this.f8788a = i10;
        this.f8789b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8788a) {
            case 0:
                this.f8789b.y0(false);
                return;
            default:
                this.f8789b.y0(false);
                return;
        }
    }
}
