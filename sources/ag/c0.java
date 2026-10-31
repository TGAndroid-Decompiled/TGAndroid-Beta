package ag;

import android.content.DialogInterface;
import android.view.View;
public final class c0 implements DialogInterface.OnDismissListener {
    public final int f476a;
    public final View f477b;

    public c0(int i10, View view) {
        this.f476a = i10;
        this.f477b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f476a) {
            case 0:
                i0.e = null;
                View view = this.f477b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                z2.f819f = null;
                View view2 = this.f477b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
