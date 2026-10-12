package hg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f11356a;
    public final View f11357b;

    public r(int i10, View view) {
        this.f11356a = i10;
        this.f11357b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11356a) {
            case 0:
                w.d = null;
                View view = this.f11357b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z1.h = null;
                View view2 = this.f11357b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
