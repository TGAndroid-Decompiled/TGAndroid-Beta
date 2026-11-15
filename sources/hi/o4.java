package hi;

import android.content.DialogInterface;
public final class o4 implements DialogInterface.OnDismissListener {
    public final int f14807a;
    public final m5 f14808b;

    public o4(m5 m5Var, int i7) {
        this.f14807a = i7;
        this.f14808b = m5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14807a) {
            case 0:
                this.f14808b.w0(false);
                return;
            default:
                this.f14808b.w0(false);
                return;
        }
    }
}
