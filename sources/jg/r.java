package jg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f15819a;
    public final View f15820b;

    public r(int i10, View view) {
        this.f15819a = i10;
        this.f15820b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15819a) {
            case 0:
                w.e = null;
                View view = this.f15820b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z1.f15913f = null;
                View view2 = this.f15820b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
