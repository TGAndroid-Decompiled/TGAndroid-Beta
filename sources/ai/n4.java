package ai;

import android.content.DialogInterface;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f1889a;
    public final k7 f1890b;

    public n4(k7 k7Var, int i10) {
        this.f1889a = i10;
        this.f1890b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1889a) {
            case 0:
                this.f1890b.f1677k0.setLoading(false);
                return;
            default:
                this.f1890b.f1677k0.setLoading(false);
                return;
        }
    }
}
