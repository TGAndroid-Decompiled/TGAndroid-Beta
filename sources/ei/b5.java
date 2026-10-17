package ei;

import android.content.DialogInterface;
public final class b5 implements DialogInterface.OnDismissListener {
    public final int f8787a;
    public final f6 f8788b;

    public b5(f6 f6Var, int i10) {
        this.f8787a = i10;
        this.f8788b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8787a) {
            case 0:
                this.f8788b.y0(false);
                return;
            default:
                this.f8788b.y0(false);
                return;
        }
    }
}
