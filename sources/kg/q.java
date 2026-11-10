package kg;

import android.content.DialogInterface;
import android.view.View;
public final class q implements DialogInterface.OnDismissListener {
    public final int f17487a;
    public final View f17488b;

    public q(int i7, View view) {
        this.f17487a = i7;
        this.f17488b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f17487a) {
            case 0:
                v.f17563e = null;
                View view = this.f17488b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                q1.f17514f = null;
                View view2 = this.f17488b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
