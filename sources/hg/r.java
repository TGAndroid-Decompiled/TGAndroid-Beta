package hg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f11357a;
    public final View f11358b;

    public r(int i10, View view) {
        this.f11357a = i10;
        this.f11358b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11357a) {
            case 0:
                w.d = null;
                View view = this.f11358b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z1.h = null;
                View view2 = this.f11358b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
