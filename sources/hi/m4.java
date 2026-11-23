package hi;

import android.content.DialogInterface;
public final class m4 implements DialogInterface.OnDismissListener {
    public final int f15021a;
    public final k5 f15022b;

    public m4(k5 k5Var, int i7) {
        this.f15021a = i7;
        this.f15022b = k5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15021a) {
            case 0:
                this.f15022b.w0(false);
                return;
            default:
                this.f15022b.w0(false);
                return;
        }
    }
}
