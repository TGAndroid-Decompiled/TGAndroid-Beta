package hh;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

public final class x8 implements DialogInterface.OnDismissListener {

    public final int f10347a = 0;

    public final int f10348b;

    public final NotificationCenter.NotificationCenterDelegate f10349c;

    public x8(int i10, h9 h9Var) {
        this.f10348b = i10;
        this.f10349c = h9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10347a) {
            case 0:
                NotificationCenter.getInstance(this.f10348b).removeObserver((h9) this.f10349c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f10349c;
                PhotoViewer photoViewer = ((ys0) l0Var).f44893k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.D();
                }
                l0Var.B0(this.f10348b);
                break;
        }
    }

    public x8(zf.l0 l0Var, int i10) {
        this.f10349c = l0Var;
        this.f10348b = i10;
    }
}
