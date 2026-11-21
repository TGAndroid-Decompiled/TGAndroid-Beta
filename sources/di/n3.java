package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9388a;
    public final f6 f9389b;

    public n3(f6 f6Var, int i7) {
        this.f9388a = i7;
        this.f9389b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9388a) {
            case 0:
                this.f9389b.f8803g2.setLoading(false);
                return;
            default:
                this.f9389b.f8803g2.setLoading(false);
                return;
        }
    }
}
