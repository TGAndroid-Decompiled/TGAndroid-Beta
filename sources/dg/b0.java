package dg;

import android.content.DialogInterface;
import lh.e9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;
public final class b0 implements DialogInterface.OnDismissListener {
    public final int f4391a = 1;
    public final int f4392b;
    public final NotificationCenter.NotificationCenterDelegate f4393c;

    public b0(int i10, e9 e9Var) {
        this.f4392b = i10;
        this.f4393c = e9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4391a) {
            case 0:
                e1 e1Var = (e1) this.f4393c;
                PhotoViewer photoViewer = ((mt0) e1Var).f36200l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.C();
                }
                e1Var.B0(this.f4392b);
                return;
            default:
                NotificationCenter.getInstance(this.f4392b).removeObserver((e9) this.f4393c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public b0(e1 e1Var, int i10) {
        this.f4393c = e1Var;
        this.f4392b = i10;
    }
}
