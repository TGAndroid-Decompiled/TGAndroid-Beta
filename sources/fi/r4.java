package fi;

import android.content.DialogInterface;
public final class r4 implements DialogInterface.OnDismissListener {
    public final int f12735a;
    public final o5 f12736b;

    public r4(o5 o5Var, int i7) {
        this.f12735a = i7;
        this.f12736b = o5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12735a) {
            case 0:
                this.f12736b.w0(false);
                return;
            default:
                this.f12736b.w0(false);
                return;
        }
    }
}
