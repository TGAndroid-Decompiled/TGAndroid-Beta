package ci;

import android.content.DialogInterface;
public final class t3 implements DialogInterface.OnDismissListener {
    public final int f6019a;
    public final l6 f6020b;

    public t3(l6 l6Var, int i3) {
        this.f6019a = i3;
        this.f6020b = l6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6019a) {
            case 0:
                this.f6020b.f5451d2.setLoading(false);
                return;
            default:
                this.f6020b.f5451d2.setLoading(false);
                return;
        }
    }
}
