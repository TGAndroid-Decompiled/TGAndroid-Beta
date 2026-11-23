package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18436a;
    public final View f18437b;

    public r(int i7, View view) {
        this.f18436a = i7;
        this.f18437b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18436a) {
            case 0:
                v.f18495e = null;
                View view = this.f18437b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                t1.f18484f = null;
                View view2 = this.f18437b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
