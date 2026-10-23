package ei;

import android.content.DialogInterface;
public final class b5 implements DialogInterface.OnDismissListener {
    public final int f8794a;
    public final f6 f8795b;

    public b5(f6 f6Var, int i10) {
        this.f8794a = i10;
        this.f8795b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8794a) {
            case 0:
                this.f8795b.x0(false);
                return;
            default:
                this.f8795b.x0(false);
                return;
        }
    }
}
