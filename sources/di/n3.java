package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9366a;
    public final f6 f9367b;

    public n3(f6 f6Var, int i7) {
        this.f9366a = i7;
        this.f9367b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9366a) {
            case 0:
                this.f9367b.f8779g2.setLoading(false);
                return;
            default:
                this.f9367b.f8779g2.setLoading(false);
                return;
        }
    }
}
