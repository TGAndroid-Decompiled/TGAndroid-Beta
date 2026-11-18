package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9369a;
    public final f6 f9370b;

    public n3(f6 f6Var, int i7) {
        this.f9369a = i7;
        this.f9370b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9369a) {
            case 0:
                this.f9370b.f8782g2.setLoading(false);
                return;
            default:
                this.f9370b.f8782g2.setLoading(false);
                return;
        }
    }
}
