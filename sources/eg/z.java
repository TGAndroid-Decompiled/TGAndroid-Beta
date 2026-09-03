package eg;

import android.content.DialogInterface;
import mh.e9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;
public final class z implements DialogInterface.OnDismissListener {
    public final int f5578a = 1;
    public final int f5579b;
    public final NotificationCenter.NotificationCenterDelegate f5580c;

    public z(int i10, e9 e9Var) {
        this.f5579b = i10;
        this.f5580c = e9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5578a) {
            case 0:
                c1 c1Var = (c1) this.f5580c;
                PhotoViewer photoViewer = ((mt0) c1Var).f39068l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.C();
                }
                c1Var.B0(this.f5579b);
                return;
            default:
                NotificationCenter.getInstance(this.f5579b).removeObserver((e9) this.f5580c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public z(c1 c1Var, int i10) {
        this.f5580c = c1Var;
        this.f5579b = i10;
    }
}
