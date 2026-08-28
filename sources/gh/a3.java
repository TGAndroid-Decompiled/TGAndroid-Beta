package gh;

import android.content.DialogInterface;
public final class a3 implements DialogInterface.OnDismissListener {
    public final int f7776a;
    public final k5 f7777b;

    public a3(k5 k5Var, int i9) {
        this.f7776a = i9;
        this.f7777b = k5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7776a) {
            case 0:
                this.f7777b.f8407f0.setLoading(false);
                return;
            default:
                this.f7777b.f8407f0.setLoading(false);
                return;
        }
    }
}
