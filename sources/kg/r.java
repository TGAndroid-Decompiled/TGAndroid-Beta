package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18077a;
    public final View f18078b;

    public r(int i7, View view) {
        this.f18077a = i7;
        this.f18078b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18077a) {
            case 0:
                v.f18119e = null;
                View view = this.f18078b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                r1.f18081f = null;
                View view2 = this.f18078b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
