package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class qb implements DialogInterface.OnDismissListener {
    public final int f2084a = 0;
    public final int f2085b;
    public final NotificationCenter.NotificationCenterDelegate f2086c;

    public qb(int i10, dc dcVar) {
        this.f2085b = i10;
        this.f2086c = dcVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2084a) {
            case 0:
                NotificationCenter.getInstance(this.f2085b).removeObserver((dc) this.f2086c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f2086c;
                PhotoViewer photoViewer = ((it0) m0Var).f37974o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f2085b);
                return;
        }
    }

    public qb(rg.m0 m0Var, int i10) {
        this.f2086c = m0Var;
        this.f2085b = i10;
    }
}
