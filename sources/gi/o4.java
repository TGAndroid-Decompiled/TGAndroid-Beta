package gi;

import android.content.DialogInterface;
public final class o4 implements DialogInterface.OnDismissListener {
    public final int f13330a;
    public final m5 f13331b;

    public o4(m5 m5Var, int i3) {
        this.f13330a = i3;
        this.f13331b = m5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13330a) {
            case 0:
                this.f13331b.w0(false);
                return;
            default:
                this.f13331b.w0(false);
                return;
        }
    }
}
