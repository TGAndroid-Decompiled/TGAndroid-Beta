package kg;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f17484a;
    public final View f17485b;

    public q(int i7, View view) {
        this.f17484a = i7;
        this.f17485b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f17484a) {
            case 0:
                v.f17560e = null;
                View view = this.f17485b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                q1.f17511f = null;
                View view2 = this.f17485b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
