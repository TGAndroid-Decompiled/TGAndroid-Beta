package dg;

import android.content.DialogInterface;
import lh.e9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;
public final class b0 implements DialogInterface.OnDismissListener {
    public final int f4385a = 1;
    public final int f4386b;
    public final NotificationCenter.NotificationCenterDelegate f4387c;

    public b0(int i10, e9 e9Var) {
        this.f4386b = i10;
        this.f4387c = e9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4385a) {
            case 0:
                e1 e1Var = (e1) this.f4387c;
                PhotoViewer photoViewer = ((ft0) e1Var).f34353l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.C();
                }
                e1Var.B0(this.f4386b);
                return;
            default:
                NotificationCenter.getInstance(this.f4386b).removeObserver((e9) this.f4387c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public b0(e1 e1Var, int i10) {
        this.f4387c = e1Var;
        this.f4386b = i10;
    }
}
