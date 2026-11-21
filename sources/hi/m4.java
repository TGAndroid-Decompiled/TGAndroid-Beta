package hi;

import android.content.DialogInterface;
public final class m4 implements DialogInterface.OnDismissListener {
    public final int f15018a;
    public final k5 f15019b;

    public m4(k5 k5Var, int i7) {
        this.f15018a = i7;
        this.f15019b = k5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15018a) {
            case 0:
                this.f15019b.w0(false);
                return;
            default:
                this.f15019b.w0(false);
                return;
        }
    }
}
