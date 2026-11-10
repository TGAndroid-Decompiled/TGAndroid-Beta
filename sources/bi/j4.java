package bi;

import android.content.DialogInterface;
public final class j4 implements DialogInterface.OnDismissListener {
    public final int f4079a;
    public final k7 f4080b;

    public j4(k7 k7Var, int i7) {
        this.f4079a = i7;
        this.f4080b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4079a) {
            case 0:
                this.f4080b.f4170f2.setLoading(false);
                return;
            default:
                this.f4080b.f4170f2.setLoading(false);
                return;
        }
    }
}
