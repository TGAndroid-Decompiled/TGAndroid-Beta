package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18531a;
    public final View f18532b;

    public r(int i7, View view) {
        this.f18531a = i7;
        this.f18532b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18531a) {
            case 0:
                v.f18597e = null;
                View view = this.f18532b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                t1.f18579f = null;
                View view2 = this.f18532b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
