package di;

import android.content.DialogInterface;
public final class n3 implements DialogInterface.OnDismissListener {
    public final int f9391a;
    public final f6 f9392b;

    public n3(f6 f6Var, int i7) {
        this.f9391a = i7;
        this.f9392b = f6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9391a) {
            case 0:
                this.f9392b.f8806g2.setLoading(false);
                return;
            default:
                this.f9392b.f8806g2.setLoading(false);
                return;
        }
    }
}
