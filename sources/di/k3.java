package di;

import android.content.DialogInterface;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f8904a;
    public final c6 f8905b;

    public k3(c6 c6Var, int i7) {
        this.f8904a = i7;
        this.f8905b = c6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8904a) {
            case 0:
                this.f8905b.f8319g2.setLoading(false);
                return;
            default:
                this.f8905b.f8319g2.setLoading(false);
                return;
        }
    }
}
