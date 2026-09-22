package ci;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f5040a;
    public final r6 f5041b;

    public m5(r6 r6Var, int i10) {
        this.f5040a = i10;
        this.f5041b = r6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5040a) {
            case 0:
                this.f5041b.z0(false);
                return;
            default:
                this.f5041b.z0(false);
                return;
        }
    }
}
