package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f11605a;
    public final View f11606b;

    public q(int i10, View view) {
        this.f11605a = i10;
        this.f11606b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11605a) {
            case 0:
                v.d = null;
                View view = this.f11606b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                y1.h = null;
                View view2 = this.f11606b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
