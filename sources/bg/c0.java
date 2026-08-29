package bg;

import android.content.DialogInterface;
import jh.d9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;
public final class c0 implements DialogInterface.OnDismissListener {
    public final int f2112a = 1;
    public final int f2113b;
    public final NotificationCenter.NotificationCenterDelegate f2114c;

    public c0(int i10, d9 d9Var) {
        this.f2113b = i10;
        this.f2114c = d9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2112a) {
            case 0:
                g1 g1Var = (g1) this.f2114c;
                PhotoViewer photoViewer = ((ws0) g1Var).f44369k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.D();
                }
                g1Var.B0(this.f2113b);
                return;
            default:
                NotificationCenter.getInstance(this.f2113b).removeObserver((d9) this.f2114c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public c0(g1 g1Var, int i10) {
        this.f2114c = g1Var;
        this.f2113b = i10;
    }
}
