package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class pb implements DialogInterface.OnDismissListener {
    public final int f2034a = 0;
    public final int f2035b;
    public final NotificationCenter.NotificationCenterDelegate f2036c;

    public pb(int i10, cc ccVar) {
        this.f2035b = i10;
        this.f2036c = ccVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2034a) {
            case 0:
                NotificationCenter.getInstance(this.f2035b).removeObserver((cc) this.f2036c, NotificationCenter.starSubscriptionsLoaded);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f2036c;
                PhotoViewer photoViewer = ((it0) m0Var).f37976o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f2035b);
                return;
        }
    }

    public pb(rg.m0 m0Var, int i10) {
        this.f2036c = m0Var;
        this.f2035b = i10;
    }
}
