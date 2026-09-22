package hg;

import android.content.DialogInterface;
import android.view.View;
public final class s implements DialogInterface.OnDismissListener {
    public final int f10399a;
    public final View f10400b;

    public s(int i10, View view) {
        this.f10399a = i10;
        this.f10400b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10399a) {
            case 0:
                x.d = null;
                View view = this.f10400b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z1.h = null;
                View view2 = this.f10400b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
