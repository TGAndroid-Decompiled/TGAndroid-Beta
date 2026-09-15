package ci;

import android.content.DialogInterface;
public final class m5 implements DialogInterface.OnDismissListener {
    public final int f5036a;
    public final r6 f5037b;

    public m5(r6 r6Var, int i10) {
        this.f5036a = i10;
        this.f5037b = r6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5036a) {
            case 0:
                this.f5037b.z0(false);
                return;
            default:
                this.f5037b.z0(false);
                return;
        }
    }
}
