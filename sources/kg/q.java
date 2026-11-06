package kg;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f17481a;
    public final View f17482b;

    public q(int i7, View view) {
        this.f17481a = i7;
        this.f17482b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f17481a) {
            case 0:
                v.f17557e = null;
                View view = this.f17482b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                q1.f17508f = null;
                View view2 = this.f17482b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
