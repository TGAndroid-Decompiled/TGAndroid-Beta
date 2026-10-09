package hg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f11358a;
    public final View f11359b;

    public r(int i10, View view) {
        this.f11358a = i10;
        this.f11359b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11358a) {
            case 0:
                w.d = null;
                View view = this.f11359b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z1.h = null;
                View view2 = this.f11359b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
