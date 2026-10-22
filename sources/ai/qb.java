package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
public final class qb implements DialogInterface.OnDismissListener {
    public final int f2087a = 0;
    public final int f2088b;
    public final NotificationCenter.NotificationCenterDelegate f2089c;

    public qb(int i10, dc dcVar) {
        this.f2088b = i10;
        this.f2089c = dcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2087a) {
            case 0:
                NotificationCenter.getInstance(this.f2088b).removeObserver((dc) this.f2089c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f2089c;
                PhotoViewer photoViewer = ((gt0) m0Var).f37417o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f2088b);
                return;
        }
    }

    public qb(rg.m0 m0Var, int i10) {
        this.f2089c = m0Var;
        this.f2088b = i10;
    }
}
