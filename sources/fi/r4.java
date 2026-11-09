package fi;

import android.content.DialogInterface;
public final class r4 implements DialogInterface.OnDismissListener {
    public final int f12731a;
    public final o5 f12732b;

    public r4(o5 o5Var, int i7) {
        this.f12731a = i7;
        this.f12732b = o5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12731a) {
            case 0:
                this.f12732b.w0(false);
                return;
            default:
                this.f12732b.w0(false);
                return;
        }
    }
}
