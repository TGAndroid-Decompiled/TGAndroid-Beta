package gg;

import android.content.DialogInterface;
import android.view.View;
public final class s implements DialogInterface.OnDismissListener {
    public final int f9029a;
    public final View f9030b;

    public s(int i10, View view) {
        this.f9029a = i10;
        this.f9030b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9029a) {
            case 0:
                x.d = null;
                View view = this.f9030b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                h2.h = null;
                View view2 = this.f9030b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
