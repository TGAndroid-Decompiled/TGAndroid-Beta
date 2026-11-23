package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9352a;
    public final f6 f9353b;

    public n3(f6 f6Var, int i7) {
        this.f9352a = i7;
        this.f9353b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9352a) {
            case 0:
                this.f9353b.f8767g2.setLoading(false);
                return;
            default:
                this.f9353b.f8767g2.setLoading(false);
                return;
        }
    }
}
