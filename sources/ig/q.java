package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f13024a;
    public final View f13025b;

    public q(int i10, View view) {
        this.f13024a = i10;
        this.f13025b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13024a) {
            case 0:
                v.d = null;
                View view = this.f13025b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                w1.h = null;
                View view2 = this.f13025b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
