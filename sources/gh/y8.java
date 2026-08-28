package gh;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;
public final class y8 implements DialogInterface.OnDismissListener {
    public final int f9232a = 0;
    public final int f9233b;
    public final NotificationCenter.NotificationCenterDelegate f9234c;

    public y8(int i9, i9 i9Var) {
        this.f9233b = i9;
        this.f9234c = i9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9232a) {
            case 0:
                NotificationCenter.getInstance(this.f9233b).removeObserver((i9) this.f9234c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f9234c;
                PhotoViewer photoViewer = ((xs0) l0Var).f44585k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.t0();
                    photoViewer.B2.D();
                }
                l0Var.B0(this.f9233b);
                return;
        }
    }

    public y8(yf.l0 l0Var, int i9) {
        this.f9234c = l0Var;
        this.f9233b = i9;
    }
}
