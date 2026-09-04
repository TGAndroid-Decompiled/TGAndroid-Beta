package ig;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f12181a;
    public final View f12182b;

    public q(int i10, View view) {
        this.f12181a = i10;
        this.f12182b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12181a) {
            case 0:
                v.d = null;
                View view = this.f12182b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                y1.h = null;
                View view2 = this.f12182b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
