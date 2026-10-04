package hg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f11306a;
    public final View f11307b;

    public r(int i10, View view) {
        this.f11306a = i10;
        this.f11307b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11306a) {
            case 0:
                w.f11376e = null;
                View view = this.f11307b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                y1.h = null;
                View view2 = this.f11307b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
