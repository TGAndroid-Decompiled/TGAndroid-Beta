package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f12994a;
    public final View f12995b;

    public q(int i10, View view) {
        this.f12994a = i10;
        this.f12995b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12994a) {
            case 0:
                v.d = null;
                View view = this.f12995b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                x1.h = null;
                View view2 = this.f12995b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
