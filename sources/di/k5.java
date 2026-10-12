package di;

import android.content.DialogInterface;
public final class k5 implements DialogInterface.OnDismissListener {
    public final int f7166a;
    public final o6 f7167b;

    public k5(o6 o6Var, int i10) {
        this.f7166a = i10;
        this.f7167b = o6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7166a) {
            case 0:
                this.f7167b.y0(false);
                return;
            default:
                this.f7167b.y0(false);
                return;
        }
    }
}
