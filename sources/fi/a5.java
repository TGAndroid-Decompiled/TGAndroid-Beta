package fi;

import android.content.DialogInterface;
public final class a5 implements DialogInterface.OnDismissListener {
    public final int f10506a;
    public final e6 f10507b;

    public a5(e6 e6Var, int i10) {
        this.f10506a = i10;
        this.f10507b = e6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10506a) {
            case 0:
                this.f10507b.w0(false);
                return;
            default:
                this.f10507b.w0(false);
                return;
        }
    }
}
