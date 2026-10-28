package bi;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;
public final class pb implements DialogInterface.OnDismissListener {
    public final int f5243a = 0;
    public final int f5244b;
    public final NotificationCenter.NotificationCenterDelegate f5245c;

    public pb(int i10, xb xbVar) {
        this.f5244b = i10;
        this.f5245c = xbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5243a) {
            case 0:
                NotificationCenter.getInstance(this.f5244b).removeObserver((xb) this.f5245c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.f5245c;
                PhotoViewer photoViewer = ((pt0) m0Var).f42502d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                m0Var.A0(this.f5244b);
                return;
        }
    }

    public pb(sg.m0 m0Var, int i10) {
        this.f5245c = m0Var;
        this.f5244b = i10;
    }
}
