package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class rb implements DialogInterface.OnDismissListener {
    public final int f2135a = 0;
    public final int f2136b;
    public final NotificationCenter.NotificationCenterDelegate f2137c;

    public rb(int i10, ec ecVar) {
        this.f2136b = i10;
        this.f2137c = ecVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2135a) {
            case 0:
                NotificationCenter.getInstance(this.f2136b).removeObserver((ec) this.f2137c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f2137c;
                PhotoViewer photoViewer = ((it0) m0Var).f38385o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                m0Var.B0(this.f2136b);
                return;
        }
    }

    public rb(rg.m0 m0Var, int i10) {
        this.f2137c = m0Var;
        this.f2136b = i10;
    }
}
