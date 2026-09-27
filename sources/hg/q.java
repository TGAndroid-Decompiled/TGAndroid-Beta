package hg;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f10378a;
    public final View f10379b;

    public q(int i10, View view) {
        this.f10378a = i10;
        this.f10379b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10378a) {
            case 0:
                v.e = null;
                View view = this.f10379b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                y1.h = null;
                View view2 = this.f10379b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
