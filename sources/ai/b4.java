package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ko0;
import org.telegram.ui.lp0;
public final class b4 implements Utilities.Callback2 {
    public final int f1027a;
    public final TL_stars.TL_starGiftUnique f1028b;
    public final long f1029c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f1030f;

    public b4(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f1027a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f1028b = tL_starGiftUnique;
        this.f1029c = j10;
        this.f1030f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f1027a) {
            case 0:
                l7 l7Var = (l7) this.d;
                yh.i0 i0Var = (yh.i0) this.f1030f;
                String str = (String) obj2;
                ((pf.c) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    n5 n5Var = l7Var.R0;
                    if (n5Var != null) {
                        if (i0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        n5Var.b(this.f1028b, this.f1029c, z10);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new f4(i0Var, 0));
                        l7Var.skipDismissAnimation();
                    }
                    l7Var.dismiss();
                    return;
                }
                return;
            default:
                lp0.U((lp0) this.d, (boolean[]) this.e, this.f1028b, this.f1029c, (ko0) this.f1030f, (i6) obj, (pf.c) obj2);
                return;
        }
    }
}
