package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9358a;
    public final f6 f9359b;

    public n3(f6 f6Var, int i7) {
        this.f9358a = i7;
        this.f9359b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9358a) {
            case 0:
                this.f9359b.f8768g2.setLoading(false);
                return;
            default:
                this.f9359b.f8768g2.setLoading(false);
                return;
        }
    }
}
