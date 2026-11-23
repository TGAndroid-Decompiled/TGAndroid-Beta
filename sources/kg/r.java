package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18470a;
    public final View f18471b;

    public r(int i7, View view) {
        this.f18470a = i7;
        this.f18471b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18470a) {
            case 0:
                v.f18539e = null;
                View view = this.f18471b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                s1.f18508f = null;
                View view2 = this.f18471b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
