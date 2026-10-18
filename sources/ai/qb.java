package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class qb implements DialogInterface.OnDismissListener {
    public final int f2086a = 0;
    public final int f2087b;
    public final NotificationCenter.NotificationCenterDelegate f2088c;

    public qb(int i10, dc dcVar) {
        this.f2087b = i10;
        this.f2088c = dcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2086a) {
            case 0:
                NotificationCenter.getInstance(this.f2087b).removeObserver((dc) this.f2088c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f2088c;
                PhotoViewer photoViewer = ((it0) m0Var).f37992o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f2087b);
                return;
        }
    }

    public qb(rg.m0 m0Var, int i10) {
        this.f2088c = m0Var;
        this.f2087b = i10;
    }
}
