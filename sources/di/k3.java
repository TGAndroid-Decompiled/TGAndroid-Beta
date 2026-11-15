package di;

import android.content.DialogInterface;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f8903a;
    public final c6 f8904b;

    public k3(c6 c6Var, int i7) {
        this.f8903a = i7;
        this.f8904b = c6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8903a) {
            case 0:
                this.f8904b.f8318g2.setLoading(false);
                return;
            default:
                this.f8904b.f8318g2.setLoading(false);
                return;
        }
    }
}
