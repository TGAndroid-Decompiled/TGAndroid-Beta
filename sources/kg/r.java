package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18433a;
    public final View f18434b;

    public r(int i7, View view) {
        this.f18433a = i7;
        this.f18434b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18433a) {
            case 0:
                v.f18496e = null;
                View view = this.f18434b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                t1.f18485f = null;
                View view2 = this.f18434b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
