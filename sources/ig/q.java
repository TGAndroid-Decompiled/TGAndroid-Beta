package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f12987a;
    public final View f12988b;

    public q(int i10, View view) {
        this.f12987a = i10;
        this.f12988b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12987a) {
            case 0:
                v.d = null;
                View view = this.f12988b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                v1.h = null;
                View view2 = this.f12988b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
