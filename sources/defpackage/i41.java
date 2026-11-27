package defpackage;

import android.content.DialogInterface;
import android.view.View;
public final class i41 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final View b;

    public i41(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                n41.e = null;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            case 1:
                q84.i = null;
                view.requestFocus();
                return;
            case 2:
                w09.f = null;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                ow9.I = null;
                view.requestFocus();
                return;
        }
    }
}
