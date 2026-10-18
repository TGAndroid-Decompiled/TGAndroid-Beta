package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f12992a;
    public final View f12993b;

    public q(int i10, View view) {
        this.f12992a = i10;
        this.f12993b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12992a) {
            case 0:
                v.d = null;
                View view = this.f12993b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                x1.h = null;
                View view2 = this.f12993b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
