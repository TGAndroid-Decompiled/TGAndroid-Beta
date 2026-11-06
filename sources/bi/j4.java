package bi;

import android.content.DialogInterface;
public final class j4 implements DialogInterface.OnDismissListener {
    public final int f4082a;
    public final k7 f4083b;

    public j4(k7 k7Var, int i7) {
        this.f4082a = i7;
        this.f4083b = k7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4082a) {
            case 0:
                this.f4083b.f4168c2.setLoading(false);
                return;
            default:
                this.f4083b.f4168c2.setLoading(false);
                return;
        }
    }
}
