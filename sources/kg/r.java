package kg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18467a;
    public final View f18468b;

    public r(int i7, View view) {
        this.f18467a = i7;
        this.f18468b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18467a) {
            case 0:
                v.f18536e = null;
                View view = this.f18468b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                s1.f18505f = null;
                View view2 = this.f18468b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
