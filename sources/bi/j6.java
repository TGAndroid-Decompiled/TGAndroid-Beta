package bi;

import android.content.DialogInterface;
public final class j6 implements DialogInterface.OnDismissListener {
    public final int f2960a;
    public final r7 f2961b;

    public j6(r7 r7Var, int i10) {
        this.f2960a = i10;
        this.f2961b = r7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2960a) {
            case 0:
                this.f2961b.z0(false);
                return;
            default:
                this.f2961b.z0(false);
                return;
        }
    }
}
