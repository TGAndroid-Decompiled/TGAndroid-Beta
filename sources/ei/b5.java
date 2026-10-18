package ei;

import android.content.DialogInterface;
public final class b5 implements DialogInterface.OnDismissListener {
    public final int f8786a;
    public final f6 f8787b;

    public b5(f6 f6Var, int i10) {
        this.f8786a = i10;
        this.f8787b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8786a) {
            case 0:
                this.f8787b.y0(false);
                return;
            default:
                this.f8787b.y0(false);
                return;
        }
    }
}
