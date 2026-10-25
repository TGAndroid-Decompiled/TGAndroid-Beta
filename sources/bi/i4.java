package bi;

import android.content.DialogInterface;
public final class i4 implements DialogInterface.OnDismissListener {
    public final int f4825a;
    public final h7 f4826b;

    public i4(h7 h7Var, int i10) {
        this.f4825a = i10;
        this.f4826b = h7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4825a) {
            case 0:
                this.f4826b.f4747k0.setLoading(false);
                return;
            default:
                this.f4826b.f4747k0.setLoading(false);
                return;
        }
    }
}
