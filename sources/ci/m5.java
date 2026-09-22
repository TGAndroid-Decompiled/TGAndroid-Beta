package ci;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f5038a;
    public final r6 f5039b;

    public m5(r6 r6Var, int i10) {
        this.f5038a = i10;
        this.f5039b = r6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5038a) {
            case 0:
                this.f5039b.z0(false);
                return;
            default:
                this.f5039b.z0(false);
                return;
        }
    }
}
